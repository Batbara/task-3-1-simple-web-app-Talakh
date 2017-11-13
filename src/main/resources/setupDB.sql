CREATE DATABASE  IF NOT EXISTS `users`;
USE `users`;
CREATE USER IF NOT EXISTS 'training'@'localhost' IDENTIFIED BY 'epam';
GRANT SELECT,INSERT,UPDATE,DELETE,CREATE,DROP ON users.* TO 'training'@'localhost';

DROP TABLE IF EXISTS `usertable`;

CREATE TABLE `usertable` (
  `userID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `surname` varchar(45) NOT NULL,
  `phoneNumber` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;



INSERT INTO `usertable` VALUES
 (1,'Ivan','Ivanov','+1-417-555-0172','ivanov@gmail.com'),
 (2,'Petr','Sidorov','+1-417-555-0105','psidorov@gmail.com'),
 (3,'Mariya','Kozlova','+1-417-555-0100','kozlova.masha@mail.ru'),
 (4,'Darya','Zhukova','+1-417-555-0121','daryazhukova1991@gmail.com'),
 (5,'Alexandr','Petrov','+1-417-555-1309','alex.petrov@yandex.ru'),
 (6,'Irina','Sokolova','+1-417-555-0437','irina.sokolova@gmail.com'),
 (7,'Ivan','Ivanov','+1-417-555-0881','vanya_ivan@mail.ru');
