package Desafios.ControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro par�metro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo par�metro");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o m�todo contendo a l�gica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem: O segundo par�metro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        }
	    
        terminal.close();
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    	// Validar se parametroUm � MAIOR que parametroDois e lan�ar a exce��o
    	if (parametroUm > parametroDois) {
    		throw new ParametrosInvalidosException();
    	}
    	
    	int contagem = parametroDois - parametroUm + 1;
    	// Realizar o for para imprimir os n�meros com base na vari�vel contagem
    	for (int i = 0; i < contagem; i++) {
    		System.out.println("Imprimindo o n�mero " + (parametroUm + i));
    	}
    }   

}
