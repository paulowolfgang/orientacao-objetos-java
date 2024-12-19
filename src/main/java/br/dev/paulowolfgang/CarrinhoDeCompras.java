package br.dev.paulowolfgang;

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
