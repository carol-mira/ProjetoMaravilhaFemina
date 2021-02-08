package ProjetoSosMulheres;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		// Wannabe banco de dados
		RedesDeApoio acolheAcolhedora = new RedesDeApoio("Acolhe(dora)", "contat@acolhedora.org", "Psicol�gico");
		RedesDeApoio casaDasAdvogadas = new RedesDeApoio("Casa das Advogadas", "contato@casadasadv.org", "Jur�dico");
		RedesDeApoio mapaDoAcolhimento = new RedesDeApoio("Mapa de Acolhimento", "contato@mapadoacolhimento.org",
				"Psicol�gico e Jur�dico");
		Delegacia delegaciaDaMulher = new Delegacia((int) (Math.random() * 30.0 + (1.0)), "Piraporinha");
		// Fim do banco de dados

		String nome, CPF, telefone, endereco, email, nomeProxima, telefoneProxima, relacao;
		char respostaCerteza, dados, respostaCertezaPessoa, respostaAdicionarPessoa;
		int numeroDaOcorrencia = 1, idade;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Bem-vinda ao Maravilha Feminina.\nA sua seguran�a � a nossa prioridade.");
			System.out.println("\nInsira seus dados: \nQual � o seu nome?");
			nome = sc.nextLine();
			System.out.println("\nQual � a sua idade?");
			try {
				idade = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nPor favor, insira um n�mero para a idade.");
				sc.next();
				idade = sc.nextInt();
			}
			System.out.println("\nInsira o seu CPF:");
			CPF = sc.next();
			System.out.println("\nQual o seu endere�o?");
			sc.nextLine();
			endereco = sc.nextLine();
			System.out.println("\nQual � o seu telefone?");
			telefone = sc.next();
			System.out.println("\nQual � o seu email?");
			email = sc.next();
			System.out.println("\nNome: " + nome + "\nIdade: " + idade + "\nCPF: " + CPF + "\nEndereco: " + endereco
					+ "\nTelefone: " + telefone + "\nEmail: " + email);

			System.out.println("\nOs seus dados est�o corretos? (S/N)");
			dados = sc.next().charAt(0);
			if (dados != 'S' || dados != 's') {
				sc.nextLine();
			}
		} while (dados != 'S' && dados != 's');
		Mulher mulher = new Mulher(nome, idade, CPF, endereco, telefone, email);

		System.out.println("\nEstamos quase concluindo seu cadastro...");
		System.out.println("\nGostaria de adicionar uma pessoa que voc� confie? (S/N)");
		char resposta = sc.next().charAt(0);

		do {
			if (resposta == 's' || resposta == 'S') {
				do {
					do {
						System.out.println("\nQual � o nome dessa pessoa?");
						sc.nextLine();
						nomeProxima = sc.nextLine();
						System.out.println("\nQual � o n�mero se caso precisarmos ligar para ela?");
						telefoneProxima = sc.next();
						System.out.println("\nQual � a sua rela��o com ela?(m�e/amigo(a)/namorado(a))");
						sc.nextLine();
						relacao = sc.nextLine();
						System.out.println("Nome: " + nomeProxima + "\nTelefone: " + telefoneProxima
								+ "\nRela��o: " + relacao);
						System.out.println("Confirma os dados desta pessoa? (S/N)");
						respostaCertezaPessoa = sc.next().charAt(0);
					} while (respostaCertezaPessoa != 's' && respostaCertezaPessoa != 'S');

					PessoaProxima pessoa = new PessoaProxima(nomeProxima, telefoneProxima, relacao);
					mulher.adicionarPessoaProxima(pessoa);
					respostaCerteza = 's';
					System.out.println("Deseja adicionar outra pessoa? (S/N)");
					respostaAdicionarPessoa = sc.next().charAt(0);
				} while (respostaAdicionarPessoa != 'n' && respostaAdicionarPessoa != 'N');
			}

			else {
				System.out.println("\nTem certeza? � muito importante para a sua seguran�a!");
				respostaCerteza = sc.next().charAt(0);
				if (respostaCerteza == 'n' || respostaCerteza == 'N') {
					resposta = 's';
					System.out.println("Encaminharemos voc� para o cadastro da pessoa.");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						Thread.currentThread().interrupt();
					}
				}
			}
		} while (respostaCerteza != 's' && respostaCerteza != 'S');

		System.out.println("\nTudo pronto!");

		for (int i = 0; i <= 3; i++) {
			System.out.println("\nComo podemos te ajudar neste momento?");
			System.out.println("1 - Acionar a pol�cia//2 - Relatar o ocorrido //"
					+ "3 - Encontrar Redes de Apoio//4 - Imprimir lista de ocorr�ncias//");
			int opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				String agressao = "Agress�o e/ou amea�a";
				Date agora = new Date();
				System.out.println("\nSua ocorr�ncia foi registrada.");
				System.out.println("\n" + delegaciaDaMulher.contato());
				Ocorrencia ocorrencia = new Ocorrencia(numeroDaOcorrencia, agressao, agora);
				mulher.adicionarOcorrencia(ocorrencia);
				numeroDaOcorrencia++;
				try {
					Thread.sleep(2300);
				} catch (InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
				System.out.println();
				System.out.println(mulher);
				System.out.println(ocorrencia);
				System.out.println("Estamos ligando para a sua pessoa de confian�a.");
				break;

			case 2:
				System.out.println("Qual delito foi cometido?");
				sc.nextLine();
				String delito = sc.nextLine();
				System.out.println("Entraremos em contato em breve para te orientar.");
				try {
					Thread.sleep(2700);
				} catch (InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
				Date momento = new Date();
				Ocorrencia ocorrenciaTipo2 = new Ocorrencia(numeroDaOcorrencia, delito, momento);
				mulher.adicionarOcorrencia(ocorrenciaTipo2);
				numeroDaOcorrencia++;
				System.out.println();
				System.out.println(mulher);
				System.out.println(ocorrenciaTipo2);
				break;

			case 3:
				System.out.println();
				System.out.println("Precisa de apoio psicol�gico ou jur�dico?"
						+ "\nP - Psicol�gico// J - Jur�dico// A - Ambos");
				char psiOuJur = sc.next().charAt(0);
				sc.nextLine();
				if (psiOuJur == 'p' || psiOuJur == 'P') {
					System.out.println();
					System.out.println(acolheAcolhedora.contato());
				} else if (psiOuJur == 'j' || psiOuJur == 'J') {
					System.out.println();
					System.out.println(casaDasAdvogadas.contato());
				} else {
					System.out.println();
					System.out.println(mapaDoAcolhimento.contato());
				}
				System.out.println("Fique tranquila, " + mulher.getNome() + ", estamos juntos com voc� nesta.");
				break;

			case 4:
				mulher.toString2();
				break;
			}
		}
		System.out.println(" ... E seja protagonista de um final feliz.");
		sc.close();
	}
}