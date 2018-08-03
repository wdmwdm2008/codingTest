package cn.org.ltl.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class Task implements Serializable {
    private long task_id;
    private String desc_task;
    private String task_manager;
    private Timestamp due_date;
    private List<Subtask> subtasks;

    public long getTask_id() {
        return task_id;
    }

    public void setTask_id(long task_id) {
        this.task_id = task_id;
    }

    public String getDesc_task() {
        return desc_task;
    }

    public void setDesc_task(String desc_task) {
        this.desc_task = desc_task;
    }

    public String getTask_manager() {
        return task_manager;
    }

    public void setTask_manager(String task_manager) {
        this.task_manager = task_manager;
    }

    public Timestamp getDue_date() {
        return due_date;
    }

    public void setDue_date(Timestamp due_date) {
        this.due_date = due_date;
    }

    public List<Subtask> getSubtasks() {
        return subtasks;
    }

    public void setSubtasks(List<Subtask> subtasks) {
        this.subtasks = subtasks;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task_id=" + task_id +
                ", desc_task='" + desc_task + '\'' +
                ", task_manager='" + task_manager + '\'' +
                ", due_date=" + due_date +
                ", subtasks=" + subtasks +
                '}';
    }
}
