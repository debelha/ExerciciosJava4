package lista4;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		//Ler um número inteiro N e calcular todos os seus divisores.

		Scanner sc = new Scanner(System.in);
		
		int N, i;
		
		System.out.println("Digite um número: ");
		N = sc.nextInt();
		
		for (i=1; i<=N; i++) {
			if (N % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
	}

}
