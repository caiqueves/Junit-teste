package aula06.ativ01;

public class ValorInvalidoException extends Exception {
    
	private static final long serialVersionUID = 1L;
	 
	
	public ValorInvalidoException()  {		
	}

	public void validanota1(float nota1)
	{
		if ((nota1 <= 0) || (nota1 > 10)) 
			throw new IllegalArgumentException( "campo nota 1 -> Não está no formato válido");		
	}
	
	public void validanota2(float nota2) 
	{
		if ((nota2 <= 0) || (nota2 > 10)) 
		throw new IllegalArgumentException( "campo nota 2 -> Não está no formato válido");		
	}

	public void validaFrequencia(float frequencia)
	{
		if ((frequencia/100 <= 0) || (frequencia/100 > 1))
			throw new IllegalArgumentException( "campo frequencia -> Não está no formato válido");
	}
}
