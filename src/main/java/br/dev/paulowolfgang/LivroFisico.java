package br.dev.paulowolfgang;

/**
 *
 * @author Paulo Silva
 */
public class LivroFisico extends Livro {
    
    public LivroFisico(Autor autor)
    {
        super(autor);
    }
    
    public double getTaxaImpressao()
    {
        return this.getValor() * 0.5;
    }
}
