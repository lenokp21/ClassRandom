package teste;

import java.util.List;
import java.util.Random;

import util.BaseNomeseSobrenomes;

public class Teste {

	public static void main(String[] args) {
		
		BaseNomeseSobrenomes nome = new BaseNomeseSobrenomes();
		List<String> listNomeMasculinos = nome.getNomesMasculinos();
		List<String> listSobreNomes = nome.getSobreNomes();
		List<String> listConjuntivos = nome.getConjuntivos();
		
		Random rd = new Random();
		
		String nomeProprio = new String();
		
		int qtdNomes = 2 + rd.nextInt(5);
		
	for(int k = 0; k <= 25; k++){
		
		nomeProprio = "";
		
		for(int i = 0; i <= qtdNomes; i++){
			
			if(rd.nextBoolean() && i == 1){
				
				nomeProprio = nomeProprio + listNomeMasculinos.get(rd.nextInt(listNomeMasculinos.size()));
				
			}else{

				if(rd.nextInt(25) == 2){
					nomeProprio = nomeProprio + listConjuntivos.get(rd.nextInt(listConjuntivos.size()));
					nomeProprio = nomeProprio + " ";
				}
				
				if(i == 0){
					nomeProprio = nomeProprio + listNomeMasculinos.get(rd.nextInt(listNomeMasculinos.size()));
				}else{
				
				nomeProprio = nomeProprio + listSobreNomes.get(rd.nextInt(listSobreNomes.size()));
				
				}	
			}
			
			nomeProprio = nomeProprio + " ";
			
		}
		
		System.out.println(nomeProprio);
		
	 }
	}

}
