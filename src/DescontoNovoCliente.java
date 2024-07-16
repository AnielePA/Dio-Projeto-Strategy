public class DescontoNovoCliente implements DescontoStrategy {

    @Override
    public double aplicarDesconto(double valorOriginal) {
        //10% de desconto para novos clientes
        return valorOriginal * 0.90;
    }
    

}
