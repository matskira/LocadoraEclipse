package br.com.foursys.locadora.model;
/**
 * Classe modelo de Cliente, responsável por demonstrar a características do Cliente;
 * @author mpoda
 *
 */

public class Cliente {
	
	private String nome;
	private String logradouro;
	private int numero_logradouro;
	private String bairro;
	private Cidade cidade;
	private Estado estado;
	private String telefone;
	private String cpf;
	private String rg;
	private char sexo;
	private String data_nascimento;
	private int idade;
	
	public Cliente() {
	}

	public Cliente(String nome, String logradouro, int numero_logradouro, String bairro, Cidade cidade, Estado estado,
			String telefone, String cpf, String rg, char sexo, String data_nascimento, int idade) {
		this.nome = nome;
		this.logradouro = logradouro;
		this.numero_logradouro = numero_logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.data_nascimento = data_nascimento;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero_logradouro() {
		return numero_logradouro;
	}

	public void setNumero_logradouro(int numero_logradouro) {
		this.numero_logradouro = numero_logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	
}
