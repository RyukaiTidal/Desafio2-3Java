package biatlo;

import java.util.Scanner;

public class Biatlo {

	public static void main(String[] args) {
		
		Biatleta atleta = new Biatleta();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor, Diga-nos o Seu nome.");
		atleta.Nome = entrada.nextLine();
		System.out.println("Muito bem! Agora digite o seu peso, por Favor.");
		atleta.Peso = entrada.nextDouble();
		
		
		boolean b = true;
		while(b == true){

			System.out.println("1 - Correr"
					+ "\n2 - Pedalar"
					+ "\n3 - Sair");
			int Escolha = entrada.nextInt();
			if (Escolha == 1) {
				atleta.correr(atleta.Nome);
			}else if(Escolha == 2) {
				atleta.Pedalar(atleta.Nome);
			}else if(Escolha == 3) {
				b = false;
			}else {
				System.out.println("Dígito Incorreto.");
			}
			
			System.out.println();
		}
	}
	
}
