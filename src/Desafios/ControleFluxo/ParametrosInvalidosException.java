package Desafios.ControleFluxo;

@SuppressWarnings("serial")
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("O segundo par�metro deve ser maior que o primeiro");
    }
}