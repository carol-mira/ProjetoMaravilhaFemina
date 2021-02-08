package ProjetoSosMulheres;

public abstract class Comunicacoes {
	protected String nome;
	protected String email;
	
	public Comunicacoes() {
	}

	public Comunicacoes(String nome,String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract String contato();

}