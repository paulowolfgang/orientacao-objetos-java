package br.dev.paulowolfgang.testes;

import br.dev.paulowolfgang.livraria.Autor;
import br.dev.paulowolfgang.produtos.Ebook;
import br.dev.paulowolfgang.produtos.LivroFisico;

/**
 *
 * @author Paulo Silva
 */
public class RegistroDeVendas {
    
    public static void main(String[] args) {
        
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");
        
        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setNome("Test Driven Development");
        livroFisico.setValor(59.90);
        
        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test Driven Development");
        ebook.setValor(29.90);
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.adiciona(livroFisico);
        carrinho.adiciona(ebook);
        
        System.out.println("Total: " + carrinho.getTotal());
    }
}
