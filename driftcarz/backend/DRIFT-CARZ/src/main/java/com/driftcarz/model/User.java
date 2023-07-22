package com.driftcarz.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column(length = 20)
    private String fullName;
    @Column(length = 16)
    private String password;
    private Character isAdmin;
    @Column(length = 13, unique = true)
    private String mobileNumber;
    @Column(length = 40, unique = true)
    private String emailId;
}
