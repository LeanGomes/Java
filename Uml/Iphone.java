package Uml;

public class Iphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AparelhoTelefonico celular = new AparelhoTelefonico();
		
		celular.ligar("125478");
		celular.atender();
		celular.iniciarCorreioVoz();	
				
		ReprodutorMusical reproduzir = new ReprodutorMusical();
		
		reproduzir.tocar();
		reproduzir.pausar();
		reproduzir.selecionarMusica();
		
		NavegadorInternet navegador = new NavegadorInternet();
		
		navegador.exibirPagina("www.dio.me");
		navegador.adicionarNovaAba();
		navegador.atualizarPagina();
		

	}

}
