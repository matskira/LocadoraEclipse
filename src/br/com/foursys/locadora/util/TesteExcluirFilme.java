package br.com.foursys.locadora.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.foursys.locadora.dao.FilmeDAO;
import br.com.foursys.locadora.model.Filme;

public class TesteExcluirFilme {
	public static void main(String[] args) {

		Connection bd = ConnectionFactory.getConnection();
		Filme filme = new Filme();
		filme.setCodigo(142);
		FilmeDAO dao = new FilmeDAO(bd);

		try {
			dao.excluirFilme(filme);
			
			System.out.println("Cliente excluído com sucesso!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Não foi possível excluír o Cliente!");
		}

	}
}
