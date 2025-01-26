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

import com.cfhayes.demo.domain.FlightStatus;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "flights")
public class Flight extends AbstractEntity {

    @Column(name = "flight_number", nullable = false)
    private String flightNumber;

    @Column(name = "airline_id", nullable = false)
    private Long airlineId;

    @Column(name = "origin_airport_id", nullable = false)
    private Long originAirportId;

    @Column(name = "destination_airport_id", nullable = false)
    private Long destinationAirportId;

    @Column(name = "departure_time")
    private Instant departureTime;

    @Column(name = "arrival_time")
    private Instant arrivalTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private FlightStatus status;

}
