package aula;

public class A {
	
	//retorna true ou false caso o numero (a) dividido por 2 seja maior ou menor que 5
	public boolean m(Integer a) {
		return a / 2 < 5 ? true : false;
	}
	
	//retorna o numero menor
	public int n(int a, int b) throws Exception {
		if (a < b) {
			return a;
		} else if (a > b) {
			return b;
		}
		throw new Exception();
	}
	
	public String o() {
		return null;
	}
	
	public String p() {
		return "oi";
	}
	//retorna o objeto pessoa contendo o nome "Ana"
	public Pessoa q() {
		Pessoa p = new Pessoa();
		p.nome = "Ana";
		return p;
	}

}
