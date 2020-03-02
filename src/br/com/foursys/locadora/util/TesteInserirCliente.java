package br.com.foursys.locadora.util;

/**
 * Teste inserir Cliente.
 * @author mpoda
 *
 */

import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import br.com.foursys.locadora.dao.ClienteDAO;
import br.com.foursys.locadora.model.Cidade;
import br.com.foursys.locadora.model.Cliente;
import br.com.foursys.locadora.model.Estado;


public class TesteInserirCliente {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection bd = ConnectionFactory.getConnection();
		Estado e1 = new Estado("Rio de Janeiro", "RJ");
		Cidade cid1 = new Cidade("Búzios");
		Cliente c1 =new Cliente("Tiago Martins", "Av. Edmundo Amaral", 130, "Jd Piratininga", cid1, e1, "(11)97508-3398", "411.752.451-41", "33.5525.25250"
				, 'm', "23/10/2000",19);
		
		ClienteDAO dao = new ClienteDAO(bd);
		
		try {
			dao.inserirCliente(c1);
			System.out.println("Cliente inserido com sucesso!!!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro ao inserir o cliente!!!");
		}
		
		

	}
}
