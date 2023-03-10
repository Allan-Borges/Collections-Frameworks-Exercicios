package com.allandev.arrays;

import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {
// Escreva um programa Java para recuperar um elemento (em um índice especificado) de uma determinada lista.
	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		
		//metodo para recuperar um elemento em um indice
		Integer num = numeros.get(5);
		
		System.out.println("Elemento recpurado: " + num);
		
	}

}
