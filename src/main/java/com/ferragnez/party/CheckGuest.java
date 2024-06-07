package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		
		String nome;
		String[] invitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci il tuo nome");
		nome = scanner.nextLine() ;
		scanner.close();
		int i=0;
		while (i < invitati.length) {
			System.out.println("|l'indice numero: "+ i + "| nome: "+nome + "| confronto: "+invitati[i]);
			if (invitati[i] == nome) {
				System.out.println("puoi entrare");
			} else {
				System.out.println("non puoi entrare");
			}
			i++;
		}

	}

}
