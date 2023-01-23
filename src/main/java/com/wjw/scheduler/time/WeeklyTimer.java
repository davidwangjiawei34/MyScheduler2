package com.wjw.scheduler.time;

import com.wjw.scheduler.Task;

import java.time.temporal.ChronoUnit;
import java.util.List;

public class WeeklyTimer implements Timer{
    private static final ChronoUnit timeUnit = ChronoUnit.WEEKS;
    @Override
    public boolean isCompleted() {
        return false;
    }

    @Override
    public int getDeferredTaskNum() {
        return 0;
    }

    @Override
    public List<Task> getAllTask() {
        return null;
    }

    @Override
    public Task getTask() {
        return null;
    }
}
