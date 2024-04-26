package vetor;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner captura = new Scanner(System.in);
		String vetorString[] = new String[6];;
	    String nome =null;
		String vetor[] = { "Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi", "Carol" };
		String string = null;
		int conta = 0;
		for (int indice = 0; indice < 6; indice++) {
			System.out.println("Digite 6 nomes: ");
			vetorString[indice] = captura.nextLine();
			
			nome = (vetorString[indice]);
			conta++;
			System.out.println("O " + (conta) + "º elemento é : " + nome);
			
		
			
		}
			
			System.out.println(vetorString.length);
			System.out.println(nome);
			for(int cor = 0; cor < 6; cor++) {
			System.out.println(vetorString[cor]);
			}


			
		}

		
	}


