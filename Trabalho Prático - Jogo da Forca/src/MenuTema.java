
public class MenuTema extends ModeloJanela {
	private int tema=1;   // ← O tema foi definido em 1, que é cidades (posteriormente o usuário informará o tema)

	public int getTema() {
		System.out.println("\nTema=" + tema);

		return tema;
	}

	public void setTema(int tema) {
		this.tema = tema;
	}
}
