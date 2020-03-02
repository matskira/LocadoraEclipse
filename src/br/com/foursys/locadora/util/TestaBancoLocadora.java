package br.com.foursys.locadora.util;
/**
 * @author mpoda
 * Testar se o driver do banco de dados e sua devida conex�o est� sendo carregado corretamente .
 */
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class TestaBancoLocadora {
	public static void main(String[] args) {
		
		String local = "jdbc:mysql://localhost/locadora";
		String login = "root";
		String senha = "root";
		
		Connection bd = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver carregado com sucesso:");
			bd = (Connection) DriverManager.getConnection(local,login,senha);
			System.out.println("Conex�o realizada com sucesso!!");
			
			bd.close();
			System.out.println("Conex�o encerrada com sucesso!!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Falha ao carregar o Drive");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro ao conectar");
		}
		
		
		
	}
}
