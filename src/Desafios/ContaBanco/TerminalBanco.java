package Desafios.ContaBanco;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TerminalBanco {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Declarando as variáveis para armazenar os dados da conta bancária
        int numeroConta = 0;
        String agencia;
        String nomeCliente;
        double saldo = 0;

     // Solicitando e lendo os dados da conta bancária do usuário
        do {
            try {
                System.out.print("Por favor, digite o número da Conta: ");
                numeroConta = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Número de Conta inválido. Digite um valor numérico inteiro.");
                scanner.nextLine(); // Limpa o buffer do scanner para tentar novamente
            }
        } while (numeroConta == 0);
        
        scanner.nextLine(); 

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        do {
            try {
                System.out.print("Por favor, digite o saldo: ");
                saldo = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Valor de saldo inválido. Digite um valor numérico.");
                scanner.nextLine(); // Limpa o buffer do scanner para tentar novamente
            }
        } while (saldo == 0);
        
        // Fechando o scanner após a leitura dos dados
        scanner.close();
        
        // Formatando o saldo com duas casas decimais
        DecimalFormat df = new DecimalFormat("#.00");
        String saldoFormatado = df.format(saldo);

        // Exibindo os dados inseridos pelo usuário
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numeroConta + " e seu saldo de R$"+ saldoFormatado + " já está disponível para saque.";

        System.out.println(mensagem);
	}

}
