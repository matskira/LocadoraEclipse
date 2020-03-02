package br.com.foursys.locadora.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.foursys.locadora.dao.ClienteDAO;
import br.com.foursys.locadora.model.Cidade;
import br.com.foursys.locadora.model.Cliente;
import br.com.foursys.locadora.model.Estado;

public class TesteAlterarCliente {
	public static void main(String[] args) {

		Connection bd = ConnectionFactory.getConnection();
		Estado e1 = new Estado("Minas Gerais", "MG");
		Cidade cid1 = new Cidade("Barueri");
		Cliente cliente = new Cliente("Tiago Martins", "Av Joao Pedro", 115, "Jd Pereira", cid1, e1, "(11)97508-3398",
				"411.752.451-41", "33.5525.25250", 'm', "23/10/2000", 19);
		ClienteDAO dao = new ClienteDAO(bd);

		try {
			dao.alterarCliente(cliente);
			System.out.println("Aluno alternado com sucesso!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Não foi possível alternar o aluno!");
		}

	}
}
