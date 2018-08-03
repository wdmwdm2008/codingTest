package cn.org.ltl.dao;

import cn.org.ltl.entity.Task;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository("taskDao")
public interface TaskDao {
    public void addTask(long id, String desc_task, String task_manager, Timestamp due_date);
    public void addSubtask(long id, String desc_subtask, String subtask_manager, int goalNum, int completedNum, String comments, long taskid);
    public List<Task> checkTasks();
    public void deleteTask(long id);
    public void deleteSubtask(long id);
    public void reviseTask(long id, String desc_task, String task_manager, Timestamp due_date);
    public void reviseSubtask(long id, String desc_subtask, String subtask_manager, int goalNum, int completedNum, String comments);
}
