package br.dev.paulowolfgang;

/**
 *
 * @author Paulo Silva
 */
public class Autor {
    
    String nome;
    String email;
    String cpf;
    
    void mostrarDetalhes()
    {
        System.out.println("Mostrando detalhes do autor");
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("CPF: " + cpf);
    }
}
