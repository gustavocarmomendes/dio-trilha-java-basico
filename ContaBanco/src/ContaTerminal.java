import java.util.Locale;
import java.util.Scanner;

/*
 * Projeto desenvolvido para o Bootcamp do Santander pela DIO
 * Nome: Gustavo do Carmo Mendes
 * GitHub: gustavocarmomendes
 * Linkedin: gustavo-mendes-ads
 * */

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor, digite o n�mero da Conta !");
		int numeroConta = ler.nextInt();
		
		ler.nextLine();
		
		System.out.println("Por favor, digite o n�mero da Ag�ncia !");
		String numeroAgencia = ler.nextLine();
		
		System.out.println("Por favor, digite o seu Nome Completo !");
		String nomeCompleto = ler.nextLine();
		
		System.out.println("Por favor, digite o saldo total !");
		double saldoConta = ler.nextDouble();
		
		System.out.println("Ol� " + nomeCompleto + " obrigado por criar uma conta em nosso banco,"
				+ " sua ag�ncia � " + numeroAgencia + ", conta " + numeroConta + " e seu saldo "
				+ saldoConta + " j� est� dispon�vel para saque.");
		
		ler.close();
		
	}
	
}
