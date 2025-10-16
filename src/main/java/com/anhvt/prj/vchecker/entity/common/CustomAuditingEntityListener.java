package com.anhvt.prj.vchecker.entity.common;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicLong;

public class CustomAuditingEntityListener {

    private static final AtomicLong counter = new AtomicLong();

    @PrePersist
    public void setCreatedDate(AbstractAuditingEntity<?> entity) {
        long uniqueTime = Instant.now().toEpochMilli() + counter.incrementAndGet();
        entity.setRegDate(Instant.ofEpochMilli(uniqueTime).plus(Duration.ofHours(7)));
        entity.setModifyDate(Instant.ofEpochMilli(uniqueTime).plus(Duration.ofHours(7)));
    }

    @PreUpdate
    public void setModifiedDate(AbstractAuditingEntity<?> entity) {
        long uniqueTime = Instant.now().toEpochMilli() + counter.incrementAndGet();
        entity.setModifyDate(Instant.ofEpochMilli(uniqueTime).plus(Duration.ofHours(7)));
    }

}