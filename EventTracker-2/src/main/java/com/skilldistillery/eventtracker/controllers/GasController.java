package com.skilldistillery.eventtracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
		System.err.println("inside listGas() controller method" );
		return  svc.listAllGas();
	}

}
