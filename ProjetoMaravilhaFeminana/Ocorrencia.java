package ProjetoSosMulheres;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ocorrencia {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm");
	private Integer numeroDeOcorrencia;
	private String opcaoDaOcorrencia;
	private Date momentoDaOcorrencia;
	
	public Ocorrencia(Integer numeroDeOcorrencia, String opcaoDaOcorrencia, Date momentoDaOcorrencia) {
		super();
		this.numeroDeOcorrencia = numeroDeOcorrencia;
		this.opcaoDaOcorrencia = opcaoDaOcorrencia;
		this.momentoDaOcorrencia = momentoDaOcorrencia;
	}

	public Integer getNumeroDeOcorrencia() {
		return numeroDeOcorrencia;
	}

	public void setNumeroDeOcorrencia(Integer numeroDeOcorrencia) {
		this.numeroDeOcorrencia = numeroDeOcorrencia;
	}

	public String getOpcaoDaOcorrencia() {
		return opcaoDaOcorrencia;
	}

	public void setOpcaoDaOcorrencia(String opcaoDaOcorrencia) {
		this.opcaoDaOcorrencia = opcaoDaOcorrencia;
	}

	public Date getMomentoDaOcorrencia() {
		return momentoDaOcorrencia;
	}

	public void setMomentoDaOcorrencia(Date momentoDaOcorrencia) {
		this.momentoDaOcorrencia = momentoDaOcorrencia;
	}

	@Override
	public String toString() {
		return "Ocorr�ncia #" + numeroDeOcorrencia + ":\nTipo de Ocorr�ncia - " + opcaoDaOcorrencia
				+ "\nMomento da ocorr�ncia - " + sdf.format(momentoDaOcorrencia);
	}
	
	//public File preOcorrencia() {
	//}
	
	
}