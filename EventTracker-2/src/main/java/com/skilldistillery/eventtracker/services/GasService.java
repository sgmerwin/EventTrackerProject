package com.skilldistillery.eventtracker.services;

import java.util.List;

import com.skilldistillery.eventtracker.entities.GasTracker;

public interface GasService {

	List<GasTracker> listAllGas();
}
