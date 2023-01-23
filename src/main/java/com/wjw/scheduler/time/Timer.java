package com.wjw.scheduler.time;

import com.wjw.scheduler.Task;

import java.util.List;


public interface Timer {
    boolean isCompleted();
    int getDeferredTaskNum();
    List<Task> getAllTask();
    Task getTask();
}
