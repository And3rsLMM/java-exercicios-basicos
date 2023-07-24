package Desafios.Poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicializando o iPhone
        IPhone iphone = new IPhone("Apple", "iPhone 13", 128);

        // Criando um objeto Scanner para ler as entradas do usu�rio
        Scanner scanner = new Scanner(System.in);

        // Interagindo com o usu�rio
        System.out.println(iphone.getMarca());
        System.out.println("Bem-vindo ao seu " +iphone.getModelo()+ "!");
        System.out.println("Digite 1 para ligar o iPhone.");
        int opcao = scanner.nextInt();
        
        while (opcao != 1) {
            System.out.println("O iPhone permanece desligado. Ligue o aparelho para usar suas funcionalidades.");
            System.out.println("Digite 1 para ligar o iPhone.");
            opcao = scanner.nextInt();
        }
        
        if (opcao == 1) {
            iphone.ligar("123456789");
            System.out.println("iPhone ligado.");
            System.out.println("Digite 2 para tocar uma m�sica.");
            System.out.println("Digite 3 para pausar a m�sica.");
            System.out.println("Digite 4 para selecionar uma m�sica.");
            System.out.println("Digite 5 para ligar para um n�mero.");
            System.out.println("Digite 6 para atender uma chamada.");
            System.out.println("Digite 7 para iniciar o correio de voz.");
            System.out.println("Digite 8 para exibir uma p�gina da internet.");
            System.out.println("Digite 9 para adicionar uma nova aba de navega��o.");
            System.out.println("Digite 10 para atualizar a p�gina da internet.");
            System.out.println("Digite 0 para desligar o iPhone.");

            boolean sair = false;
            while (!sair) {
                System.out.print("Digite a op��o desejada: ");
                int escolha = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer do scanner ap�s a leitura do n�mero

                switch (escolha) {
                    case 0:
                        sair = true;
                        System.out.println("Desligando!");
                        break;
                    case 2:
                        iphone.tocar();
                        break;
                    case 3:
                        iphone.pausar();
                        break;
                    case 4:
                        System.out.print("Digite o nome da m�sica: ");
                        String musica = scanner.nextLine();
                        iphone.selecionarMusica(musica);
                        break;
                    case 5:
                        System.out.print("Digite o n�mero para ligar: ");
                        String numero = scanner.nextLine();
                        iphone.ligar(numero);
                        break;
                    case 6:
                        iphone.atender();
                        break;
                    case 7:
                        iphone.iniciarCorreioVoz();
                        break;
                    case 8:
                        System.out.print("Digite a URL da p�gina da internet: ");
                        String url = scanner.nextLine();
                        iphone.exibirPagina(url);
                        break;
                    case 9:
                        iphone.adicionarNovaAba();
                        break;
                    case 10:
                        iphone.atualizarPagina();
                        break;
                    default:
                        System.out.println("Op��o inv�lida. Tente novamente.");
                }
            }
        }

        // Fechando o scanner ap�s a intera��o com o usu�rio
        scanner.close();
    }
}
