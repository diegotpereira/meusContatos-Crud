package br.com.java.controller;

import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.com.java.dao.ContatoDAO;
import br.com.java.model.Contato;


@ManagedBean (name="contatoBean")
@RequestScoped
public class ContatoController {
	
	public List <Contato> listarContatos(){
		ContatoDAO dao = new ContatoDAO();
		return dao.listarContatos();
		
	}
	
	public String editar(int id) {
		ContatoDAO dao = new ContatoDAO();
		Contato contato = new Contato();
		contato = dao.buscar(id);
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("contato", contato);
		return "/faces/editar.xhtml";
		
	}
	
	public String alterar(Contato contato) {
		
		ContatoDAO dao = new ContatoDAO();
		dao.editar(contato);
		return "/faces/index.xhtml";
		
	}
	
	public String deletar(int id) {
		ContatoDAO dao = new ContatoDAO();
		dao.deletar(id);
		return "/faces/index.xhtml";
		
	}
	
	public String adicionar() {
		Contato contato = new Contato();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("contato", contato);
		return "/faces/adicionar.xhtml";
		
	}
	
	public String salvar(Contato contato) {
		
		ContatoDAO dao = new ContatoDAO();
		dao.salvar(contato);
		return "/faces/index.xhtml";
		
	}

}
