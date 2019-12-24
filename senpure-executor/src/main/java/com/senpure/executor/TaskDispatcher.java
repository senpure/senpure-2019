package com.senpure.executor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * TaskDispatcher
 *
 * @author senpure
 * @time 2019-12-24 15:25:01
 */
public class TaskDispatcher {
    private TaskLoopGroup taskLoopGroup;


    private Map<Long, TaskLoop> taskLoopMap = new ConcurrentHashMap<>(1024);

    public TaskDispatcher(TaskLoopGroup taskLoopGroup) {
        this.taskLoopGroup = taskLoopGroup;
    }


    public TaskLoopGroup getTaskLoopGroup() {
        return taskLoopGroup;
    }

    public TaskLoop get(long id) {
        return taskLoopMap.get(id);
    }

    public TaskLoop getOrPut(long id) {
        TaskLoop taskLoop = taskLoopMap.get(id);
        if (taskLoop == null) {
            taskLoop = taskLoopMap.computeIfAbsent(id, key -> taskLoopGroup.next());
        }
        return taskLoop;
    }

}
