package br.dev.paulowolfgang.testes;

import br.dev.paulowolfgang.produtos.Produto;

/**
 *
 * @author Paulo Silva
 */
public class CarrinhoDeCompras {
    
    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador = 0;
    
    public double getTotal()
    {
        return total;
    }
    
    public void adiciona(Produto produto)
    {
        System.out.println("Adicionando: " + produto);
        this.produtos[contador] = produto;
        contador++;
        total += produto.getValor();
    }
}
