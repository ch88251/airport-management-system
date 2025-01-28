package com.cfhayes.ams.airline.service;

import java.util.List;
import java.util.stream.Collectors;

import com.cfhayes.ams.airline.domain.Airline;
import com.cfhayes.ams.airline.domain.AirlineDto;
import com.cfhayes.ams.airline.repository.AirlineRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class AirlineService {
  
  @Inject
  AirlineRepository airlineRepository;

  public static AirlineDto mapToDto(Airline airline) {
    return new AirlineDto(
      airline.getId(),
      airline.getName(),
      airline.getIcaoCode(),
      airline.getStatus());
  }

  public List<AirlineDto> findAll() {
    return this.airlineRepository.findAll()
                .stream()
                .map(AirlineService::mapToDto)
                .collect(Collectors.toList());
    }
}
