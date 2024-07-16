public class Main {
    public static void main(String[] args)  {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

            double valorOriginal = 100.00;

            //Aplicar desconto para novo cliente
            carrinho.setDescontoStrategy(new DescontoNovoCliente());
            System.out.println("Valor final para novo cliente: " + carrinho.calcularValorFinal(valorOriginal));
            

            //Aplicar desconto para cliente fiel
            carrinho.setDescontoStrategy(new DescontoClienteFiel());
            System.out.println("Valor final para cliente fiel: " + carrinho.calcularValorFinal(valorOriginal));

            //Aplicar desconto para cliente VIP
            carrinho.setDescontoStrategy(new DescontoClienteVip());
            System.out.println("Valor final para cliente VIP: " + carrinho.calcularValorFinal(valorOriginal));

            //Aplicar desconto para aniversariante
            carrinho.setDescontoStrategy(new DescontoAniversariante());
            System.out.println("Valor final para aniversariante: " + carrinho.calcularValorFinal(valorOriginal));

            //Aplicar desconto sazonal
            carrinho.setDescontoStrategy(new DescontoSazonal());
            System.out.println("Valor final para promoção sazonal: " + carrinho.calcularValorFinal(valorOriginal));
                
            
    
    }
}
