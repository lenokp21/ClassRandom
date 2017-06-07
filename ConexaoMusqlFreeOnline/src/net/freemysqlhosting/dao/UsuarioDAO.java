package net.freemysqlhosting.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import net.freemysqlhosting.entity.Usuario;
import net.freemysqlhosting.util.Conexão;

public class UsuarioDAO {

	static Connection conexao = null;

	private static String INSERT = "INSERT INTO tbu_usuario(`tbu_nome`,`tbu_id_cargo`,`tbu_id_sub`) VALUES ( ?, ?, ?) ";

	public static void cadastrarUsuario(Usuario usuario) {

		conexao = Conexão.getConnection();

		/*if (usuario.getIdSub() == null) {
			usuario.setIdSub(0);
		}*/

		try {
			PreparedStatement ps = (PreparedStatement) conexao.prepareStatement(INSERT);
			ps.setString(1, usuario.getNome());
			ps.setInt(2, usuario.getIdCargo());
			ps.setInt(3, usuario.getIdSub());

			ps.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Conexão.fechaConexao();
	}

	public static List<Integer> listarIdUsuario() {

		conexao = Conexão.getConnection();
		List<Integer> listaDeIds = new ArrayList<>();

		try {
			PreparedStatement ps = (PreparedStatement) conexao.prepareStatement("Select tbu_id from tbu_usuario");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				listaDeIds.add(rs.getInt("tbu_id"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Conexão.fechaConexao();

		return listaDeIds;
	}

}
