package br.com.java.factory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexaoBD {
	
	private static EntityManagerFactory entityManagerFactory;

	public static EntityManagerFactory getEntityManagerFactory() {
		// TODO Auto-generated method stub
		
		if (entityManagerFactory == null) {
			entityManagerFactory = Persistence.createEntityManagerFactory("meusContatos");
		}
		return entityManagerFactory;
	}

}
