package edu.cesmac.br.home;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Filmes filme1 = new Filmes();
		filme1.nome = "1 - Adão Negro";
		filme1.diretor = "Jaume Collet-Serra";
		filme1.descricao = "Adão Negro é o filme solo do anti-herói, baseado no personagem em quadrinhos Black Adam (Dwayne Johnson) da DC Comics, grande antagonista de Shazam!, tendo no longa, sua história de origem explorada, e revelando seu passado de escravo no país Kahndaq.";
		filme1.genero = "Ação, Aventura, Fantasia";
		filme1.duracao = "2h05min";
		
		Filmes filme2 = new Filmes();
		filme2.nome = "2 - A Mulher-Rei";
		filme2.diretor = "Gina Prince-Bythewood";
		filme2.descricao = "A Mulher Rei acompanha Nanisca (Viola Davis) que foi uma comandante do exército do Reino de Daomé, um dos locais mais poderosos da África nos séculos XVII e XIX.";
		filme2.genero = "Histórico, Drama, Ação";
		filme2.duracao = "2h15min";
		
		Filmes filme3 = new Filmes();
		filme3.nome = "3 - A Fera";
		filme3.diretor = "Baltasar Kormákur";
		filme3.descricao = "Em A Fera, Dr. Nate Daniels (Idris Elba) é um homem que perdeu a mulher recentemente. Para viver o luto, ele decide retornar à África do Sul, local onde conheceu sua falecida esposa, para passar férias há muito planejadas com suas duas filhas (Iyana Halley e Leah Jeffries) em uma reserva natural administrada pelo velho amigo da família Martin Battles (Sharlto Copley), um biólogo da vida selvagem. ";
		filme3.genero = "Suspense, Ação, Drama";
		filme3.duracao = "1h33min";
		
		Filmes filme4 = new Filmes();
		filme4.nome = "4 - Não, Não Olhe!";
		filme4.diretor = "Jordan Peele";
		filme4.descricao = "Novo filme de terror do diretor Jordan Peele (Corra e Nós). Em Não! Não Olhe! uma cidade do interior da Califórnia começa a ter eventos bizarros e extraterrestres.";
		filme4.genero = "Terror, Suspense, Ficção Científica";
		filme4.duracao = "2h10min";
		
	
		
		JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao CineTech! Iremos continuar nossa comunicação pelo terminal para melhor entendimento, ok?");
		System.out.println("------------------------ +++ CineTech +++ ------------------------");
		System.out.println("Bem, no dia de hoje temos os seguintes filmes em cartaz para você: ");
		System.out.println(filme1);
		System.out.println("/////////////////////////////////////////");
		System.out.println(filme2);
		System.out.println("/////////////////////////////////////////");
		System.out.println(filme3);
		System.out.println("/////////////////////////////////////////");
		System.out.println(filme4);
		System.out.println("/////////////////////////////////////////");
		
		int escolha;
		escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número do filme que você deseja assistir hoje: "));
		
		if (escolha == 1)
			JOptionPane.showConfirmDialog(null, "Você escolheu o filme: " + filme1.nome + "." + " Confirma?");
		else if (escolha == 2)
			JOptionPane.showConfirmDialog(null, "Você escolheu o filme: " + filme2.nome + "." + " Confirma?");
		else if (escolha == 3)
			JOptionPane.showConfirmDialog(null, "Você escolheu o filme: " + filme3.nome + "." + " Confirma?");
		else if (escolha == 4)
			JOptionPane.showConfirmDialog(null, "Você escolheu o filme: " + filme4.nome + "." + " Confirma?");
		
		JOptionPane.showMessageDialog(null, "Ótima escolha! Vamos agora para a compra do(s) ingresso(s)?");
		Ingressos classe = new Ingressos();
		JOptionPane.showInputDialog(null, "Digite o número da sala que deseja para ir assistir: " + classe.sessao1 + " - / - " + classe.sessao2 + " - / - " + classe.sessao3 + " - / - " + classe.sessao4 + "");
		JOptionPane.showMessageDialog(null, "Certo, os preços do ingressos são: Inteira = R$24 e Meia-Entrada = R$12");
		
		int inteira;
		int meiaEntrada;
		int valor;
		
		
		inteira = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos ingressos do tipo 'Inteira' você irá comprar para essa sessão?"));
		meiaEntrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos ingressos do tipo 'Meia-Entrada' você irá comprar para essa sessão?"));
		valor = (inteira * 24) + (meiaEntrada * 12);
		JOptionPane.showConfirmDialog(null, "O valor do(s) ingresso(s) deu: R$" + valor + ", confere?");
		JOptionPane.showMessageDialog(null, "Ótimo! Seu ticket está sendo gerado no terminal. Por favor, pegue o seu ticket e vá para o caixa confirmar o pagamento e seu lugar na sessão!");
		JOptionPane.showMessageDialog(null, "O CineTech agradece pela sua preferência e deseja um ótima filme!");
		
	
		
		
		
		
		
		
	}

}
