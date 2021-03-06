package com.o4codes.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class TaskTimeline {
    private int taskId, taskTimeSpent;
    private LocalDate executionDate;
    private LocalTime executionTime;

    public TaskTimeline(int taskId, int taskTimeSpent, LocalDate executionDate, LocalTime executionTime) {
        this.taskId = taskId;
        this.taskTimeSpent = taskTimeSpent;
        this.executionDate = executionDate;
        this.executionTime = executionTime;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getTaskTimeSpent() {
        return taskTimeSpent;
    }

    public void setTaskTimeSpent(int taskTimeSpent) {
        this.taskTimeSpent = taskTimeSpent;
    }

    public LocalDate getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(LocalDate executionDate) {
        this.executionDate = executionDate;
    }

    public LocalTime getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(LocalTime executionTime) {
        this.executionTime = executionTime;
    }
}
