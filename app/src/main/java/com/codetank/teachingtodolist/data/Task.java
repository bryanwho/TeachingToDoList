package com.codetank.teachingtodolist.data;

/**
 * Created by bryan on 5/17/16.
 */
public class Task {

    private String taskTitle;
    private String task;

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Task(String task, String taskTitle) {
        this.task = task;
        this.taskTitle = taskTitle;
    }



}
