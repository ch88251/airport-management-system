package com.cfhayes.ams.airline.web;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.GET;

import com.cfhayes.ams.airline.domain.AirlineDto;

@Path("/airlines")
public class AirlineResource {

  @GET
  public List<AirlineDto> list() {
    AirlineDto dto = new AirlineDto();
    List<AirlineDto> airlineList = new ArrayList<>();
    airlineList.add(dto);
    return airlineList;
  }
}
