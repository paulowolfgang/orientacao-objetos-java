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
    
    @Override
    public boolean aplicaDescontoDe(double porcentagem)
    {
        if(porcentagem > 0.3)
        {
            return false;
        }
        
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Aplicando desconto no livro fisico.");
        return true;
    }
}
