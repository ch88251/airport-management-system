package com.cfhayes.demo.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

import com.cfhayes.demo.controller.FlightDto;
import com.cfhayes.demo.domain.Flight;
import com.cfhayes.demo.repository.FlightRepository;

@Slf4j
@ApplicationScoped
@Transactional
public class FlightService {

    @Inject
    FlightRepository flightRepository;

    public static FlightDto mapToDto(Flight flight) {
        return new FlightDto(
            flight.getFlightNumber(),
            flight.getAirlineId(),
            flight.getOriginAirportId(),
            flight.getDestinationAirportId(),
            flight.getDepartureTime(),
            flight.getArrivalTime(),
            flight.getStatus()
        );
    }

    public List<FlightDto> findAll() {
        return flightRepository.findAll().stream()
            .map(FlightService::mapToDto)
            .collect(Collectors.toList());
    }
}
