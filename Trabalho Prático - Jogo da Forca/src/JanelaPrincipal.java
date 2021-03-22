
public class JanelaPrincipal extends ModeloJanela{
	private static PalavraEscondida palavraEscondida;
	private static String palavraEscolhida;
	private static char botao='N';	// ← A letra escolhida foi N e para o caso de teste estará fixa em N
	
	static VerificaLetra verificaLetra = new VerificaLetra();
	
	public char getBotao() {
		return botao;
	}

	public static void teclado() {
		switch (botao) {
		case 'A':
			verificaLetra.getLetra('A');
			break;
		case 'B':
			verificaLetra.getLetra('B');
			break;
		case 'C':
			verificaLetra.getLetra('C');
			break;
		case 'D':
			verificaLetra.getLetra('D');
			break;
		case 'E':
			verificaLetra.getLetra('E');
			break;
		case 'F':
			verificaLetra.getLetra('F');
			break;
		case 'G':
			verificaLetra.getLetra('G');
			break;
		case 'H':
			verificaLetra.getLetra('H');
			break;
		case 'I':
			verificaLetra.getLetra('I');
			break;
		case 'J':
			verificaLetra.getLetra('J');
			break;
		case 'K':
			verificaLetra.getLetra('K');
			break;
		case 'L':
			verificaLetra.getLetra('L');
			break;
		case 'M':
			verificaLetra.getLetra('M');
			break;
		case 'N':
			System.out.println("\nTeclado - OK");
			verificaLetra.getLetra('N');
			break;
		case 'O':
			verificaLetra.getLetra('O');
			break;
		case 'P':
			verificaLetra.getLetra('P');
			break;
		case 'Q':
			verificaLetra.getLetra('Q');
			break;
		case 'R':
			verificaLetra.getLetra('R');
			break;
		case 'S':
			verificaLetra.getLetra('S');
			break;
		case 'T':
			verificaLetra.getLetra('T');
			break;
		case 'U':
			verificaLetra.getLetra('U');
			break;
		case 'V':
			verificaLetra.getLetra('V');
			break;
		case 'W':
			verificaLetra.getLetra('W');
			break;
		case 'X':
			verificaLetra.getLetra('X');
			break;
		case 'Y':
			verificaLetra.getLetra('Y');
			break;
		case 'Z':
			verificaLetra.getLetra('Z');
			break;
		default:
			break;
		}
	}
	
	public static void telaInicial() {
		System.out.println("Tela Inicial - OK");
	}
	
	public static void fimDeJogo() {
		System.out.println("\nFim de Jogo - OK");
	}
	
	public static String getPalavraEscolhida() {
		return palavraEscolhida;
	}

	public static void main(String[] args) {	// ← Os casos de teste já estão definidos e os relacionamentos estão corretos.	
		System.out.println("Main\n");
		
		telaInicial();
		
		//while() {   O laço será adicionado depois.
			palavraEscondida = new PalavraEscondida();
			palavraEscolhida = palavraEscondida.getPalavra();    // ← Escolhe uma nova palavra da lista de palavras
		
			//while() {
				teclado();  // ← Método para obter as letras que o usuário escolher.
			//}
		
			fimDeJogo();   // ← Método usado para começar uma novo partida (imprime a janela Fim de Jogo)
		//}
	}

}
