package br.com.caelum.agiletickets.models;

import br.com.caelum.agiletickets.domain.precos.CalculadoraDePrecoBallet;
import br.com.caelum.agiletickets.domain.precos.CalculadoraDePrecoCinema;
import br.com.caelum.agiletickets.domain.precos.CalculadoraDePrecoOrquestra;
import br.com.caelum.agiletickets.domain.precos.CalculadoraDePrecoShow;
import br.com.caelum.agiletickets.domain.precos.CalculadoraDeTesteTeatro;
import br.com.caelum.agiletickets.domain.precos.CalculoDePreco;

public enum TipoDeEspetaculo {
	
	CINEMA {
		@Override
		public CalculoDePreco calculador() {
			return new CalculadoraDePrecoCinema();
		}
	}, SHOW {
		@Override
		public CalculoDePreco calculador() {
			return new CalculadoraDePrecoShow();
		}
	}, TEATRO {
		@Override
		public CalculoDePreco calculador() {
			return new CalculadoraDeTesteTeatro();
		}
	}, BALLET {
		@Override
		public CalculoDePreco calculador() {
			return new CalculadoraDePrecoBallet();
		}
	}, ORQUESTRA {
		@Override
		public CalculoDePreco calculador() {
			return new CalculadoraDePrecoOrquestra();
		}
	};
	
	public abstract CalculoDePreco calculador();
	
}
