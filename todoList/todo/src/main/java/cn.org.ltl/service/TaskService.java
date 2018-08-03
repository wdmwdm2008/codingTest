package cn.org.ltl.service;

import cn.org.ltl.entity.Task;
import cn.org.ltl.util.TaskResult;

import java.sql.Timestamp;
import java.util.List;

public interface TaskService {
    public TaskResult<String> addTask(long id, String desc_task, String task_manager, Timestamp due_date);
    public TaskResult<String> addSubtask(long id, String desc_subtask, String subtask_manager, int goalNum, int completedNum, String comments, long taskid);
    public TaskResult<List<Task>> checkTasks();
    public TaskResult<String> deleteTask(long id);
    public TaskResult<String> reviseTask(long id, String desc_task, String task_manager, Timestamp due_date);
    public TaskResult<String> reviseSubtask(long id, String desc_subtask, String subtask_manager, int goalNum, int completedNum, String comments);

}
