package lista;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		final double valor = 1.99;
		double total = 0;
		int quantidade = 0;

		System.out.println("Lojas Tabajara");
		System.out.println("Tabela de preços");
		System.out.println("Produto\t\tPreço");
		System.out.println("1\t\t\t1.99");
		for (int i = 2; i <= 50; i++) {
			total = valor * i;
			System.out.println(i + "\t\t\t" + total);
		}

		entrada.close();

	}

}
