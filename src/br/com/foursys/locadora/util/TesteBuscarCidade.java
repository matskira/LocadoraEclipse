package br.com.foursys.locadora.util;
/**
 * @author mpoda
 * Teste do read Cidade;
 */
import java.sql.SQLException;
import java.util.List;
import com.mysql.jdbc.Connection;

import br.com.foursys.locadora.dao.CidadeDAO;
import br.com.foursys.locadora.model.Cidade;

public class TesteBuscarCidade {
	public static void main(String[] args) {
		Connection bd = ConnectionFactory.getConnection();	
		CidadeDAO dao = new CidadeDAO(bd);
		try {
			List<Cidade> cidades = dao.buscarTodos();
			for (Cidade cidade : cidades) {
				System.out.println("Nome: " + cidade.getNome());
				bd.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Não foi possível exibir o aluno!");
		}
	}
}
