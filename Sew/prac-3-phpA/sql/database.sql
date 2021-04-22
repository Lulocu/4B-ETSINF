DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
    `id` INTEGER PRIMARY KEY,
    `name` VARCHAR(60) NOT NULL,
    `user` VARCHAR(30) NOT NULL,
    `password` VARCHAR(60) NOT NULL,
    `created_at` INTEGER NOT NULL
);
DROP TABLE IF EXISTS `blogs`;
CREATE TABLE `blogs` (
    `id` INTEGER PRIMARY KEY,
    `user_id` VARCHAR(60) NOT NULL,
    `title` VARCHAR(30) NOT NULL,
    `created_at` INTEGER NOT NULL
);
DROP TABLE IF EXISTS `entries`;
CREATE TABLE `entries` (
    `id` INTEGER PRIMARY KEY,
    `blog_id` INTEGER NOT NULL,
    `title` VARCHAR(30) NOT NULL,
    `contents` VARCHAR(40) NOT NULL,
    `created_at` INTEGER NOT NULL
);
DROP TABLE IF EXISTS `comments`;
CREATE TABLE `comments` (
    `id` INTEGER PRIMARY KEY,
    `entry_id` VARCHAR(60) NOT NULL,
    `user_id` VARCHAR(60) NOT NULL,
    `contents` VARCHAR(40) NOT NULL,
    `created_at` INTEGER NOT NULL
);
INSERT INTO users(id,name,user,password,created_at)
    VALUES(1,"admin","admin","21232f297a57a5a743894a0e4a801fc3",1616250771);