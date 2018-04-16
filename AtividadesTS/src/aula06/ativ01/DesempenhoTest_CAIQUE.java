package aula06.ativ01;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class DesempenhoTest_CAIQUE {

	@Ignore
	public void testNotasAlunos2() throws Exception {

		boolean esperado = true;

		float nota1; // = 7;
		float nota2; // = 8;
		float freq; // = 0.75f;

		ValorInvalidoException Vie = new ValorInvalidoException();

		nota1 = 8.0f;
		Vie.validanota1(nota1);

		nota2 = 6.0f;
		Vie.validanota2(nota2);

		freq = 65f;
		Vie.validaFrequencia(freq);

		// Execucao do metodo
		Desempenho desempenho = new Desempenho();
		boolean obtido = desempenho.verificarAprovacao(nota1, nota2, freq);

		// Verificacao do teste
		Assert.assertEquals("CT02", esperado, obtido);
	}
	@Ignore
	public void testNotasAlunos3() throws Exception {

		boolean esperado = true;

		float nota1; // = 7;
		float nota2; // = 8;
		float freq; // = 0.75f;

		ValorInvalidoException Vie = new ValorInvalidoException();

		nota1 = 7.0f;
		Vie.validanota1(nota1);

		nota2 = 8.0f;
		Vie.validanota2(nota2);

		freq = 88f;
		Vie.validaFrequencia(freq);

		// Execucao do metodo
		Desempenho desempenho = new Desempenho();
		boolean obtido = desempenho.verificarAprovacao(nota1, nota2, freq);

		// Verificacao do teste
		Assert.assertEquals("CT03", esperado, obtido);
	}
    
	@Ignore
	public void testNotasAlunos4() throws Exception {

		boolean esperado = true;

		float nota1; // = 7;
		float nota2; // = 8;
		float freq; // = 0.75f;

		ValorInvalidoException Vie = new ValorInvalidoException();

		nota1 = 7.0f;
		Vie.validanota1(nota1);

		nota2 = 8.0f;
		Vie.validanota2(nota2);

		freq = 50f;
		Vie.validaFrequencia(freq);

		// Execucao do metodo
		Desempenho desempenho = new Desempenho();
		boolean obtido = desempenho.verificarAprovacao(nota1, nota2, freq);

		// Verificacao do teste
		Assert.assertEquals("CT04", esperado, obtido);
	}
    
	@Ignore
	public void testNotasAlunos5() throws Exception {

		boolean esperado = true;

		float nota1; // = 7;
		float nota2; // = 8;
		float freq; // = 0.75f;

		ValorInvalidoException Vie = new ValorInvalidoException();

		nota1 = 5.0f;
		Vie.validanota1(nota1);

		nota2 = 6.0f;
		Vie.validanota2(nota2);

		freq = 90f;
		Vie.validaFrequencia(freq);

		// Execucao do metodo
		Desempenho desempenho = new Desempenho();
		boolean obtido = desempenho.verificarAprovacao(nota1, nota2, freq);

		// Verificacao do teste
		Assert.assertEquals("CT05", esperado, obtido);
	}
    
	@Ignore
	public void testNotasAlunos6() throws Exception {

		boolean esperado = true;

		float nota1; // = 7;
		float nota2; // = 8;
		float freq; // = 0.75f;

		ValorInvalidoException Vie = new ValorInvalidoException();

		nota1 = 7.0f;
		Vie.validanota1(nota1);

		nota2 = 6.0f;
		Vie.validanota2(nota2);

		freq = 75f;
		Vie.validaFrequencia(freq);

		// Execucao do metodo
		Desempenho desempenho = new Desempenho();
		boolean obtido = desempenho.verificarAprovacao(nota1, nota2, freq);

		// Verificacao do teste
		Assert.assertEquals("CT06", esperado, obtido);
	}
	
	@Ignore
	public void testNotasAlunos7() throws Exception {

		boolean esperado = true;

		float nota1; // = 7;
		float nota2; // = 8;
		float freq; // = 0.75f;

		ValorInvalidoException Vie = new ValorInvalidoException();

		nota1 = 6.0f;
		Vie.validanota1(nota1);

		nota2 = 6.0f;
		Vie.validanota2(nota2);

		freq = 45f;
		Vie.validaFrequencia(freq);

		// Execucao do metodo
		Desempenho desempenho = new Desempenho();
		boolean obtido = desempenho.verificarAprovacao(nota1, nota2, freq);

		// Verificacao do teste
		Assert.assertEquals("CT07", esperado, obtido);
	}
	
	@Test
	public void testNotasAlunos8() throws Exception {

		boolean esperado = true;

		float nota1; // = 7;
		float nota2; // = 8;
		float freq; // = 0.75f;

		ValorInvalidoException Vie = new ValorInvalidoException();

		nota1 = 6.0f;
		Vie.validanota1(nota1);

		nota2 = 5.0f;
		Vie.validanota2(nota2);

		freq = 75f;
		Vie.validaFrequencia(freq);

		// Execucao do metodo
		Desempenho desempenho = new Desempenho();
		boolean obtido = desempenho.verificarAprovacao(nota1, nota2, freq);

		// Verificacao do teste
		Assert.assertEquals("CT08", esperado, obtido);
	}
}
