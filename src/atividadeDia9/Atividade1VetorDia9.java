package atividadeDia9;

import java.util.Scanner;

public class Atividade1VetorDia9 {

	public static void main(String[] args) {

		// tipo nome_vetor[] = [quantidade_valores]
		int numeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 }; // 0 - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9
		int num, posicao = 10;

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o Número que deseja encontrar: ");
		num = leia.nextInt();
			for (int indice = 0; indice < 10; indice++) {
				if (numeros[indice] == num) {
					posicao = indice;
				} 
			}
			
		if (posicao != 10) {
			System.out.println("O número " + num + " está localizado na posição " + posicao);
		}
			
		else {
			System.out.println("O número " + num + " não foi encontrado!");
		
		}

	}

}
