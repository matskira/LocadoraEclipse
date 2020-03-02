package br.com.foursys.locadora.model;
/**
 * Classe modelo de Cidade, responsável por demonstrar a características da Cidade;
 * @author mpoda
 *
 */
public class Cidade {
	
	private String nome;
	
	public Cidade() {		
	}

	public Cidade(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
