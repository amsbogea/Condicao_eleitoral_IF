package condicao_eleitoral_IF;

import java.util.Scanner;

public class Condicao_eleitoral_IF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int idade;
		
		System.out.println("informe sua idade.");
		idade = input.nextInt();
		
		if (idade < 16) {
			System.out.println("Não pode votar.");
		} else if (idade >= 16 && idade < 18 || idade >= 65) {
			System.out.println("Voto facultativo.");
		} else {
			System.out.println("Voto obrigatório.");
		}
	}

}
