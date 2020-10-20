package teste;

import java.io.ObjectInputStream.GetField;
import java.sql.Date;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;

/**
 * @author t_randoll
 *
 */
public class principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n; // quantidade de numeros sorteados
		int j; // quantidade de jogadores participantes do zero ou um americano

		System.out.println("#################### ZERO OU UM AMERICANO  ########################");

		System.out.println("Defina a quantidade de dedos(numeros) que serao sorteados: \n");
		n = teclado.nextInt();

		System.out.println("Defina a quantidade de jogadores(participantes): \n");
		int l = teclado.nextInt();
		j = l + 1;

		int jog[] = new int[j];

		System.out.println("\n");

		int y = 0;
		int x = 1;
		for (int i = 1; i <= n; i++) {

			if (x < j) {
				jog[x] = i; // jogador 1 recebe o numero 1
				System.out.println("Jogador " + x + " recebe: " + jog[x]);

			} else {
				// System.out.println("entrou no else");
				x = 1;
				jog[x] = i;
				System.out.println("Jogador " + x + " recebe: " + jog[x]);
			}
			
			if (jog[x] == n) { 
				System.out.println("\nO jogador sorteado da vez é jogador " + x);
			}
			
			x++;// salta pro proximo jogador

			// System.out.println("x: "+ x);
		}
	}
}
