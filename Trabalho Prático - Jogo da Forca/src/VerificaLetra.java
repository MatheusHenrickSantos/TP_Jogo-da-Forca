
public class VerificaLetra {
	private Boolean palavraVerificada[];
	private OcultaPalavra auxAcerto;
	private Boneco auxErro;
	private String palavra;
	
	JanelaPrincipal palavraEscolhida = new JanelaPrincipal(); 
	
	public void getLetra(char letra) {
		System.out.println("\nLetra escolhida: "+ letra);

		palavra=JanelaPrincipal.getPalavraEscolhida();
		System.out.println("\nPalavra atual: " + palavra);
		
		palavraVerificada = new Boolean[palavra.length()];
		
		for(int i=0; i < palavra.length(); i++) {	// ← A partir da letra e da palavra escolhida eu crio um vetor booleano
			if(palavra.charAt(i)==letra) {			//   que terá o mesmo tamanho da palavra e servirá para decidir se im-
				palavraVerificada[i]=true;			//   prime os acertos ou o boneco indicando a quantidade de erros
			} else {
				palavraVerificada[i]=false;
			}
			
			System.out.println(i + " = " + palavraVerificada[i]);
		}

		for(int i=0; i < palavra.length(); i++) {
			if(palavraVerificada[i]) {
				auxAcerto = new OcultaPalavra();
				auxAcerto.revelaLetra();
			} else {
				auxErro = new Boneco();
				auxErro.imprimeParte();
			}
		}
	}

	public Boolean[] getPalavraVerificada() {
		return palavraVerificada;
	}

}
