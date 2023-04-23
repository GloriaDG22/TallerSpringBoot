CREATE TABLE IF NOT EXISTS `USERS` (
    `id`         INTEGER  PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(20) NOT NULL,
    `birthdate`        date NOT NULL
);


INSERT INTO `USERS` (`id`,`name`,`birthdate`) VALUES (0,'Fran','1994-09-28');
INSERT INTO `USERS` (`id`,`name`,`birthdate`) VALUES (1,'Ana','1994-09-12');
INSERT INTO `USERS` (`id`,`name`,`birthdate`) VALUES (2,'Gloria','1999-06-24');

SELECT * FROM `USERS`;
