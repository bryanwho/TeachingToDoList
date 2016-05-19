package com.codetank.teachingtodolist.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by bryan on 5/17/16.
 */
public class Task implements Parcelable{

    public static final String TASKS_ROUTE = "tasks/";

    private String taskTitle;
    private String task;
    private String postRef;

    public Task() {}

    public Task(String task, String taskTitle, String postRef) {
        this.task = task;
        this.taskTitle = taskTitle;
        this.postRef = postRef;
    }

    public Task(String task, String taskTitle) {
        this(task, taskTitle, "");
    }

    public String getPostRef() {
        return postRef;
    }

    public void setPostRef(String postRef) {
        this.postRef = postRef;
    }

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

        protected Task(Parcel in) {
            taskTitle = in.readString();
            task = in.readString();
            postRef = in.readString();
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(taskTitle);
            dest.writeString(task);
            dest.writeString(postRef);
        }

        @SuppressWarnings("unused")
        public static final Parcelable.Creator<Task> CREATOR = new Parcelable.Creator<Task>() {
            @Override
            public Task createFromParcel(Parcel in) {
                return new Task(in);
            }

            @Override
            public Task[] newArray(int size) {
                return new Task[size];
            }
        };


}
