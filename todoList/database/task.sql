CREATE DATABASE  IF NOT EXISTS data;
USE data;
DROP TABLE IF EXISTS task;
CREATE TABLE task (
   task_id bigint(23) unsigned NOT NULL PRIMARY KEY,
   desc_task varchar(128) NOT NULL,
   task_manager varchar(32),
   due_date datetime not null
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES task WRITE;
INSERT INTO task VALUES (1431774851569, "this is task_3", "wdm3", "2017-08-26 20:11:42");
INSERT INTO task VALUES (2531774851579, "this is task_1", "wdm1", "2017-11-26 20:11:42");
INSERT INTO task VALUES (3531774851579, "this is task_2", "wdm2", "2017-12-26 20:11:42");
UNLOCK TABLES;