package xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "cidade")
@XmlType(propOrder = { "nome", "uf", "id" })
public class Cidade {
	@XmlElement(name = "id")
	private Integer id;
	@XmlElement(name = "nome")
	private String nome;
	@XmlElement(name = "uf")
	private String uf;
	@XmlElement(name = "atualizacao")
	private String atualizacao;

	public String getAtualizacao() {
		return atualizacao;
	}
	public void setAtualizacao(String atualizacao) {
		this.atualizacao = atualizacao;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getUf() {
		return uf;
	}
	
}
