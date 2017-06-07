package net.freemysqlhosting.teste;

import java.util.List;

import net.freemysqlhosting.dao.CargoDAO;
import net.freemysqlhosting.dao.UsuarioDAO;
import net.freemysqlhosting.entity.Usuario;
import net.freemysqlhosting.util.Conexão;

public class TesteListagem {

	public static void main(String[] args) {
		
		List<Integer> usuarios = UsuarioDAO.listarIdUsuario();
		List<Integer> cargos = CargoDAO.listaIdCargo();
		
		for(int i = 0; i < usuarios.size(); i++){
			System.out.println(usuarios.get(i));
		}
	

	}

}
