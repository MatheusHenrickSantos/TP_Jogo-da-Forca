
public class ListaPalavras {
	private String cidades[] = {"HONG KONG","BANGKOK","LONDRES","SINGAPURA","MACAO","PARIS","DUBAI","NOVA YORK"
								+ "KUALA LUMPUR","SHENZHEN","ISTAMBUL","DÉLI","TÓQUIO","ROMA","MUMBAI","PRAGA"
								+ "MIAMI","AMSTERDÃ","SEUL","SHANGHAI","LOS ANGELES","LAS VEGAS","OSAKA","MILÃO"
								+ "VIENA","CANCUN","BERLIM","JOANESBURGO","VENEZA","MADRI","ORLANDO","DUBLIN"
								+ "FLORENÇA","MOSCOU","ATENAS","CAIRO","TORONTO","PEQUIM","SYDNEY","MUNIQUE"
								+ "BUDAPESTE","SÃO PETERSBURGO","JAKARTA","LISBOA","JERUSALÉM","KYOTO","BRUXELAS"
								+ "VANCOUVER","COPENHAGUE","SÃO FRANCISCO","VARSÓVIA","CRACÓVIA","MELBOURNE"
								+ "HONOLULU","MARRAQUEXE","CALCUTÁ","FRANKFURT","ESTOCOLMO","CIDADE DO MÉXICO"
								+ "BUENOS AIRES","LIMA","NICE","SANTIAGO","RIO DE JANEIRO","ABU DHABI","PORTO"
								+ "DOHA","IROSHIMA","NAGASAKI","YOKOHAMA","GENEBRA"};
	private String paises[] = {"CHINA","ÍNDIA","ESTADOS UNIDOS","INDONÉSIA","PAQUISTÃO","BRASIL","NIGÉRIA"
								+ "BANGLADESH","RÚSSIA","MÉXICO","JAPÃO","FILIPINAS","EGITO","ETIÓPIA","VIETNAM"
								+ "CONGO","TURQUIA","ALEMANHA","FRANÇA","TAILÂNDIA","REINO UNIDO","ITÁLIA"
								+ "ÁFRICA DO SUL","TANZÂNIA","MIANMAR","COREIA DO SUL","COLOMBIA","QUÊNIA"
								+ "ESPANHA","ARGENTINA","ARGÉLIA","UCRANIA","UGANDA","IRAQUE","POLÕNIA","CANADÁ"
								+ "MARROCOS","MALÁSIA","AFEGANISTÃO","VENEZUELA","PERU","ANGOLA","MOÇAMBIQUE"
								+ "NEPAL","CAMARÕES","MADAGASCAR","COSTA DO MARFIM","AUSTRÁLIA","IRLANDA"
								+ "SRI LANKA","BURKINA FASSO","ROMÊNIA","CHILE","ZÂMBIA","SÍRIA","EQUADOR","HOLANDA"
								+ "GUATEMALA","SENAGAL","SOMÁLIA","CAMBOJA","TUNISIA","HAITI","BOLÍVIA","BÉLGICA"
								+ "CUBA","GRÉCIA","JORDÂNIA","REPÚBLICA DOMINICANA","SUÉCIA","PORTUGAL","HUNGRIA"
								+ "HONDURAS","AUSTRIA","SUÍÇA","PARAGUAI","SÉVIA","BULGÁRIA","LÍBANO","NICARÁGUA"
								+ "DINAMARCA","FINLÂNDIA","ESLOVÁQUIA","NORUEGA","COSTA RICA","NOVA ZELÂNDIA"
								+ "PANAMÁ","CROÁCIA","GEÓRGIA","URUGUAI","ARMÊNIA","ALBÂNIA","LITUÂNIA","CATAR"
								+ "JAMAICA","ESLOVÊNIA","BAHREIN","ANDORRA"};
	//private String animais[] = {"Será adicionado depois"};
	//private String filmes[] = {"Será adicionado depois"};
	//private String times[] = {"Será adicionado depois"};
	//private String historia[] = {"Será adicionado depois"};
	//private String natureza[] = {"Será adicionado depois"};
	
	public String getCidade() {   // ← Por enquanto esse método retornará a palavra na posição 0.
		return cidades[0];
	}

	public String getPaises() {
		return paises[0];
	}

}
