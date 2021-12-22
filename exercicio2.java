package lista4;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X 
		 * que serão lidos em seguida.Mostre quantos destes valores X estão dentro do 
		 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações 
		 * conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para 
		 * fora do intervalo).
		 */

		Scanner sc = new Scanner(System.in);
		
		int x, n, i, IN = 0, OUT = 0;
		
		System.out.println("Digite a quantidade de números a verificar: ");
		n = sc.nextInt();
		
		for (i = 0; i < n; i++) {
			
			System.out.println("Digite um número: ");
			x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				
				IN += 1;
			}
			
			else {
			
				OUT += 1;
			}
		}
		
		System.out.println(IN + " IN");
		System.out.println(OUT + " OUT");
		
		sc.close();
		
	}

}
