package banditi;

public class Pomeranje extends Akcija {
	Smer smer;
	public Pomeranje(Kompozicija kompozicija, Smer s) {
		super(kompozicija);
		smer = s;
	}

	@Override
	public void izvrsi(Bandit b) {
		try {
			Vagon v = kompozicija.dohvatiVagon(b);
			Vagon s = kompozicija.dohvatiSusedniVagon(v, smer);
			v.ukloniBandita(b); 
			s.dodajBandita(b);
		} catch (GNepostojeciVagon e) {}
	}


	@Override
	public String toString() {
		return "Pomeranje: " + smer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
