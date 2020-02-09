package com.skilldistillery.eventtracker.services;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.skilldistillery.eventtracker.entities.GasTracker;

public interface GasService {

	List<GasTracker> listAllGas();
	
	Optional<GasTracker> listById(int id);
	
	public GasTracker create(GasTracker gasTracker);
	
	public Optional<GasTracker> update(int id, GasTracker gasTracker);
	
	public Boolean delete(int id);
}
