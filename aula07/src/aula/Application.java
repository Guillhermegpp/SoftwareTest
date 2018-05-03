package aula;

import java.text.Normalizer;
import java.util.Scanner;

import xml.Cidade;

public class Application {
	/*
	 * Pra que serve tanto códigos? se a vida não é programada e as melhores coisas
	 * não tem lógica
	 */

	public static void main(String[] args) throws Exception {
		UrlCidade c = new UrlCidade();
		Scanner scan = new Scanner(System.in);
		String texto = scan.nextLine();
		String r = c.getXMLCidade((texto));
		System.out.println(r);

		Cidade[] lista = c.xmlToObjectCidade(r);
		for (Cidade cidade : lista) {
			System.out.println(cidade);
		}
	}

}
