package lista;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor de n: ");
		int n = entrada.nextInt();

		float soma = 0;
		int i = 1;
		int j = n;

		while (i <= n) {
			soma = soma + ((j * (j + 1 )) / (float)i);
			if(i == n)
				System.out.print("("+j +" * " + (j + 1 ) +") / " + i);
			else
				System.out.print("("+j +" * " + (j + 1 ) +") / " + i+" + ");
			i++;
			j--;


		}

		System.out.println("\nSoma = "+soma);

	}

}
