package aula06.ativi06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VerificarUltimasSenha {

	private List<String> listaSenhas = new ArrayList<>();

	public void SenhaDAO() throws FileNotFoundException {

		File file = new File("Senhas.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {

			String SENHA = sc.nextLine();
			listaSenhas.add(SENHA);

		}
	}

	public boolean ConsultarSenhasAnteriores(String senhaAutal) {
		boolean retorno = false;
		for (String ls : listaSenhas) {
			if (ls.equals(senhaAutal)) {
				retorno = true;
			} else {
				retorno = false;
			}
		}
		return retorno;
	}

}
