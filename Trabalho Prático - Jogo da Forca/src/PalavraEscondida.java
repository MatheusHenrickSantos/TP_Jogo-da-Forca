
public class PalavraEscondida {
	private String palavra;

	ListaPalavras lista = new ListaPalavras();
	MenuTema temaDoMenu = new MenuTema();
	
	public String getPalavra() {
		System.out.println("\nEscolher palavra da lista - OK");

		switch(temaDoMenu.getTema()) {	// ← A partir do tema obtido do menu eu escolho uma palavra da lista
		case 1:
			palavra=lista.getCidade();			
			break;
		case 2:
			palavra=lista.getPaises();			
			break;
		default:
			break;
		}
		
		System.out.println("\nPalavra escolhida foi: " + palavra);
		return palavra;
	}
}
