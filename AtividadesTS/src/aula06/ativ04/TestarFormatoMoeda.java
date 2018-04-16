package aula06.ativ04;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestarFormatoMoeda {
 
	@Test
	public void TestandoFormatoMoeda() throws Exception {
		
		FormatoMoeda fm = new FormatoMoeda();
		boolean esperado = true;
		boolean obtido = false;
		String retorno = fm.FormataMascaraMoeda(1, 50);
		if (retorno.equals("R$ 1,50")) {
			obtido = true;
		}else
		{
			obtido = false;
		}
		
		assertEquals(esperado, obtido);
	}
}
