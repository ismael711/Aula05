import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*Receba um número inteiro do usuário e calcule e exiba a tabuada deste número*/
		Scanner leitor = new Scanner(System.in);
		
		int numeroTabuada = 0;
		int resultadoTabuada;
		
		System.out.println("Digite o número para saber a tabuada: ");
		numeroTabuada = leitor.nextInt();
		
		for(int i=1;i<=10;i++) {
			resultadoTabuada = numeroTabuada * i;
			System.out.println(numeroTabuada + " x " + i + " = " + resultadoTabuada);
		}
		
	}

}
