package com.allandev.arrays;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {
// Escreva um programa Java para inserir um elemento na lista de array na primeira posição
	public static void main(String[] args) {
		
		List<String> carros = new ArrayList<String>();
		
		carros.add(0, "Vectra");

		for (String string : carros) {
			System.out.println(string);
		}
	}

}
