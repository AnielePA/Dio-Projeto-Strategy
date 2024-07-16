# Projeto: Sistema de Desconto em Loja utilizando o padrão Strategy
Este é um projeto simples que demonstra o uso do padrão de projeto Strategy para aplicar diferentes tipos de desconto em uma loja.

# Estrutura do Projeto

1. Interface DescontoStrategy: Define um método aplicarDesconto que será implementado por todas as estratégias de desconto.

2. Classes Concretas: DescontoNovoCliente, DescontoClienteFiel, DescontoClienteVIP, DescontoAniversariante e DescontoSazonal implementam a interface DescontoStrategy e definem diferentes regras de desconto.

3. Contexto (CarrinhoDeCompras): Utiliza uma estratégia de desconto que pode ser alterada dinamicamente.

4. Classe Principal (Main): Demonstra a troca de estratégias de desconto em um carrinho de compras.

 
   ---Este é um desafio de projeto da Digital Innovation One---
