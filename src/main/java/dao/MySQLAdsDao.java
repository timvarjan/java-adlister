package dao;

import com.mysql.cj.jdbc.Driver;
import dao.Ads;
import dao.Config;
import models.Ad;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao(Config config) {
        try {
            System.out.println("Creating connection...");
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Ad> all() {
        // 1. make a new List
        List<Ad> ads = new ArrayList<>();

        try {
            // 2. make a statement
            Statement st = connection.createStatement();

            // 3. execute the statement getting a resultset
            ResultSet adData = st.executeQuery("select * from ads order by id");

            // 4. iterate over the resultset
            while(adData.next()) {
                // 5. for each row, make an ad object
                Ad ad = new Ad(
                        adData.getLong("id")
                        , (int) adData.getLong("user_id")
                        , adData.getString("title")
                        , adData.getString("description")
                );

                // 6. add the ad object to the list
                ads.add(ad);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // 7. return the list
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        Long newId;

        try {
            // 1. make a statement
            Statement st = connection.createStatement();

            // 2. execute the insert
            String sql = "insert into ads "
                    + " (user_id, title, description) "
                    + " values (" + ad.getUserId()
                    + " , '" + ad.getTitle() + "'"
                    + " , '" + ad.getDescription() + "')";
            st.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);

            // 3. get the id of the newly inserted record
            ResultSet keys = st.getGeneratedKeys();
            keys.next();
            newId = keys.getLong(1);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // 4. return the id
        return newId;
    }
}

