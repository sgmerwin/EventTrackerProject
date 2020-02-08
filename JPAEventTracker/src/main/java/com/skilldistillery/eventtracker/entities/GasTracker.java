package com.skilldistillery.eventtracker.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GasTracker {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	
	@Column(name = "total_milage")
	private Double totalMilage;
	
	@Column(name = "gallons")
	private Double gallons;
	
	@Column(name = "total_fuel_cost")
	private Double total_fuel_cost;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getTotalMilage() {
		return totalMilage;
	}

	public void setTotalMilage(Double totalMilage) {
		this.totalMilage = totalMilage;
	}

	@Override
	public String toString() {
		return "GasTracker [id=" + id + ", totalMilage=" + totalMilage + ", gallons=" + gallons + ", total_fuel_cost="
				+ total_fuel_cost + "]";
	}

	public Double getGallons() {
		return gallons;
	}

	public void setGallons(Double gallons) {
		this.gallons = gallons;
	}

	public Double getTotal_fuel_cost() {
		return total_fuel_cost;
	}

	public void setTotal_fuel_cost(Double total_fuel_cost) {
		this.total_fuel_cost = total_fuel_cost;
	}

	public GasTracker(Integer id, Double totalMilage, Double gallons, Double total_fuel_cost) {
		super();
		this.id = id;
		this.totalMilage = totalMilage;
		this.gallons = gallons;
		this.total_fuel_cost = total_fuel_cost;
	}

	public GasTracker() {
		super();
	}
	
	
}
