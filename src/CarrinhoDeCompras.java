public class CarrinhoDeCompras {
    private DescontoStrategy descontoStrategy;

    public void
    setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double calcularValorFinal(double valorOriginal) {
        if(descontoStrategy == null) {
            return valorOriginal;
        }
        return
    descontoStrategy.aplicarDesconto(valorOriginal);
    }
}
