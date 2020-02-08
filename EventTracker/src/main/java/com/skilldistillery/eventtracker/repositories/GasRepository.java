package com.skilldistillery.eventtracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.eventtracker.entities.GasTracker;

public interface GasRepository extends JpaRepository<GasTracker, Integer> {

}
