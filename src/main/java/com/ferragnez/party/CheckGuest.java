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
		boolean isOk = false;
		while (i < invitati.length && isOk == false) {			
			if (invitati[i].equals(nome) ) {
				System.out.println("Puoi entrare");
				isOk = true;
			} else {
				
			}
			i++;
		}
		if (isOk == false) {
			System.out.println("Torna cortesemente da dove sei venuto");
		}

	}

}
