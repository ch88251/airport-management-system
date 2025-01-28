package com.cfhayes.ams.airline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cfhayes.ams.airline.domain.Airline;

@Repository
public interface AirlineRepository extends JpaRepository<Airline, Long> {
  List<Airline> findAllByStatus(String status);
}
