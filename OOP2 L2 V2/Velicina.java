package revija;

public class Velicina {
//fields
	private Oznaka oznaka;
	public enum Oznaka{S, M, L};
//getters
	public Velicina(Oznaka oznaka) {
		this.oznaka = oznaka;
	}

	public Oznaka dohvOznaku() {
		return oznaka;
	}
	
@Override
	public String toString() {
		switch (oznaka){
			case S: return "S";
			case M: return "M";
			case L: return "L";
			default: return "";
		}
	}
//methods
	public int broj(Oznaka o) {
		switch (o){
		case S: return 1;
		case M: return 2;
		case L: return 3;
		default: return -1;
		}
	}
	public boolean manja(Velicina v) {
		return broj(oznaka)<broj(v.dohvOznaku());
	}

//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
