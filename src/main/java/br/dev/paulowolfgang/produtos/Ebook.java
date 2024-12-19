package br.dev.paulowolfgang.produtos;

import br.dev.paulowolfgang.livraria.Autor;

/**
 *
 * @author Paulo Silva
 */
public class Ebook extends Livro implements Promocional {
    
    private String waterMark;
    
    public Ebook(Autor autor)
    {
        super(autor);
    }
    
    public String getWaterMark()
    {
        return waterMark;
    }
    
    public void setWaterMark(String waterMark)
    {
        this.waterMark = waterMark;
    }
    
    @Override
    public boolean aplicaDescontoDe(double porcentagem)
    {
        if (porcentagem > 0.15)
        {
            return false;
        }
		
        double desconto = getValor() * porcentagem;
	setValor(getValor() - desconto);
	return true;
    }
}
