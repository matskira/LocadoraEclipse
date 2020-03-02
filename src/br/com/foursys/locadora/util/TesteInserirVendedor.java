package br.com.foursys.locadora.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.foursys.locadora.dao.VendedorDAO;
import br.com.foursys.locadora.model.Cidade;
import br.com.foursys.locadora.model.Estado;
import br.com.foursys.locadora.model.Vendedor;

public class TesteInserirVendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection bd = ConnectionFactory.getConnection();
		Cidade cidadeVendedor = new Cidade("Osasco");
		Estado estadoVendedor = new Estado("São Paulo", "SP");
		Vendedor vendedor = new Vendedor("Giovanni", "Caixa", cidadeVendedor, estadoVendedor, 'm', 22, 990.99);

		VendedorDAO dao = new VendedorDAO(bd);

		try {
			dao.inserirVendedor(vendedor);
			System.out.println("Vendedor inserido com sucesso!!!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro ao inserir o Vendedor!!!");
		}

	}
}
