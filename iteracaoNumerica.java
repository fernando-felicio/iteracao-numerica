package iteracao_numerica;
import java.util.Scanner;

public class iteracaoNumerica {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Recebendo input do usuario
		
		System.out.println("Digite o número de casos que serão tratados: ");
		int numCases = sc.nextInt();
		
		//Criando regra de negocio
		
		for (int i=1; i<=numCases; i++) {
			System.out.printf("%d %d %d%n", i, i * i, i*i*i);
		}
		sc.close();
		
	}

}
