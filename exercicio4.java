package lista4;


import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre 
		 * a divisão do primeiro para o segundo. Se o denominador for igual a zero, mostrar 
		 * a mensagem "divisao impossivel"
		 */

		Scanner sc = new Scanner (System.in);
		
		int I, N, X, Y, RESULTADO;
		
		System.out.println("Digite o número de pares: ");
		N = sc.nextInt();
		
		System.out.println("Insira o primeiro número da divisão: ");
		X = sc.nextInt();
		
		System.out.println("Insira o segundo número da divisão: ");
		Y = sc.nextInt();
		
		RESULTADO = X / Y;
		
		for (I=0; I<N; I++) {
			
			if (Y == 0) {
				System.out.println("Divisao impossivel");
			}
			
			else {
				System.out.println("Resultado: "+ RESULTADO);
			}
		}
	}
}
