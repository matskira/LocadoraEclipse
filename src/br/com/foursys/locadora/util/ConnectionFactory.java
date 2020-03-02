package br.com.foursys.locadora.util;
/**
 * @author mpoda
 * Classe responsável por realizar a conexão com o banco de daddos;
 * 02/03/2020;
 */
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;


public class ConnectionFactory {

	public static Connection getConnection() {

		String local = "jdbc:mysql://localhost/locadora";
		String login = "root";
		String senha = "root";

		Connection conexao = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			conexao = (Connection) DriverManager.getConnection(local, login, senha);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Falha ao carregar o Drive");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro ao conectar");
		}

		return conexao;
	}

}
