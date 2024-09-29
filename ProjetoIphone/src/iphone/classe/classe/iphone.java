package iphone.classe.classe;

import iphone.classe.interfc.AparelhoTelefonico;
import iphone.classe.interfc.Navegador;
import iphone.classe.interfc.ReprodutorMusical;

public class iphone implements AparelhoTelefonico, Navegador, ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Comercando a torcar  !");
	}

	@Override
	public void pausar() {
		System.out.println("Musico pausada !");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("A musica selecionada foi : "+ musica);
}
	
	
	@Override
	public void exibirPagina(String url) {
		System.out.println("Pagina exida !");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba aberta !");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina atualizada !");
		
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o numero: "+ numero );
	}

	@Override
	public void atender() {
		System.out.println("Ligação Atendida ");	
	}
	
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando a conversa de voz ");
		
	}

}
