package br.com.foursys.locadora.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.foursys.locadora.dao.ClienteDAO;
import br.com.foursys.locadora.model.Cliente;

public class TesteExcluirCliente {
	public static void main(String[] args) {

		Connection bd = ConnectionFactory.getConnection();	
		Cliente cliente=new Cliente();
		cliente.setCpf("408.752.451-41");
		ClienteDAO dao = new ClienteDAO(bd);
		
		try {
			dao.excluirCliente(cliente);;
			System.out.println("Cliente exclu�do com sucesso!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("N�o foi poss�vel exclu�r o Cliente!");
		}
		
	}
}
