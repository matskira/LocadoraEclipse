package br.com.foursys.locadora.util;

import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;

import br.com.foursys.locadora.dao.ClienteDAO;
import br.com.foursys.locadora.model.Cliente;

public class TesteBuscarCliente {
	public static void main(String[] args) {
		Connection bd = ConnectionFactory.getConnection();
		ClienteDAO dao = new ClienteDAO(bd);
		try {
			List<Cliente> clientes = dao.buscarTodosClientes();
			for (Cliente cliente : clientes) {
				System.out.println("Nome: " + cliente.getNome());
				System.out.println("Logradouro: " + cliente.getLogradouro());
				System.out.println("Numero Logradouro: " + cliente.getNumero_logradouro());
				System.out.println("Bairro: " + cliente.getBairro());
				System.out.println("Cidade: " + cliente.getCidade().getNome());
				System.out.println("Estado: " + cliente.getEstado().getNome() + "-" + cliente.getEstado().getUf());
				System.out.println("Telefone: " + cliente.getTelefone());
				System.out.println("CPF: " + cliente.getCpf());
				System.out.println("RG: " + cliente.getRg());
				System.out.println("Sexo: " + cliente.getSexo());
				System.out.println("Data de Nascimento: " + cliente.getData_nascimento());
				System.out.println("Idade: " + cliente.getIdade() + "\n");
				bd.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Não foi possível exibir o Clientes!");
		}
	}
}
