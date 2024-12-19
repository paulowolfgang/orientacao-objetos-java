package br.dev.paulowolfgang;

/**
 *
 * @author Paulo Silva
 */
public class RegraDeDesconto {
    
    public static void main(String[] args) {
        
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        
        LivroFisico livro = new LivroFisico(autor);
        livro.setValor(39.90);
        
        if (!livro.aplicaDescontoDe(0.3)){
            System.out.println("Desconto no livro não pode ser maior do que 30%");
	} else {
            System.out.println("Valor do livro com desconto: " + livro.getValor());
        }
        
        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.3);
        
        if (!ebook.aplicaDescontoDe(0.15)){
            System.out.println("Desconto no ebook não pode ser maior do que 15%");
	} else {
            System.out.println("Valor do ebook com desconto: " + ebook.getValor());
        }
    }
}
