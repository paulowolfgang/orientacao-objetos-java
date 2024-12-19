package br.dev.paulowolfgang.produtos;

import br.dev.paulowolfgang.exception.AutorNuloException;
import br.dev.paulowolfgang.livraria.Autor;

/**
 *
 * @author Paulo Silva
 */
public abstract class Livro implements Produto {
    
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private boolean impresso;
    
    public Livro(Autor autor)
    {
        if(autor == null)
        {
            throw new AutorNuloException("O autor do livro não pode ser nulo.");
        }
        
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getDescricao()
    {
        return descricao;
    }
    
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
    
    public double getValor()
    {
        return valor;
    }
    
    public void setValor(double valor)
    {
        this.valor = valor; 
    }
    
    public String getIsbn()
    {
        return isbn;
    }
    
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
    
    public Autor getAutor()
    {
        return autor;
    }
    
    public void setAutor(Autor autor)
    {
        this.autor = autor;
    }
    
    boolean temAutor() {
        return this.autor != null;
    }
    
    public void mostrarDetalhes()
    {
        System.out.println("Mostrando detalhes do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        
        if (this.temAutor()) {
            autor.mostrarDetalhes();
	}
        
        System.out.println("-----");
    }
}
