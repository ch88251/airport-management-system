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
@Entity(name = "airlines")
public class Airline extends AbstractEntity {

    @Column(name = "airline_name")
    private String name;

    @Column(name = "airline_code")
    private String code;

}
