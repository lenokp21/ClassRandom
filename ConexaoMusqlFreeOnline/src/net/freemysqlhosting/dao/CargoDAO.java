package net.freemysqlhosting.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import net.freemysqlhosting.util.Conexão;

public class CargoDAO {

	static Connection conexao = null;
	static List<Integer> listarIds = new ArrayList<>();

	public static List<Integer> listaIdCargo() {

		conexao = Conexão.getConnection();
		try {
			PreparedStatement ps = (PreparedStatement) conexao.prepareStatement(" SELECT tbc_id FROM tbc_cargo ");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				listarIds.add(rs.getInt("tbc_id"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Conexão.fechaConexao();

		return listarIds;
	}

}
