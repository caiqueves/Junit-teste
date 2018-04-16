package aula06.ativ03;

public class TesteCalculadoraOO {

	public static void main(String[] args) {
		
		CalculadoraIPTUService calcService = new CalculadoraIPTUService();
		
		double valorIPTU = calcService.calcularIPTU(TipoImovel.TERRITORIAL, 200000, 0);
		System.out.println(valorIPTU);
	}
}
