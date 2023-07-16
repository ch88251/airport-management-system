package com.cfhayes.demo.domain;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.time.Instant;

public class AuditingEntityListener {

    @PrePersist
    void preCreate(AbstractEntity auditable) {
        Instant now = Instant.now();
        auditable.setDateCreated(now);
        auditable.setDateUpdated(now);
    }

    @PreUpdate
    void preUpdate(AbstractEntity auditable) {
        Instant now = Instant.now();
        auditable.setDateUpdated(now);
    }
}
