package com.company.projectmanagementdata.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.UUID;

@JmixEntity
@Table(name = "DAD", indexes = {
        @Index(name = "IDX_DAD_SON1", columnList = "SON1_ID"),
        @Index(name = "IDX_DAD_SON2", columnList = "SON2_ID")
})
@Entity
public class Dad {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @JoinColumn(name = "SON1_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Son son1;
    @JoinColumn(name = "SON2_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Son son2;

    public Son getSon2() {
        return son2;
    }

    public void setSon2(Son son2) {
        this.son2 = son2;
    }

    public Son getSon1() {
        return son1;
    }

    public void setSon1(Son son1) {
        this.son1 = son1;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}