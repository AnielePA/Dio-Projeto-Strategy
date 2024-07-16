public class DescontoAniversariante implements DescontoStrategy {

    @Override
    public double aplicarDesconto(double valorOriginal) {
        //25% de desconto para aniversariantes
        return valorOriginal * 0.75;
    }
    
}
