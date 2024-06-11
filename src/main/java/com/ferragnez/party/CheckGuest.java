package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		
		String nome;
		String[] invitati = { 
				"Dua Lipa",
				"Paris Hilton", 
				"Manuel Agnelli", 
				"J-Ax", 
				"Francesco Totti", 
				"Ilary Blasi", 
				"Bebe Vio", 
				"Luis", 
				"Pardis Zarei", 
				"Martina Maccherone", 
				"Rachel Zeilic"
				};
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci il tuo nome");
		nome = scanner.nextLine() ;
		scanner.close();
		boolean isOk = false;
		
//con ciclo while
/*		
        int i=0;
		while (i < invitati.length && isOk) {			
			if (invitati[i].equals(nome) ) {
				System.out.println("Puoi entrare");
				isOk = true;
			}
			i++;
		}
*/
		
// con ciclo for
/*		
		for (int i = 0; i < invitati.length && !isOk; i++) {
			if (invitati[i].equals(nome) ) {
				System.out.println("Puoi entrare");
				isOk = true;
			} 
		}
*/	
		
// bonus by me  foreach
		
		for (String invited : invitati) {
			if (invited.equals(nome) ) {
				System.out.println("Puoi entrare");
				isOk = true;
			} 
		}
		
		if (isOk == false) {
			System.out.println("Torna cortesemente da dove sei venuto");
		}
	
		
		
	}

}
