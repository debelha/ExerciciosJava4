package lista4;


import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre 
		 * a divis�o do primeiro para o segundo. Se o denominador for igual a zero, mostrar 
		 * a mensagem "divisao impossivel"
		 */

		Scanner sc = new Scanner (System.in);
		
		int I, N, X, Y, RESULTADO;
		
		System.out.println("Digite o n�mero de pares: ");
		N = sc.nextInt();
		
		System.out.println("Insira o primeiro n�mero da divis�o: ");
		X = sc.nextInt();
		
		System.out.println("Insira o segundo n�mero da divis�o: ");
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
