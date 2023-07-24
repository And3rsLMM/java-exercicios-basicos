package Desafios.Poo;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String marca;
    private String modelo;
    private int capacidadeArmazenamento;
    private boolean ligado;
    private boolean tocandoMusica;
    private boolean emChamada;
    private String musicaAtual;
    private String numeroChamada;

    public IPhone(String marca, String modelo, int capacidadeArmazenamento) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setCapacidadeArmazenamento(capacidadeArmazenamento);
        this.ligado = false;
        this.tocandoMusica = false;
        this.emChamada = false;
        this.musicaAtual = "";
        this.numeroChamada = "";
    }

    // Implementa��o dos m�todos da interface ReprodutorMusical
    public void tocar() {
        if (ligado && !tocandoMusica) {
            System.out.println("Iniciando a reprodu��o da m�sica: " + musicaAtual);
            tocandoMusica = true;
        } else if (!ligado) {
            System.out.println("O iPhone est� desligado. Ligue o aparelho primeiro.");
        } else {
            System.out.println("A m�sica j� est� sendo reproduzida.");
        }
    }

    public void pausar() {
        if (ligado && tocandoMusica) {
            System.out.println("Pausando a reprodu��o da m�sica: " + musicaAtual);
            tocandoMusica = false;
        } else if (!ligado) {
            System.out.println("O iPhone est� desligado. Ligue o aparelho primeiro.");
        } else {
            System.out.println("N�o h� m�sica em reprodu��o para pausar.");
        }
    }

    public void selecionarMusica(String musica) {
        if (ligado) {
            System.out.println("Selecionando a m�sica: " + musica);
            musicaAtual = musica;
        } else {
            System.out.println("O iPhone est� desligado. Ligue o aparelho primeiro.");
        }
    }

    // Implementa��o dos m�todos da interface AparelhoTelefonico
    public void ligar(String numero) {
        if (!ligado) {
            System.out.println("Ligando o iPhone...");
            ligado = true;
        }
        System.out.println("Chamando o n�mero: " + numero);
        numeroChamada = numero;
        emChamada = true;
    }

    public void atender() {
        if (ligado && emChamada) {
            System.out.println("Atendendo a chamada de: " + numeroChamada);
        } else if (!ligado) {
            System.out.println("O iPhone est� desligado. Ligue o aparelho primeiro.");
        } else {
            System.out.println("N�o h� chamadas recebidas para atender.");
        }
    }

    public void iniciarCorreioVoz() {
        if (ligado && emChamada) {
            System.out.println("Iniciando correio de voz...");
            emChamada = false;
        } else if (!ligado) {
            System.out.println("O iPhone est� desligado. Ligue o aparelho primeiro.");
        } else {
            System.out.println("N�o h� chamadas recebidas para iniciar o correio de voz.");
        }
    }

    // Implementa��o dos m�todos da interface NavegadorInternet
    public void exibirPagina(String url) {
        if (ligado) {
            System.out.println("Exibindo p�gina da Internet: " + url);
        } else {
            System.out.println("O iPhone est� desligado. Ligue o aparelho primeiro.");
        }
    }

    public void adicionarNovaAba() {
        if (ligado) {
            System.out.println("Nova aba de navega��o adicionada.");
        } else {
            System.out.println("O iPhone est� desligado. Ligue o aparelho primeiro.");
        }
    }

    public void atualizarPagina() {
        if (ligado) {
            System.out.println("Atualizando a p�gina da Internet...");
        } else {
            System.out.println("O iPhone est� desligado. Ligue o aparelho primeiro.");
        }
    }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidadeArmazenamento() {
		return capacidadeArmazenamento;
	}

	public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
		this.capacidadeArmazenamento = capacidadeArmazenamento;
	}
}