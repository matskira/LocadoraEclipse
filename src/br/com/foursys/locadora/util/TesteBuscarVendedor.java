package br.com.foursys.locadora.util;

import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;

import br.com.foursys.locadora.dao.VendedorDAO;
import br.com.foursys.locadora.model.Vendedor;

public class TesteBuscarVendedor {
	public static void main(String[] args) {
		Connection bd = ConnectionFactory.getConnection();
		VendedorDAO dao = new VendedorDAO(bd);
		try {
			List<Vendedor> vendedores = dao.buscarTodosVendedores();
			for (Vendedor vendedor : vendedores) {
				System.out.println("Nome: " + vendedor.getNome());
				System.out.println("Área de venda: " + vendedor.getArea_venda());
				System.out.println("Cidade: " + vendedor.getCidade().getNome());
				System.out.println("Estado: " + vendedor.getEstado().getNome() + "-" + vendedor.getEstado().getUf());
				System.out.println("Sexo: " + vendedor.getSexo());
				System.out.println("Idade: " + vendedor.getIdade());
				System.out.println("Sálario: " + vendedor.getSalario());
				bd.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Não foi possível exibir o Filme!");
		}
	}
}
