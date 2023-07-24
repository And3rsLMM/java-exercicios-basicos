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

    // Implementação dos métodos da interface ReprodutorMusical
    public void tocar() {
        if (ligado && !tocandoMusica) {
            System.out.println("Iniciando a reprodução da música: " + musicaAtual);
            tocandoMusica = true;
        } else if (!ligado) {
            System.out.println("O iPhone está desligado. Ligue o aparelho primeiro.");
        } else {
            System.out.println("A música já está sendo reproduzida.");
        }
    }

    public void pausar() {
        if (ligado && tocandoMusica) {
            System.out.println("Pausando a reprodução da música: " + musicaAtual);
            tocandoMusica = false;
        } else if (!ligado) {
            System.out.println("O iPhone está desligado. Ligue o aparelho primeiro.");
        } else {
            System.out.println("Não há música em reprodução para pausar.");
        }
    }

    public void selecionarMusica(String musica) {
        if (ligado) {
            System.out.println("Selecionando a música: " + musica);
            musicaAtual = musica;
        } else {
            System.out.println("O iPhone está desligado. Ligue o aparelho primeiro.");
        }
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    public void ligar(String numero) {
        if (!ligado) {
            System.out.println("Ligando o iPhone...");
            ligado = true;
        }
        System.out.println("Chamando o número: " + numero);
        numeroChamada = numero;
        emChamada = true;
    }

    public void atender() {
        if (ligado && emChamada) {
            System.out.println("Atendendo a chamada de: " + numeroChamada);
        } else if (!ligado) {
            System.out.println("O iPhone está desligado. Ligue o aparelho primeiro.");
        } else {
            System.out.println("Não há chamadas recebidas para atender.");
        }
    }

    public void iniciarCorreioVoz() {
        if (ligado && emChamada) {
            System.out.println("Iniciando correio de voz...");
            emChamada = false;
        } else if (!ligado) {
            System.out.println("O iPhone está desligado. Ligue o aparelho primeiro.");
        } else {
            System.out.println("Não há chamadas recebidas para iniciar o correio de voz.");
        }
    }

    // Implementação dos métodos da interface NavegadorInternet
    public void exibirPagina(String url) {
        if (ligado) {
            System.out.println("Exibindo página da Internet: " + url);
        } else {
            System.out.println("O iPhone está desligado. Ligue o aparelho primeiro.");
        }
    }

    public void adicionarNovaAba() {
        if (ligado) {
            System.out.println("Nova aba de navegação adicionada.");
        } else {
            System.out.println("O iPhone está desligado. Ligue o aparelho primeiro.");
        }
    }

    public void atualizarPagina() {
        if (ligado) {
            System.out.println("Atualizando a página da Internet...");
        } else {
            System.out.println("O iPhone está desligado. Ligue o aparelho primeiro.");
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