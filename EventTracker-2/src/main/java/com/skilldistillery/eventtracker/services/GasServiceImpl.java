package com.skilldistillery.eventtracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skilldistillery.eventtracker.entities.GasTracker;
import com.skilldistillery.eventtracker.repositories.GasRepository;

@Service
public class GasServiceImpl implements GasService {
	
	@Autowired
	private GasRepository repo;

	@Override
	public List<GasTracker> listAllGas() {
		// TODO Auto-generated method stub
		System.err.println("inside listGas() service method" );

		return repo.findAll();
	}

}
