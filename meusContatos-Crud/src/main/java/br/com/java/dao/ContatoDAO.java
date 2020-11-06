package br.com.java.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.java.factory.ConexaoBD;
import br.com.java.model.Contato;




public class ContatoDAO {
	
	EntityManager entity = ConexaoBD.getEntityManagerFactory().createEntityManager();
	
	public void salvar ( Contato contato) {
		
		entity.getTransaction().begin();
		entity.persist(contato);
		entity.getTransaction().commit();
	}
	
	
	public void editar(Contato contato) {
		
		entity.getTransaction().begin();
		entity.persist(contato);
		entity.getTransaction().commit();
	}
	
	public Contato buscar (int idContato) {
		Contato contato = new Contato();
		contato = entity.find(Contato.class, idContato);
		return contato;
		
	}
	
	public void deletar(int idContato) {
		
		Contato contato = new Contato();
		contato = entity.find(Contato.class, idContato);
		entity.getTransaction().begin();
		entity.remove(contato);
		entity.getTransaction().commit();
	}
	
	public List <Contato> listarContatos(){
		List<Contato> listaContatos = new ArrayList<Contato>();
		Query result = entity.createQuery("SELECT contato FROM Contato contato");
		listaContatos = result.getResultList();
				
		return listaContatos;
		
	}

}
