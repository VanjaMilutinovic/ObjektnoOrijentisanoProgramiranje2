package banditi;
import java.util.ArrayList;
public class Vagon {
//fields
	ArrayList<Bandit> banditi;
//constructor	
	public Vagon() {	
	banditi = new ArrayList<Bandit>();
}
//methods
	public void dodajBandita(Bandit b) {
		banditi.add(b);
	}
	public boolean sadrziBandita(Bandit b) {
		return banditi.contains(b);
	}
	public void ukloniBandita(Bandit b) {
		banditi.remove(banditi.indexOf(b));
	}
	public int dohvatiBrojBandita(){
		return banditi.size();
	}
	public Bandit dohvatiBandita(int i){
		return banditi.get(i);
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("[");
		int i= 0;
		for (Bandit bandit : banditi) {
			if (i++!=0) str.append(",");
			str.append(bandit.toString());
		}
		str.append("]");
		return str.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
