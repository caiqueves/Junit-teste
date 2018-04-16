package aula06.ativ05;

import java.text.DecimalFormat;

public class FormatoMoeda {
    
	public String retornarFormatoMoeda(int reais,int centavos) {
		String retorno = "";
		DecimalFormat dFormatReal = new DecimalFormat("#.00") ;
		DecimalFormat dFormatCentavos = new DecimalFormat("0,###");
		retorno = "R$ " + dFormatReal.format(reais) + dFormatCentavos.format(centavos);
		return retorno;
	}
}
