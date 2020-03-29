package com.tyss.azuredatastore;

import java.io.File;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tyss.azuredatastore.beans.Customer;

public class App {
	public static void main(String[] args) throws Exception {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("azure-unit");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		ObjectMapper mapper = new ObjectMapper();
		manager.persist(mapper.readValue(new File("customer-output.json"), Customer.class));
		transaction.commit();
		manager.close();
		factory.close();
	}
}
