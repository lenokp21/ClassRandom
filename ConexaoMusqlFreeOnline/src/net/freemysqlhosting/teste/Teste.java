package net.freemysqlhosting.teste;

import java.util.List;
import java.util.Random;

import net.freemysqlhosting.dao.CargoDAO;
import net.freemysqlhosting.dao.UsuarioDAO;
import net.freemysqlhosting.entity.Cargo;
import net.freemysqlhosting.entity.Usuario;

public class Teste {

	public static void main(String[] args) {

		Random rd = new Random();
		
		List<Integer> usuarios = UsuarioDAO.listarIdUsuario();
		List<Integer> cargos = CargoDAO.listaIdCargo();

		String nome = null;

		String Pnome[] = new String[] { "Roberto", "Avilar", "Monteiro", "Antunes", "Cordeiro", "Anjos", "Vinicios",
				"Matheus", "Adriel", "Grandos" };
		String sobreNome[] = new String[] { "Silva", "Mariano", "Costa", "Andreo", "Jorge", "Pontifacio", "Melio",
				"Roriz", "Gladson", "Malvino" };

		Usuario usuario = null;
		          usuarios = UsuarioDAO.listarIdUsuario();
		for (int i = 0; i < 20; i++) {

			if (rd.nextBoolean()) {
				nome = Pnome[rd.nextInt(Pnome.length)] + " " + sobreNome[rd.nextInt(sobreNome.length)];
			} else {
				nome = sobreNome[rd.nextInt(Pnome.length)] + " " + Pnome[rd.nextInt(sobreNome.length)];
			}

			System.out.println(nome);
			
			System.out.println(cargos.get(rd.nextInt(cargos.size())));
			UsuarioDAO.cadastrarUsuario(new Usuario(nome, cargos.get(rd.nextInt(cargos.size())),(usuarios.get(rd.nextInt(usuarios.size())))));
		}
		
		//System.out.println(cargos.get(rd.nextInt(cargos.size())));
		//UsuarioDAO.cadastrarUsuario(new Usuario(nome, cargos.get(rd.nextInt(cargos.size())), 35));

	}

}
