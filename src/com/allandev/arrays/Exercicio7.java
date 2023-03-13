package com.allandev.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Escreva um programa Java para pesquisar um elemento em uma lista.
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<String> carros = new ArrayList<>();
		
		carros.add("Gol");
		carros.add("Vectra");
		carros.add("Opala");
		carros.add("Civic");
		carros.add("HB20s");
		carros.add("City");
		
		System.out.print("Qual carro deseja pesquisar? ");
		String nomeCarro = in.next();
		
		if(carros.contains(nomeCarro)) {
			System.out.println("O carro existe no estoque.");
		}else {
			System.out.println("O carro não existe no estoque.");
		}

	}

}
