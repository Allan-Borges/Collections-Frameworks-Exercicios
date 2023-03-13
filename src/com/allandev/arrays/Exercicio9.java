package com.allandev.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Escreva um programa Java para copiar uma lista para outra
public class Exercicio9 {

	public static void main(String[] args) {
		List<String> carros = new ArrayList<>();

		carros.add("Gol");
		carros.add("Vectra");
		carros.add("Opala");
		
		List<String> carros2 = new ArrayList<>();

		carros2.add("Sandero");
		carros2.add("Classic");
		carros2.add("Stilo");

		Collections.copy(carros, carros2);
		
		carros.forEach(c -> System.out.println(c));
		carros2.forEach(c -> System.out.println(c));

	}

}
