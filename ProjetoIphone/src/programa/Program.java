package programa;
import iphone.classe.classe.iphone;

public class Program {

	public static void main(String[] args) {
		
		iphone iphone  = new iphone();	
		
			System.out.println("************************************");
			System.out.println("*** INICIANDO O SERVICO DE TELEFONIA***");
			System.out.println("************************************");
			iphone.atender();
			iphone.ligar("81 - 21216060");
			iphone.iniciarCorreioVoz();
		
			System.out.println("************************************");
			System.out.println("*** INICIANDO O SERVICO NAVEÇÃO ***");
			System.out.println("************************************");
			
			iphone.adicionarNovaAba();
			iphone.atualizarPagina();
			iphone.exibirPagina("Pagina");
			
			System.out.println("************************************");
			System.out.println("*** INICIANDO O SERVICO MUSICAL ***");
			System.out.println("************************************");
			
			iphone.selecionarMusica("ROBERTO CALALOS");
			iphone.tocar();
			iphone.pausar();
			
			
			
	}

}
