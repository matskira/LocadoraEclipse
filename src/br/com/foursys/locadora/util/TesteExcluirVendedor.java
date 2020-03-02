package br.com.foursys.locadora.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.foursys.locadora.dao.VendedorDAO;
import br.com.foursys.locadora.model.Vendedor;

public class TesteExcluirVendedor {
	public static void main(String[] args) {

		Connection bd = ConnectionFactory.getConnection();
		Vendedor vendedor = new Vendedor();
		vendedor.setNome("Giovanni");
		VendedorDAO dao = new VendedorDAO(bd);

		try {
			dao.excluirVendedor(vendedor);
			System.out.println("Vendedor excluído com sucesso!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Não foi possível excluír o Vendedor!");
		}

	}
}
