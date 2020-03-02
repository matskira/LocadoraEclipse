package br.com.foursys.locadora.util;

import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import br.com.foursys.locadora.dao.VendedorDAO;
import br.com.foursys.locadora.model.Cidade;
import br.com.foursys.locadora.model.Estado;
import br.com.foursys.locadora.model.Vendedor;

public class TesteAlterarVendedor {
	public static void main(String[] args) {

		Connection bd = ConnectionFactory.getConnection();
		Cidade cidadeVendedor = new Cidade("Moema");
		Estado estadoVendedor = new Estado("São Paulo", "SP");
		Vendedor vendedor = new Vendedor("Giovanni", "Gerente", cidadeVendedor, estadoVendedor, 'm', 22, 990.99);
		VendedorDAO dao = new VendedorDAO(bd);

		try {
			dao.alterarVendedor(vendedor);
			System.out.println("Vendedor alternado com sucesso!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Não foi possível alternar o Vendedor!");
		}

	}
}
