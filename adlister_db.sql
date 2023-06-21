CREATE TABLE users (
                       id INT PRIMARY KEY,
                       username VARCHAR(255),
                       email VARCHAR(255),
                       password VARCHAR(255)
);

CREATE TABLE ads (
                     id INT PRIMARY KEY,
                     user_id INT,
                     title VARCHAR(255),
                     description TEXT,
                     FOREIGN KEY (user_id) REFERENCES users(id)
);