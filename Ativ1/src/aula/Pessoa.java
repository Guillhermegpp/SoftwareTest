package aula;

public class Pessoa {
	public String nome;
	
	
	//sobrescrever o metodo equals para descobrir se os dois obj tem o mesmo nome
	@Override
	public boolean equals(Object o) {
		Pessoa p = (Pessoa) o;
		return p.nome == this.nome;
	}
}
