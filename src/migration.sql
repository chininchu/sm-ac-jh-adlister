USE adlister_db;


CREATE TABLE users
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    email    VARCHAR(100)       NOT NULL,
    password VARCHAR(255)       NOT NULL
--                        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);



CREATE TABLE ads
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    user_id     INT          NOT NULL,
    title       VARCHAR(100) NOT NULL,
    description TEXT,
--                      price DECIMAL(10, 2) NOT NULL,
--                      created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users (id)
);



-- CREATE TABLE categories (
--                             id INT AUTO_INCREMENT PRIMARY KEY,
--                             name VARCHAR(50) NOT NULL
-- );
--
--
--
-- CREATE TABLE ad_category (
--                              ad_id INT NOT NULL,
--                              category_id INT NOT NULL,
--                              FOREIGN KEY (ad_id) REFERENCES ads(id),
--                              FOREIGN KEY (category_id) REFERENCES categories(id),
--                              PRIMARY KEY (ad_id, category_id)
-- );










