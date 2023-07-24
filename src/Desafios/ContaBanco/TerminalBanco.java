package Desafios.ContaBanco;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TerminalBanco {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Declarando as vari�veis para armazenar os dados da conta banc�ria
        int numeroConta = 0;
        String agencia;
        String nomeCliente;
        double saldo = 0;

     // Solicitando e lendo os dados da conta banc�ria do usu�rio
        do {
            try {
                System.out.print("Por favor, digite o n�mero da Conta: ");
                numeroConta = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("N�mero de Conta inv�lido. Digite um valor num�rico inteiro.");
                scanner.nextLine(); // Limpa o buffer do scanner para tentar novamente
            }
        } while (numeroConta == 0);
        
        scanner.nextLine(); 

        System.out.print("Por favor, digite o n�mero da Ag�ncia: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        do {
            try {
                System.out.print("Por favor, digite o saldo: ");
                saldo = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Valor de saldo inv�lido. Digite um valor num�rico.");
                scanner.nextLine(); // Limpa o buffer do scanner para tentar novamente
            }
        } while (saldo == 0);
        
        // Fechando o scanner ap�s a leitura dos dados
        scanner.close();
        
        // Formatando o saldo com duas casas decimais
        DecimalFormat df = new DecimalFormat("#.00");
        String saldoFormatado = df.format(saldo);

        // Exibindo os dados inseridos pelo usu�rio
        String mensagem = "Ol� " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua ag�ncia � " +
                agencia + ", conta " + numeroConta + " e seu saldo de R$"+ saldoFormatado + " j� est� dispon�vel para saque.";

        System.out.println(mensagem);
	}

}
