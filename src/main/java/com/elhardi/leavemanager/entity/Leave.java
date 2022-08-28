package com.elhardi.leavemanager.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class Leave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private java.sql.Date start;

    @Basic
    private java.sql.Date end;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "leave")
    private Demand demand;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_leave_id", referencedColumnName = "id")
    private TypeLeave typeLeave;
}
