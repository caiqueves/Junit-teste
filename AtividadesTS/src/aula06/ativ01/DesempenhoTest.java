package aula06.ativ01;

import  org.junit.Assert;
import org.junit.Ignore;
import  org.junit.Test;


public class DesempenhoTest  {

	@Ignore
	public void testValoresValidos1() throws ValorInvalidoException {
		// Dados de entrada e saida - do caso de teste CT01
		float nota1 = 7;
		float nota2 = 8;
		float freq = 88/100;
		boolean esperado = true;
		
		// Execucao do metodo
		Desempenho desempenho = new Desempenho();
		boolean obtido = desempenho.verificarAprovacao(nota1, nota2, freq);
		
		// Verificacao do teste
		Assert.assertEquals("CT01", esperado, obtido);
	}
	

	@Ignore
	public void testValoresValidos2() throws ValorInvalidoException {
		// Dados de entrada e saida - do caso de teste CT01
		float nota1 = 7;
		float nota2 = 7;
		float freq = 75/100;
		boolean esperado = true;
		
		// Execucao do metodo
		Desempenho desempenho = new Desempenho();
		boolean obtido = desempenho.verificarAprovacao(nota1, nota2, freq);
		
		// Verificacao do teste
		Assert.assertEquals("CT04", esperado, obtido);
		
	}
	@Ignore
	@Test(expected=ValorInvalidoException.class)
	public void testValoresInvalidos1() throws ValorInvalidoException {
		// Dados de entrada e saida - do caso de teste CT01
		float nota1 = -1;
		float nota2 = -1;
		float freq = 88/100;
		boolean esperado = true;
		
		// Execucao do metodo
		Desempenho desempenho = new Desempenho();
		boolean obtido = desempenho.verificarAprovacao(nota1, nota2, freq);
		
		// Verificacao do teste
		Assert.assertEquals("CT11", esperado, obtido);
		
	}


}
