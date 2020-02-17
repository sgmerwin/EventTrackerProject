package com.skilldistillery.eventtracker.services;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.skilldistillery.eventtracker.entities.GasTracker;
import com.skilldistillery.eventtracker.repositories.GasRepository;

@Service
public class GasServiceImpl implements GasService {
	
	@Autowired
	private GasRepository repo;
	

	@Override
	public List<GasTracker> listAllGas() {
		// TODO Auto-generated method stub
		//System.err.println("inside listGas() service method" );
		
		return repo.findAll();
	}
	
	public Optional<GasTracker> listById(int id){
		if (repo.findById(id).isPresent()){
		return repo.findById(id);
		}
		else {
			return null;
		}
	}
	
	public GasTracker create(GasTracker gasTracker) {
		
		return repo.save(gasTracker);
	}
	
	 public Optional<GasTracker>  update(int id, GasTracker gasTracker) {

	        if (repo.findById(id).isPresent()){
	            GasTracker existingGasTracker = repo.findById(id).get();
	            existingGasTracker.setGallons(gasTracker.getGallons());
	            existingGasTracker.setTotalMilage(gasTracker.getTotalMilage());
	            existingGasTracker.setTotal_fuel_cost(gasTracker.getTotal_fuel_cost());
	            repo.save(existingGasTracker);
	            return repo.findById(id);
	        }else{
	            return null;
	        }	 
}
	 
	 public Boolean delete(int id) {
		 if (repo.findById(id).isPresent()){
			 repo.deleteById(id);
			 return true;
		 }
		 else {return false;}
		 }
	 
	 
}//class
