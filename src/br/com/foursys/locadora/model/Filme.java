package br.com.foursys.locadora.model;
/**
 * Classe modelo de Filme, responsável por demonstrar a características do Filme;
 * @author mpoda
 *
 */
public class Filme {
	
	private int codigo;
	private String nome;
	private String genero;
	private double valor;
	private boolean disponivel;
	private boolean promocao;
	private double valor_promocional;
	
	public Filme() {
	}

	public Filme(int codigo, String nome, String genero, double valor, boolean disponivel, boolean promocao,
			double valor_promocional) {
		this.codigo = codigo;
		this.nome = nome;
		this.genero = genero;
		this.valor = valor;
		this.disponivel = disponivel;
		this.promocao = promocao;
		this.valor_promocional = valor_promocional;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public boolean isPromocao() {
		return promocao;
	}

	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}

	public double getValor_promocional() {
		return valor_promocional;
	}

	public void setValor_promocional(double valor_promocional) {
		this.valor_promocional = valor_promocional;
	}
	
	
	
}
