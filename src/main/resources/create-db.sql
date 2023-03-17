DROP DATABASE IF EXISTS webshopexercise;
CREATE SCHEMA webshopexercise;
DROP TABLE IF EXISTS products;
CREATE TABLE webshopexercise.products (
                                          `id` INT NOT NULL AUTO_INCREMENT,
                                          `name` VARCHAR(30) NOT NULL,
                                          `price` DECIMAL(13,2) NULL,
                                          PRIMARY KEY (`id`));
INSERT INTO `webshopexercise`.`products` (`name`, `price`) VALUES ('Tuborg', '25');
INSERT INTO `webshopexercise`.`products` (`name`, `price`) VALUES ('Carlsberg', '25');