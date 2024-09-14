package poo;

/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		Message msn = new Message();
		
		//msn.validarConectadoInternet();
		msn.enviarMensagem();
		//msn.salvarHistoricoMensagem();
		
		msn.receberMensagem();
	}
}