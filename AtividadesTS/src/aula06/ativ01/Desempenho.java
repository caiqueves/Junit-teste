package aula06.ativ01;

public class Desempenho {

	public boolean verificarAprovacao(float nota1, float nota2, 
			float frequencia) throws ValorInvalidoException {

		boolean resultado = false;
		
		if (frequencia/100 < 0.75){
			System.out.println("Reprovado por falta");
			resultado = false;
		} else {
			float media = (float) ((nota1 * 0.4) + (nota2 * 0.6));
			
			if (media >= 6.0){
				System.out.println("Aprovado");
				resultado = true;
			}
			else if ((media >=3.0) && (media <=6.0)) {
				System.out.println("Exame Final");
				resultado = false;
			}
			else if (media <=3.0) {
				System.out.println("Reprovado");
				resultado = false;
			}
		}
		return resultado;
	}
  }

