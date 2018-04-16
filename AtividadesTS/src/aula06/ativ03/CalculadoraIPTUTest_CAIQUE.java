package aula06.ativ03;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraIPTUTest_CAIQUE {
	
	@Test
	public void testeCalculadoraIPTU() throws Exception {
		
		CalculadoraIPTUService calcService = new CalculadoraIPTUService();
		
		boolean esperado = true;
		int TipoImovel1 = 0;
		float ValorImovel = 0f;
		double ValorDesconto;
		double ValorIPTU;
		float Valor30DescontosIPTU;
		boolean obtido = false;
		
		//1-Residencial 2-Não Residencial 3-Territorial
		TipoImovel1 = 3; 
		
		//Inserir os valores somente com a parte real
		ValorImovel = 200000f; 
		
		//Valor Máximo do desconto é de 30% do IPTU calculado
		ValorDesconto = 400; 
				
		ValorIPTU = calcService.calcularIPTU(TipoImovel.toEnum(TipoImovel1), ValorImovel, 0);
		Valor30DescontosIPTU = (float) ((ValorIPTU/100)*30);
		
		if (Util.arredondarValor(ValorDesconto,2) > Util.arredondarValor(Valor30DescontosIPTU,2)) 
			 throw new Exception ("Valor Máximo do desconto é de 30% do IPTU calculado");
		else
			ValorIPTU = Util.arredondarValor(ValorIPTU - ValorDesconto, 2);
			obtido = true;
		
		Assert.assertEquals("CT03", esperado,obtido); 
		System.out.println("Valor do IPTU :"+ValorIPTU + " - Teste efetuado");
	 }
}
