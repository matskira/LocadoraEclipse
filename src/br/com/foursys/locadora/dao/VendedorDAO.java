package br.com.foursys.locadora.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

import br.com.foursys.locadora.model.Cidade;
import br.com.foursys.locadora.model.Estado;
import br.com.foursys.locadora.model.Vendedor;

public class VendedorDAO {
	private Connection bd;

	public VendedorDAO(Connection bd) {
		this.bd = bd;
	}

	// Método de inserir Vendedor;
	public void inserirVendedor(Vendedor vendedor) throws SQLException {

		String sql = "INSERT INTO vendedor(nome, area_venda, cidade, estado, sexo, idade, salario) VALUES(?,?,?,?,?,?,?)";

		PreparedStatement comando = bd.prepareStatement(sql);
		comando.setString(1, vendedor.getNome());
		comando.setString(2, vendedor.getArea_venda());
		comando.setString(3, vendedor.getCidade().getNome());
		comando.setString(4, vendedor.getEstado().getNome() + "-" + vendedor.getEstado().getUf());
		comando.setString(5, vendedor.getSexo() + "");
		comando.setInt(6, vendedor.getIdade());
		comando.setDouble(7, vendedor.getSalario());
		comando.execute();
	}

	// Método alterar Vendedor
	public void alterarVendedor(Vendedor vendedor) throws SQLException {
		String sql = "UPDATE vendedor SET area_venda=?, cidade = ?, estado = ?, salario = ? WHERE nome=?";
		PreparedStatement comando = bd.prepareStatement(sql);
		comando.setString(5, vendedor.getNome());
		comando.setDouble(4, vendedor.getSalario());
		comando.setString(3, vendedor.getEstado().getNome() + "-" + vendedor.getEstado().getUf());
		comando.setString(2, vendedor.getCidade().getNome());
		comando.setString(1, vendedor.getArea_venda());
		comando.execute();
	}

	// Método excluir vendedor
	public void excluirVendedor(Vendedor vendedor) throws SQLException {

		String sql = "DELETE FROM vendedor WHERE nome=?";
		PreparedStatement comando = bd.prepareStatement(sql);
		comando.setString(1, vendedor.getNome());
		comando.execute();
	}

	// Método listar Vendedor
	public List<Vendedor> buscarTodosVendedores() throws SQLException {
		String sql = "SELECT * FROM vendedor ORDER BY nome";
		PreparedStatement comando = bd.prepareStatement(sql);
		ResultSet cursor = comando.executeQuery();
		List<Vendedor> listaVendedor = new ArrayList<Vendedor>();

		while (cursor.next()) {
			Vendedor vendedor = new Vendedor();
			Cidade cidadeVendedor = new Cidade(cursor.getString("cidade"));

			vendedor.setNome(cursor.getString("nome"));
			vendedor.setArea_venda(cursor.getString("area_venda"));
			vendedor.setCidade(cidadeVendedor);
			String texto[] = cursor.getString("estado").split("-");
			String nomeEstado = texto[0];
			String ufEstado = texto[1];
			Estado estadoVendedor = new Estado(nomeEstado, ufEstado);
			vendedor.setEstado(estadoVendedor);
			vendedor.setSexo(cursor.getString("sexo").charAt(0));
			vendedor.setIdade(cursor.getInt("idade"));
			vendedor.setSalario(cursor.getDouble("salario"));
			listaVendedor.add(vendedor);

		}
		return listaVendedor;

	}

}
