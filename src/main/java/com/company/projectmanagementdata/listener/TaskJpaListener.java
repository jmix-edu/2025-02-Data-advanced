package com.company.projectmanagementdata.listener;

import com.company.projectmanagementdata.entity.Task;
import jakarta.persistence.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TaskJpaListener {

    private final static Logger log = LoggerFactory.getLogger(TaskJpaListener.class);

    @PreUpdate
    @PrePersist
    @PreRemove
    public void beforeUpdate(Task task) {
        log.info("{} before update: {}", task.getClass().getSimpleName(), task.getId());
    }

    @PostUpdate
    @PostPersist
    @PostRemove
    public void afterUpdate(Task task) {
        log.info("{} after update: {}", task.getClass().getSimpleName(), task.getId());
    }
}
