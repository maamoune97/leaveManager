package com.elhardi.leavemanager.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fName;

    private String lName;

    private String email;

    private String password;

    private String phoneNumber;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "applicant")
    private List<Request> requests;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_role_id", referencedColumnName = "id")
    private UserRole userRole;

}
