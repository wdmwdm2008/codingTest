CREATE DATABSE IF NOT EXISTS 'todoList';
USE 'todoList';
DROP TABLE IF EXISTS 'project';
CREATE TABLE 'project'(
	'id' int(11) unsigned NOT NULL AUTO_INCREMENT,
	'user_id' int(11),
	'project_name' varchar(128) NOT NULL,
	'project_comments' varchar(40000),
	PRIMARY KEY ('id')
) DEFAULT CHARSET=utf-8;

LOCK TABLES 'project' WRITE;

UNLOCK TABLES;