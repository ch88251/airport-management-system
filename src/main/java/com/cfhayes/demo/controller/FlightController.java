package com.cfhayes.demo.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

import com.cfhayes.demo.service.FlightService;

import jakarta.inject.Inject;

@Path("/flights")
public class FlightController {

    @Inject
    FlightService flightService;

    @GET
    public List<FlightDto> findAll() {
        return flightService.findAll();
    }
}
