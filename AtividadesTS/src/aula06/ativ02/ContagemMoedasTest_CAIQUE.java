package aula06.ativ02;

import org.junit.Assert;
import org.junit.Test;


public class ContagemMoedasTest_CAIQUE {
   
	@Test
	public void testNotasAlunos() throws Exception {
		
		boolean esperado = true;
		boolean obtido  =  false;
		
		ContagemMoedas CM = new ContagemMoedas();
	    
		//Quantidade Moedas
		float [] moedas = {1, 9, -10, 25, 5, 1}; 
		//Array retorno
		float[] retorno;  
		
		retorno = CM.calcularValorMoedas(moedas);
		
		if ((retorno == null) || (retorno.length == 0)){  
			obtido = false;
			//throw new Exception ("Não foi possível efetuar a contagem de moedas.");
		}else  {
			obtido = true;
		}
		
		Assert.assertEquals("CT02", esperado,obtido);
		System.out.println("Reais: "+retorno[0]+" Centavos: " +retorno[1]);
	}
}
