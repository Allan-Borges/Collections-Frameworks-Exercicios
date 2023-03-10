package com.allandev.arrays;

import java.util.ArrayList;
import java.util.List;

// Escreva um programa Java para percorrer todos os elementos em uma lista.
public class Exercicio2 {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Allan");
		nomes.add("Ruth");
		nomes.add("Douglas");
		nomes.add("Thiago");
		nomes.add("Ismael");
		
		nomes.forEach(nome -> System.out.println(nome));
	}

}
