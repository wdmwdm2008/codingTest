package cn.org.ltl.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class Subtask implements Serializable {
    private long subtask_id;
    private String desc_subtask;
    private String subtask_manager;
    private int goalNum;
    private int completedNum;
    private String comments;
    private long taskid;

    public long getSubtask_id() {
        return subtask_id;
    }

    public void setSubtask_id(long subtask_id) {
        this.subtask_id = subtask_id;
    }

    public long getTaskid() {
        return taskid;
    }

    public void setTaskid(long taskid) {
        this.taskid = taskid;
    }

    public String getDesc_subtask() {
        return desc_subtask;
    }

    public void setDesc_subtask(String desc_subtask) {
        this.desc_subtask = desc_subtask;
    }

    public String getSubtask_manager() {
        return subtask_manager;
    }

    public void setSubtask_manager(String subtask_manager) {
        this.subtask_manager = subtask_manager;
    }

    public int getGoalNum() {
        return goalNum;
    }

    public void setGoalNum(int goalNum) {
        this.goalNum = goalNum;
    }

    public int getCompletedNum() {
        return completedNum;
    }

    public void setCompletedNum(int completedNum) {
        this.completedNum = completedNum;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Subtask{" +
                "subtask_id=" + subtask_id +
                ", desc_subtask='" + desc_subtask + '\'' +
                ", subtask_manager='" + subtask_manager + '\'' +
                ", goalNum=" + goalNum +
                ", completedNum=" + completedNum +
                ", comments='" + comments + '\'' +
                ", taskid=" + taskid +
                '}';
    }
}
