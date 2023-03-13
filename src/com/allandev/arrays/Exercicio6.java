package com.allandev.arrays;

import java.util.ArrayList;
import java.util.List;

// Escreva um programa Java para remover o terceiro elemento de uma lista.
public class Exercicio6 {

	public static void main(String[] args) {

		List<Double> valores = new ArrayList<>();

		valores.add(3.45);
		valores.add(7.0);
		valores.add(6.25);
		valores.add(13.45);
		valores.add(23.0);
		valores.add(5.5);

		valores.forEach(System.out::println);

		System.out.println("----------");

		valores.remove(2);

		valores.forEach(System.out::println);
	}

}
