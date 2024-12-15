package com.example.administration.entity;

import jakarta.persistence.*;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "tbluser")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", unique = true)
    int id;

    @Column(name = "user_name", unique = true, columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_ci")
    String username;

    @Column(name = "user_pass")
    String password;

    @Column(name = "user_fullname")
    String fullname;

    @Column(name = "user_birthday")
    String birthday;

    @Column(name = "user_mobilephone")
    String mobilephone;

    @Column(name = "user_email")
    String email;

    @Column(name = "user_address")
    String address;

    @Column(name = "user_job")
    String job;

    @Column(name = "user_position")
    String position;
}
