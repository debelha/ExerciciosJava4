package lista4;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o 
		 * mostrar na tela N linhas, come�ando de 1 at� N. Para cada linha, mostrar 
		 * o n�mero da linha, depois o quadrado e o cubo do valor, conforme exemplo.
		 */

		Scanner sc = new Scanner(System.in);
		
		int n, i, numero, quadrado, cubo;
		
		System.out.println("Digite um n�mero: ");
		n = sc.nextInt();
		
		quadrado = n * n;
		cubo = n * n * n;
		
		for (i=1; i<=n; i++) {
			
			numero = i;
			quadrado = i * i;
			cubo = i * i * i;
			
			System.out.println(numero + " " + quadrado + " " + cubo);
		}
		
		sc.close();
		
	}

}
