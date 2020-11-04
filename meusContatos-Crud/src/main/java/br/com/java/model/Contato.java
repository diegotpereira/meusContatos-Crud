package br.com.java.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTATOS")
public class Contato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idContato;
	private String nomeContato;
	private String telefoneContato;
	private String emailContato;
	private String enderecoContato;
	
	public int getIdContato() {
		return idContato;
	}
	public void setIdContato(int idContato) {
		this.idContato = idContato;
	}
	public String getNomeContato() {
		return nomeContato;
	}
	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	public String getTelefoneContato() {
		return telefoneContato;
	}
	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	public String getEmailContato() {
		return emailContato;
	}
	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}
	public String getEnderecoContato() {
		return enderecoContato;
	}
	public void setEnderecoContato(String enderecoContato) {
		this.enderecoContato = enderecoContato;
	}
	
	
	

}
