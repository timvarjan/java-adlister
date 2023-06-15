package data;

import lombok.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Album implements Serializable {
    private int id;
    private String artist;
    private String album;
    private Date release_date;
    private String genre;
    private Double sales;


}

