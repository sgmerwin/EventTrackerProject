package com.skilldistillery.eventtracker.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GasTrackerTest {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("EventTracker");
	private static EntityManager em;
	private static GasTracker gasTracker;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		gasTracker = em.find(GasTracker.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
	}


	@DisplayName("Testing GasTracker entity mappings")
	@Test
	public void testCustomer1() {
		assertEquals(20000, gasTracker.getTotalMilage());
		assertEquals(10, gasTracker.getGallons());
		assertEquals(25.5, gasTracker.getTotal_fuel_cost());
		

	}

}
