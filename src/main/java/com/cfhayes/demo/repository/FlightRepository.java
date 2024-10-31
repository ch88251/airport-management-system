package com.cfhayes.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cfhayes.demo.domain.Flight;


@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    List<Flight> findAll();
}
