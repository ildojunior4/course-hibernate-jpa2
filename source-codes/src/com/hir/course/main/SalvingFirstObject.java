package com.hir.course.main;

import com.hir.course.model.Client;
import org.hibernate.HibernateException;

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
		client.setName("ILDO ZACARIAS RIBEIRO JUNIOR");
		client.setAge(21);
		client.setJob("Programmer -");
		client.setSex("M");
		try{
			em.getTransaction().begin();
			em.persist(client);
			em.getTransaction().commit();
			System.out.print("Client salved!");
		}catch (HibernateException h){
			System.out.print(h.getMessage());
		}finally {
			em.close();
			emf.close();
		}
	}
}
