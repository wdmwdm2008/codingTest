package cn.org.ltl.service;

import cn.org.ltl.dao.TaskDao;
import cn.org.ltl.entity.Task;
import cn.org.ltl.util.TaskResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@Service("taskServiceImpl")
public class TaskServiceImpl implements TaskService{

    @Resource
    TaskDao taskDao;
    TaskResult<String> result = new TaskResult<String>();
    TaskResult<List<Task>> checkResult = new TaskResult<List<Task>>();
    @Override
    public TaskResult<String> addTask(long id, String desc_task, String task_manager, Timestamp due_date) {
        try{
            taskDao.addTask(id, desc_task, task_manager, due_date);
            result.setStatus(1);
            result.setMsg("Adding task success!");
            String data = null;
            result.setData(data);
            return result;
        } catch (Exception e){
            e.printStackTrace();
            result.setStatus(0);
            result.setMsg("Adding task fail!");
            return result;
        }
    }

    @Override
    public TaskResult<String> addSubtask(long id, String desc_subtask, String subtask_manager, int goalNum, int completedNum, String comments, long taskid) {
        try{
            taskDao.addSubtask(id, desc_subtask, subtask_manager, goalNum, completedNum, comments, taskid);
            result.setStatus(1);
            result.setMsg("Adding task success!");
            String data = null;
            result.setData(data);
            return result;
        } catch (Exception e){
            e.printStackTrace();
            result.setStatus(0);
            result.setMsg("Adding task fail!");
            return result;
        }
    }

    @Override
    public TaskResult<List<Task>> checkTasks() {
        try{
            checkResult.setStatus(1);
            checkResult.setMsg("Adding task success!");
            checkResult.setData(taskDao.checkTasks());
            return checkResult;
        } catch (Exception e){
            e.printStackTrace();
            checkResult.setStatus(0);
            checkResult.setMsg("Adding task fail!");
            return checkResult;
        }
    }

    @Override
    public TaskResult<String> deleteTask(long id) {
        try{
            taskDao.deleteTask(id);
            taskDao.deleteSubtask(id);
            result.setStatus(1);
            result.setMsg("Adding task success!");
            String data = null;
            result.setData(data);
            return result;
        } catch (Exception e){
            e.printStackTrace();
            result.setStatus(0);
            result.setMsg("Adding task fail!");
            return result;
        }
    }

    @Override
    public TaskResult<String> reviseTask(long id, String desc_task, String task_manager, Timestamp due_date) {
        try{
            taskDao.reviseTask(id, desc_task, task_manager, due_date);
            result.setStatus(1);
            result.setMsg("Revising task success!");
            String data = null;
            result.setData(data);
            return result;
        } catch (Exception e){
            e.printStackTrace();
            result.setStatus(0);
            result.setMsg("Revising task fail!");
            return result;
        }
    }

    @Override
    public TaskResult<String> reviseSubtask(long id, String desc_subtask, String subtask_manager, int goalNum, int completedNum, String comments) {
        try{
            taskDao.reviseSubtask(id, desc_subtask, subtask_manager, goalNum, completedNum, comments);
            result.setStatus(1);
            result.setMsg("Adding task success!");
            String data = null;
            result.setData(data);
            return result;
        } catch (Exception e){
            e.printStackTrace();
            result.setStatus(0);
            result.setMsg("Adding task fail!");
            return result;
        }
    }
}
