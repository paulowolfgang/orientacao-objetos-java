package br.dev.paulowolfgang;

/**
 *
 * @author Paulo Silva
 */
public class CadastroDeLivros {
    
    public static void main(String[] args) {
        
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789-10");
        
        Livro livro = new LivroFisico(autor);
        livro.setNome("Java 8 Pratico");
        livro.setDescricao("Novos recursos da linguagem.");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");
        livro.mostrarDetalhes();
        
    }
}
