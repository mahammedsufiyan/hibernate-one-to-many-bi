package com.ty.one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMobileSim {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager  entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Mobile mob = new Mobile();
		mob.setName("a");
		mob.setCost(1000);
		
		Sim sim = new Sim();
		sim.setProvider("airtel");
		sim.setType("4g");
		sim.setImei(111);
		
		Sim sim2 = new Sim();
		sim2.setProvider("jio");
		sim2.setType("5g");
		sim2.setImei(333);
		
		List<Sim> sims = new ArrayList();
		sims.add(sim);
		sims.add(sim2);
		
		mob.setSim(sims);
		sim.setMobile(mob);
		sim2.setMobile(mob);
		entityTransaction.begin();
		entityManager.persist(mob);
		entityManager.persist(sim);
		entityManager.persist(sim2);
		entityTransaction.commit();
		
	}
}
