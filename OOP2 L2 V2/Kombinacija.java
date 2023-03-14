package revija;

public class Kombinacija {
//fields
	private int n, occupancy;
	private Nosivo[] stvari;
	
//constructor
	public Kombinacija(int n) {
		this.n = n;
		this.stvari = new Nosivo[n];
		occupancy = 0;
	}
//methods
	public void dodaj(Nosivo stvar) throws GDodavanje {
		if(occupancy==n)throw new GDodavanje();
		else stvari[occupancy++] = stvar;		
	}
	public int dohvBrStvari() {
		return occupancy;
	}
	public int dohvMaxBrStvari() {
		return n;
	}
	public Nosivo dohvStvar(int i) throws GIndeks{
		if(i<0 || i >= occupancy) throw new GIndeks();
		else return stvari[i];
	}
	
@Override
	public String toString() {
	StringBuilder str = new StringBuilder();
	str.append("[");
	for(int i = 0; i<occupancy;i++) {
		if(i!=0) str.append(",");
		str.append(stvari[i].toString());
	}
	str.append("]");
	return str.toString();
	}
//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
