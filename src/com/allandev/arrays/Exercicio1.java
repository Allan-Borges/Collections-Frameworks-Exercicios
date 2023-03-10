package com.allandev.arrays;

import java.util.ArrayList;
import java.util.List;

//Escreva um programa Java para criar uma nova lista , adicione algumas cores (string) e imprima a coleção
public class Exercicio1 {

	public static void main(String[] args) {
	
		List<String> cores = new ArrayList<String>();
		
		cores.add("Azul");
		cores.add("Amarela");
		cores.add("Cinza");
		cores.add("Branco");
		cores.add("Preto");
		
		System.out.println("Cores: " + cores);
	}

}
