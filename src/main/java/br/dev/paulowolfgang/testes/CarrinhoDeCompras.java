package br.dev.paulowolfgang.testes;

import br.dev.paulowolfgang.produtos.Produto;

/**
 *
 * @author Paulo Silva
 */
public class CarrinhoDeCompras {
    
    private double total;
    
    public double getTotal()
    {
        return total;
    }
    
    public void adiciona(Produto produto)
    {
        System.out.println("Adicionando: " + produto);
        total += produto.getValor();
    }
}
