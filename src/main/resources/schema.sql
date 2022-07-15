DROP TABLE IF EXISTS `users`;

--CREATE
CREATE TABLE `users`
(
    `id`               bigint       NOT NULL AUTO_INCREMENT,
    `name`             varchar(255) NOT NULL,
    `password`         varchar(255) NOT NULL,
    `email`            varchar(255) NOT NULL,
    `age`              bigint       NOT NULL,
    PRIMARY KEY (`id`)
);

--INSERT
INSERT INTO `users` (`name`,`password`,`email`,`age`)
VALUES ('somebody', 'something', 'lol@mail.hu',34);