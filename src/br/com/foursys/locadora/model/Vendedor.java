package br.com.foursys.locadora.model;
/**
 * Classe modelo de Vendedor, responsável por demonstrar a características do Vendedor;
 * @author mpoda
 *
 */
public class Vendedor {
	private String nome;
	private String area_venda;
	private Cidade cidade;
	private Estado estado;
	private char sexo;
	private int idade;
	private double salario;
	
	public Vendedor() {
		
	}

	public Vendedor(String nome, String area_venda, Cidade cidade, Estado estado, char sexo, int idade,
			double salario) {
		this.nome = nome;
		this.area_venda = area_venda;
		this.cidade = cidade;
		this.estado = estado;
		this.sexo = sexo;
		this.idade = idade;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea_venda() {
		return area_venda;
	}

	public void setArea_venda(String area_venda) {
		this.area_venda = area_venda;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
