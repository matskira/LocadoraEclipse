package br.com.foursys.locadora.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.foursys.locadora.dao.FilmeDAO;
import br.com.foursys.locadora.model.Filme;

public class TesteAlterarFilme {
	public static void main(String[] args) {

		Connection bd = ConnectionFactory.getConnection();
		
		Filme film = new Filme(133, "Toy Story", "Animação", 12.00, true, true, 8.99);
		FilmeDAO dao = new FilmeDAO(bd);

		try {
			dao.alterarFilme(film);
			System.out.println("Aluno alternado com sucesso!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Não foi possível alternar o aluno!");
		}

	}
}
