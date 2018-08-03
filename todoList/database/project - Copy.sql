CREATE DATABSE IF NOT EXISTS 'todoList';
USE 'todoList';
DROP TABLE IF EXISTS 'task';
CREATE TABLE 'task'(
	'id' int(11) unsigned NOT NULL AUTO_INCREMENT,
	'project_id' int(11),
	'task_name' varchar(128) NOT NULL,
	'begin_time' datetime NOT NULL,
	'end_time' datetime NOT NULL,
	'task_comments' varchar(40000)
) DEFAULT CHARSET=utf-8;


LOCK TABLES 'task' WRITE;

UNLOCK TABLES;