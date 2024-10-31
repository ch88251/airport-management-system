package com.cfhayes.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;


@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "airports")
public class Airport extends AbstractEntity {

    @Column(name = "airport_name")
    private String name;

    @Column(name = "airport_code")
    private String code;

}
