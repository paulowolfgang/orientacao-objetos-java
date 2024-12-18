package br.dev.paulowolfgang;

/**
 *
 * @author Paulo SIlva
 */
public class RegraDeDesconto {
    
    public static void main(String[] args) {
        
        Livro livro = new Livro();
        livro.setValor(59.90);
        
        System.out.println("Valor atual: " + livro.getValor());
        
        if(!livro.aplicaDescontoDe(0.1))
        {
            System.out.println("Desconto nao pode ser maior que 30%!");
        } else {
            System.out.println("Valor com desconto: " + livro.getValor());
        }
    }
}
