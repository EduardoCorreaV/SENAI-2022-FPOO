
public abstract class Pessoa {

	private String nome;
	private String cpf;
	private String rg;
	private String dtNas;
	
	public Pessoa(String nome, String cpf, String rg, String dtNas) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dtNas = dtNas;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDtNas() {
		return dtNas;
	}
	public void setDtNas(String dtNas) {
		this.dtNas = dtNas;
	}
	
	
	
}
