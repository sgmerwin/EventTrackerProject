package com.skilldistillery.eventtracker.controllers;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.eventtracker.entities.GasTracker;
import com.skilldistillery.eventtracker.services.GasService;

@RestController
@RequestMapping("api")
public class GasController {
	
	@Autowired
	private GasService svc;
	
	@GetMapping("ping")
	public String pingPong() {
		return "pong";
	}
	
	@GetMapping("gas")
	public List<GasTracker> listGas() {
		//System.err.println("inside listGas() controller method" );
		return  svc.listAllGas();
	}
	
	@GetMapping("gasID/{id}")
	public Optional<GasTracker> listById(@PathVariable("id") int id){
		return svc.listById(id);
	}
	
	@PostMapping("create")
	public GasTracker create(@RequestBody GasTracker gasTracker){
	    return svc.create(gasTracker);
	}
	
	@PutMapping(value = "update/{id}")
	public Optional<GasTracker> update(@PathVariable("id") int id, @RequestBody GasTracker gasTracker){
	    return svc.update(id, gasTracker);
	}
	
	@DeleteMapping(value = "delete/{id}")
	public Boolean delete(@PathVariable("id") int id) {
		return svc.delete(id).booleanValue();
	}
}
