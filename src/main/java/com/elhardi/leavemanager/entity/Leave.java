package com.elhardi.leavemanager.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Leave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date start;

    private Date end;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "leave")
    private Request request;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_leave_id", referencedColumnName = "id")
    private TypeLeave typeLeave;
}
