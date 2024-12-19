package br.dev.paulowolfgang.produtos;

/**
 *
 * @author Paulo Silva
 */
public interface Promocional {
    
    boolean aplicaDescontoDe(double porcentagem);
    
    default boolean aplicaDescontoDe10Porcento()
    {
        return aplicaDescontoDe(0.1);
    }
}
