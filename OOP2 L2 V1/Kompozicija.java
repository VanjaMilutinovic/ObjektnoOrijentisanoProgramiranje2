package banditi;
import java.util.ArrayList;

public class Kompozicija {
//fields
	ArrayList<Vagon> vagoni;
//constructor
	public Kompozicija() {
		vagoni = new ArrayList<Vagon>();
	}
//methods
	public void dodajVagon(Vagon v) {
		vagoni.add(v);
	}
	public Vagon dohvatiVagon(Bandit b) throws GNepostojeciVagon {
		for (Vagon vagon : vagoni) {
			if (vagon.sadrziBandita(b)) return vagon;
		}
		throw new GNepostojeciVagon();	
	}
	public Vagon dohvatiSusedniVagon(Vagon v, Smer s) throws GNepostojeciVagon {
		int i = vagoni.indexOf(v);
		if (s == Smer.ISPRED) i--;
		else i++;
		if(i<0 || i>=vagoni.size()) throw new GNepostojeciVagon();
		return vagoni.get(i);
		
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		int i = 0;
		for (Vagon vagon : vagoni) {
			if(i++!=0)str.append("_");
			str.append(vagon.toString());
		}
		return str.toString();
	}
//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
