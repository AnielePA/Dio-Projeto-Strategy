public class DescontoClienteFiel  implements DescontoStrategy{

    @Override
    public double aplicarDesconto(double valorOriginal) {
        //15% de desconto para clientes fiéis
        return valorOriginal * 0.85;
    
    }
    
    
}
