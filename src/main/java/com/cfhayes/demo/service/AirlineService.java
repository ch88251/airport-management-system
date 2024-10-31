package com.cfhayes.demo.service;

import com.cfhayes.demo.controller.AirlineDto;
import com.cfhayes.demo.domain.Airline;

public class AirlineService {
    
    public static AirlineDto mapToDto(Airline airline) {
        return new AirlineDto(
            airline.getName(), 
            airline.getCode());
    }
}
