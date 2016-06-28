package com.hir.course.main;

import com.hir.course.model.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by ildo-zrj on 28/06/2016.
 */
public class SalvingFirstObject {
	public static void main(String[] args){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("examplePU");
		EntityManager em = emf.createEntityManager();

		Client client = new Client();
		em.persist(client);
		//em.close();
	}
}
