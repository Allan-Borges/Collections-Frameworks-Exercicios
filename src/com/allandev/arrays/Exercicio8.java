package com.allandev.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Escreva um programa Java para classificar uma determinada lista.
public class Exercicio8 {

	public static void main(String[] args) {

		List<String> carros = new ArrayList<>();

		carros.add("Gol");
		carros.add("Vectra");
		carros.add("Opala");
		carros.add("Civic");
		carros.add("HB20s");
		carros.add("City");

		Collections.sort(carros);

		carros.forEach(System.out::println);
	}

}
