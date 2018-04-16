package aula06.ativi06;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Test;

public class AlterarSenha {
	
	@Test
	public void TestandoAlteracaoSenha() throws FileNotFoundException {
		
		VerificarUltimasSenha vus = new VerificarUltimasSenha();
		boolean esperado = true;
		boolean obtido = false;
		
		vus.SenhaDAO();
		
		if (vus.ConsultarSenhasAnteriores("caique") == false) {
			obtido = true;
			System.out.println("Senha Alterada Com sucesso");
		}
		else
		{
			obtido = false;
			System.out.println("Senha Utilizada Anteriormente");
			
		}
	    assertEquals("teste", esperado, obtido);
	}
	

}
