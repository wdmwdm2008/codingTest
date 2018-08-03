CREATE DATABASE  IF NOT EXISTS data;
USE data;
DROP TABLE IF EXISTS subtask;
CREATE TABLE subtask (
   subtask_id bigint(23) NOT NULL PRIMARY KEY,
   desc_subtask varchar(128) NOT NULL,
   subtask_manager varchar(32),
   goalNum int(10),
   completedNum int(10),
   comments varchar(10000),
   taskid bigint(23) unsigned not null,
   foreign key (taskid) references task(task_id) on delete cascade on update cascade
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES subtask WRITE;
INSERT INTO subtask VALUES (1531774851569, "this is subtask_1", "sd", 100, 10, "This is a good project1", 2531774851579);
INSERT INTO subtask VALUES (1531774851579, "this is subtask_2", "gadsd", 100, 40, "This is a good project1", 2531774851579);
INSERT INTO subtask VALUES (1531774851572, "this is subtask_1", "sadfa", 100, 20, "This is a good project1", 3531774851579);
INSERT INTO subtask VALUES (1531754851579, "this is subtask_3", "afsd", 100, 80, "This is a good project1", 3531774851579);
UNLOCK TABLES;