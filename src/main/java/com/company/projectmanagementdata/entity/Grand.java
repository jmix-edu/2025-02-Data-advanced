package com.company.projectmanagementdata.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.UUID;

@JmixEntity
@Table(name = "GRAND", indexes = {
        @Index(name = "IDX_GRAND_DAD1", columnList = "DAD1_ID"),
        @Index(name = "IDX_GRAND_", columnList = "")
})
@Entity
public class Grand {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DAD1_ID")
    private Dad dad1;
    @JoinColumn(name = "DAD2_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Dad dad2;

    public void setDad2(Dad dad2) {
        this.dad2 = dad2;
    }

    public Dad getDad2() {
        return dad2;
    }

    public Dad getDad1() {
        return dad1;
    }

    public void setDad1(Dad dad1) {
        this.dad1 = dad1;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}