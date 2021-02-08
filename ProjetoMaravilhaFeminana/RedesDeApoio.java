package ProjetoSosMulheres;

public class RedesDeApoio extends Comunicacoes {
	private String tipoDeAcolhimento;

	public RedesDeApoio(String tipoDeAcolhimento) {
		super();
		this.tipoDeAcolhimento = tipoDeAcolhimento;
	}

	public RedesDeApoio(String nome, String email, String tipoDeAcolhimento) {
		super(nome, email);
		this.tipoDeAcolhimento = tipoDeAcolhimento;
	}

	public String getTipoDeAcolhimento() {
		return tipoDeAcolhimento;
	}

	public void setTipoDeAcolhimento(String tipoDeAcolhimento) {
		this.tipoDeAcolhimento = tipoDeAcolhimento;
	}

	@Override
	public String contato() {
		if (tipoDeAcolhimento.equals("Psicol�gico")) {
			return "Sua solicita��o de auxilio psicol�gico ser� respondida em at� 3 dias �teis."
					+ "\nO(a) " + nome + " prestar� o maior aux�lio poss�vel para voc�.";
		}
		else if (tipoDeAcolhimento.equals("Jur�dico")) {
			return "Sua solicita��o de auxilio jur�dico ser� respondida em at� 3 dias �teis."
					+ "\nA Casa das Advogadas n�o deixa nenhuma mulher na m�o.";
		}
		else {
			return "Sua solicita��o de auxilio psicol�gico e jur�dico ser� respondida em at� 3 dias �teis."
		+   "\nO(a) " + nome + " prestar� o maior aux�lio poss�vel para voc�.";
		}
	}

}