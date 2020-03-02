package br.com.foursys.locadora.util;

import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;

import br.com.foursys.locadora.dao.FilmeDAO;
import br.com.foursys.locadora.model.Filme;

public class TesteBuscarFilmes {
	public static void main(String[] args) {
		Connection bd = ConnectionFactory.getConnection();
		FilmeDAO dao = new FilmeDAO(bd);
		try {
			List<Filme> filmes = dao.buscarTodosFilmes();
			for (Filme filme : filmes) {
				System.out.println("Código: " + filme.getCodigo());
				System.out.println("Nome: " + filme.getNome());
				System.out.println("Gênero: " + filme.getGenero());
				System.out.println("Valor: " + filme.getValor());
				System.out.println("Disponibilidade: " + filme.isDisponivel());
				System.out.println("Promoção: " + filme.isPromocao());
				System.out.println("Valor promocional: " + filme.getValor_promocional());
				bd.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Não foi possível exibir o Filme!");
		}
	}
}
