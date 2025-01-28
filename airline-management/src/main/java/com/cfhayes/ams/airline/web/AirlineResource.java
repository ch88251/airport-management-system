package com.cfhayes.ams.airline.web;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.GET;
import jakarta.inject.Inject;

import com.cfhayes.ams.airline.domain.AirlineDto;
import com.cfhayes.ams.airline.service.AirlineService;

@Path("/airlines")
public class AirlineResource {

  @Inject
  AirlineService airlineService;

  @GET
  public List<AirlineDto> list() {
    return airlineService.findAll();
  }
}
