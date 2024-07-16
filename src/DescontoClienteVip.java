public class DescontoClienteVip implements DescontoStrategy {

    @Override
    public double aplicarDesconto(double valorOriginal) {
        //20% de desconto para clientes VIP
        return valorOriginal * 0.80;
    }
    
}
