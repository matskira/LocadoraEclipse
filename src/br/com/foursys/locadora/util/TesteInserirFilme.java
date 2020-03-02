package br.com.foursys.locadora.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.foursys.locadora.dao.FilmeDAO;
import br.com.foursys.locadora.model.Filme;

public class TesteInserirFilme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection bd = ConnectionFactory.getConnection();
		Filme film = new Filme(133, "Toy Story", "Animação", 12.00, true, false, 9.99);
		
		FilmeDAO dao = new FilmeDAO(bd);
		
		try {
			dao.inserirFilme(film);
			System.out.println("Filme inserido com sucesso!!!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro ao inserir o Filme!!!");
		}
		
		

	}
}
