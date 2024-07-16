public class DescontoSazonal implements DescontoStrategy{

    @Override
    public double aplicarDesconto(double valorOriginal) {
        //30% de desconto para promoções sazonais
        return valorOriginal * 0.70;
    }
    
}
