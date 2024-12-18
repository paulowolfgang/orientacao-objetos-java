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
    
    public void adiciona(Livro livro)
    {
        System.out.println("Adicionando: " + livro);
        livro.aplicaDescontoDe(0.05);
        total += livro.getValor();
    }
}
