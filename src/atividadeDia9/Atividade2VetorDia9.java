package atividadeDia9;

public class Atividade2VetorDia9 {

	public static void main(String[] args) {

		int numeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 }; 
		int soma = 0;
		float media = 0;

		System.out.println("Elementos nos índices ímpares:");
		for (int i = 0; i < 10; i++) {
		
			if (numeros[i] % 2 != 0) {
				System.out.print(numeros[i] + " ");
			}

			soma += numeros[i];
		}

		System.out.println("\nElementos pares:");
		for (int i = 0; i < 10; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
			}
		}
		
		media = soma / 10f;

		System.out.println("\nSoma: " + soma);
		System.out.println("Média: " + media);
	}
}
