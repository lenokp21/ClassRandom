package net.freemysqlhosting.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.MySQLConnection;

public class Conexão {
	
	static int contador = 0;
	
	static Connection connection = null;

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/testepdi",
					"root", "123456");
			contador++;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (connection != null) {
			System.out.println("Conexão Realizada! "+contador);
		} else {
			System.out.println("Conexão não Realizada! "+contador);
		}

		return connection;
	}

	public static void fechaConexao() {
		try {
			
			if(!connection.equals(null)){
				connection.close();
			}
			
			contador--;
			System.out.println("Conexão fechada! "+contador);
		} catch (SQLException e) {
			System.out.println("Não foi possivel fechar a conexão!");
			e.printStackTrace();
		}
	}

}
