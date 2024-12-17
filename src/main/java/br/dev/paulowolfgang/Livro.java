package br.dev.paulowolfgang;

/**
 *
 * @author Paulo Silva
 */
public class Livro {
    
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;
    
    void mostrarDetalhes()
    {
        System.out.println("Mostrando detalhes do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        autor.mostrarDetalhes();
        System.out.println("-----");
    }
    
    public void aplicaDescontoDe(double porcentagem)
    {
        this.valor -= this.valor * porcentagem;
    }
}
