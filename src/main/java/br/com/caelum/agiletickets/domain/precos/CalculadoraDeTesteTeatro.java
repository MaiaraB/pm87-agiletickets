package br.com.caelum.agiletickets.domain.precos;

import java.math.BigDecimal;

import br.com.caelum.agiletickets.models.Sessao;

public class CalculadoraDeTesteTeatro implements CalculoDePreco{

	@Override
	public BigDecimal calcula(Sessao sessao) {
		
		BigDecimal preco;
		
		preco = sessao.getPreco();
		
		return preco;
	}

}
