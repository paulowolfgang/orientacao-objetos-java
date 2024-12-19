package br.dev.paulowolfgang.testes;

/**
 *
 * @author Paulo Silva
 */
public class CalculadoraDeEstoque {
    public static void main(String[] args) {
        
        double soma = 0;
        
        for(double i = 0; i < 35; i++)
        {
            soma += 59.90;
        }
        
        System.out.println("O total em estoque e: " + soma);
        
        if(soma < 150)
        {
            System.out.println("Seu estoque esta baixo.");
        } else if (soma >= 2000){
            System.out.println("Seu estoque esta muito alto");
        } else {
            System.out.println("Seu estoque esta bom.");
        }
        
        /*
        ### Tipos primitivos
        
        boolean (1 bit)
        byte    (1 byte)
        short   (2 byte)
        char    (2 byte)
        int     (4 byte)
        float   (4 byte)
        long    (8 byte)
        double  (8 byte)
        
        ### Operadores aritméticos
        
        + (soma)
        - (subtração)
        * (multiplicação)
        / (divisão)
        % (módulo)
        += (x = x + x)
        -= (x = x - x)
        *= (x = x * x)
        /= (x = x / x)
        %= (x = x % x)
        
        */
    }
}
