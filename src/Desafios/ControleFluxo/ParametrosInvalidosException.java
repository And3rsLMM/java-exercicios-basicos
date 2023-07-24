package Desafios.ControleFluxo;

@SuppressWarnings("serial")
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}