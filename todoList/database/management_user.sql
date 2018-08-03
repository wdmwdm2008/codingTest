CREATE DATABASE IF NOT EXISTS 'management';
USE 'management';
DROP TABLE IF EXISTS 'user';
CREATE TABLE 'user'(
	'id' int(11) unsigned NOT NULL AUTO_INCREMENT,
	'name' varchar(32) NOT NULL,
	'password' varchar(32) NOT NULL,
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


LOCK TABLES 'user' WRITE;

INSERT INTO TABLE (name, password) VALUES (zhangsan, 345);
INSERT INTO TABLE (name, password) VALUES (lisi, gg5);

UNLOCK TABLES;