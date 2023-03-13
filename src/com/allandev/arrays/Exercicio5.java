package com.allandev.arrays;

import java.util.ArrayList;
import java.util.List;

//. Escreva um programa Java para atualizar um determinado elemento do array por determinado elemento.
public class Exercicio5 {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();

		nomes.add("Luan");
		nomes.add("Renan");
		nomes.add("Lara");
		nomes.add("Luis");

		nomes.set(2, "Allan");

		nomes.forEach(System.out::println);

	}

}
