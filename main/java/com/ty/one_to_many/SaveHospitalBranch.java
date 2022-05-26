package com.ty.one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveHospitalBranch {
	
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager  entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Hospital hos = new Hospital();
		hos.setName("abc");
		hos.setGstNum(112);
		hos.setWebsite("hsos.com");
		
		Branch branch = new Branch();
		branch.setName("b1");
		branch.setAddr("tumkur");
		branch.setPhone(112233);
		
		Branch branch1 = new Branch();
		branch1.setName("b2");
		branch1.setAddr("banglore");
		branch1.setPhone(554433);

		Branch branch2 = new Branch();
		branch2.setName("b3");
		branch2.setAddr("mysore");
		branch2.setPhone(775446);
		
		
		branch.setHospital(hos);
		branch1.setHospital(hos);
		branch2.setHospital(hos);
		
		List<Branch> branches = new ArrayList();
		branches.add(branch);
		branches.add(branch1);
		branches.add(branch2);
		entityTransaction.begin();
		entityManager.persist(hos);
		entityManager.persist(branch);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityTransaction.commit();
		
		
	}
}
