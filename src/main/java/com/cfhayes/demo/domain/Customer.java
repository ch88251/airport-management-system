package com.cfhayes.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name = "customers")
public class Customer extends AbstractEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "enabled", nullable = false)
    private Boolean enabled;

}
