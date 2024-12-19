package br.dev.paulowolfgang.produtos;

import br.dev.paulowolfgang.livraria.Autor;

/**
 *
 * @author Paulo Silva
 */
public class LivroFisico extends Livro implements Promocional {
    
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
	return true;
    }
}
