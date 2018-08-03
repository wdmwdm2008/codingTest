package cn.org.ltl.controller;

import cn.org.ltl.entity.Task;
import cn.org.ltl.service.TaskService;
import cn.org.ltl.util.TaskResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;


@Controller("taskController")
@RequestMapping("/task")
public class TaskController {

    @Resource
    TaskService taskService;


    @RequestMapping("/addTask")
    @ResponseBody
    public TaskResult<String> addTask(long id, String desc_task, String task_manager, Timestamp due_date){
        return taskService.addTask(id, desc_task, task_manager, due_date);
    }

    @RequestMapping("/addSubTask")
    @ResponseBody
    public TaskResult<String> addSubtask(long id, String desc_subtask, String subtask_manager, int goalNum, int completedNum, String comments, long taskid){
        return taskService.addSubtask(id, desc_subtask, subtask_manager, goalNum, completedNum, comments, taskid);
    }

    @RequestMapping("/checkTask")
    @ResponseBody
    public TaskResult<List<Task>> checkTasks(){
        return taskService.checkTasks();
    }

    @RequestMapping("/deleteTask")
    @ResponseBody
    public TaskResult<String> deleteTask(long id){
        return taskService.deleteTask(id);
    }

    @RequestMapping("/reviseTask")
    @ResponseBody
    public TaskResult<String> reviseTask(long id, String desc_task, String task_manager, Timestamp due_date){
        System.out.println(6);
        return taskService.reviseTask(id, desc_task, task_manager, due_date);
    }

    @RequestMapping("/reviseSubtask")
    @ResponseBody
    public TaskResult<String> reviseSubtask(long id, String desc_subtask, String subtask_manager, int goalNum, int completedNum, String comments){
        System.out.println(56);
        return taskService.reviseSubtask(id, desc_subtask, subtask_manager, goalNum, completedNum, comments);
    }
}
