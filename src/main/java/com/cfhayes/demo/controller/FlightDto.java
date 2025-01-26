package com.cfhayes.demo.controller;

import java.time.Instant;

import com.cfhayes.demo.domain.FlightStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightDto {
    private String flightNumber;
    private Long airlineId;
    private Long originAirportId;
    private Long destinationAirportId;
    private Instant departureTime;
    private Instant arrivalTime;
    private FlightStatus status;
}
