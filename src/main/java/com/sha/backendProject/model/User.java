package com.sha.backendProject.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "identification", unique = true, nullable = false, length = 100)
    private String identification;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "name", nullable = false)
    private  String name;

    @Column(name = "surname", nullable = false)
    private  String surname;

    @Column(name = "secondSurname", nullable = false)
    private  String secondSurname;

    @Column(name = "email")
    private  String email;

    @Column(name = "cellphone")
    private String cellphone;

    @Transient
    private LocalDateTime createTime;

    @OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "business_id", referencedColumnName = "id")
    private Set<Business> businesses = new HashSet<>();


    //role
    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    @Transient //no persistence, it won't be o the db
    private String token;
}
