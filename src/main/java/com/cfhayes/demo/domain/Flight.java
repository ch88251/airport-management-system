package com.cfhayes.demo.domain;

import java.time.Instant;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;

import com.cfhayes.demo.domain.enums.FlightStatus;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "flights")
public class Flight extends AbstractEntity {

    @Column(name = "flight_number", nullable = false)
    private String flightNumber;

    @Column(name = "airline_code", nullable = false)
    private String airline_code;

    @Column(name = "origin", nullable = false)
    private String originCode;

    @Column(name = "destination", nullable = false)
    private String destinationCode;

    @Column(name = "departure_time")
    private Instant departureTime;

    @Column(name = "arrival_time")
    private Instant arrivalTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private FlightStatus status;

}
