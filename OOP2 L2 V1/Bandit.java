package banditi;

public class Bandit {
//fields
	public enum Tim{A, B};
	private Tim tip;
	private int kolicina;
//constructor
	public Bandit(Tim tip) {
		this.tip = tip;
		kolicina = 50;
	}
//getters
	public int dohvatiBrojZlatnika() {
		return kolicina;
	}
	public Tim dohvatiTim() {
		return tip;
	}
	//setters
	public void promeniBrojZlatnika(int kolicina) {
		this.kolicina += kolicina;
	}
	private String getTip(Tim t) {
		switch(t) {
		case A: return "A";
		case B: return "B";
		default: return "";
		}
	} 
	@Override
	public String toString() {
		return getTip(tip) + kolicina;
	}
	
//main
	public static void main(String[] args) {
		
	}
}
