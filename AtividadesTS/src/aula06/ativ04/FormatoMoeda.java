package aula06.ativ04;



//import java.lang.Object;;

public class FormatoMoeda {

	public String FormataMascaraMoeda(int real, int centavos) throws Exception {

		String valorReal 	= Integer.toString(real);
		String valorCentavos= Integer.toString(centavos);		
		String retorno 		= "R$ ";
		String caracter 	= "";
		String sinal		= "-";
		int count 			= 0;

		if (centavos < 0) {
			throw new Exception("Valor inválido referente aos centavos.");
		}

		StringBuilder stringBuilder = new StringBuilder(valorReal);

		for(int i = valorReal.length(); i >= 0; i-- ) {
			if(count==3) {
				if (i-1>=0) {
					caracter = Character.toString(valorReal.charAt(i-1));
					if (!sinal.contains(caracter)) {
						if(i-1>=0) {
							stringBuilder.insert(i, ".");
							count = 0;
						}
					}
				}
			}
			count++;
		}		

		if(valorCentavos.length()==1) {
			valorCentavos = '0'+valorCentavos;
		} else {
			if(valorCentavos.length()>2) {
				valorCentavos = valorCentavos.substring(0, 2);
			}
		}

		valorReal = stringBuilder.toString();
		retorno += valorReal + ',' + valorCentavos;

		return retorno;

	}
}