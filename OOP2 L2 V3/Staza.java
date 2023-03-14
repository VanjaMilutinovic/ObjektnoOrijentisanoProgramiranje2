package skijanje;
import java.util.ArrayList;

public class Staza {

	private ArrayList<Deonica> deonice = new ArrayList();
	private String naziv;
	
	public void dodaj(Deonica d) {
		deonice.add(d);
	}
	
	public Staza(String naziv) {
		super();
		this.naziv = naziv;
	}
	public int broj() {
		return deonice.size();
	}
	public double nagib() {
		double max = 0;
		for (Deonica d:deonice)
			if (d.nagib()>max)max = d.nagib();
		return max;
	}
	public String naziv() {
		return naziv;
	}
	public double duzina() {
		double sum = 0;
		for(Deonica d:deonice) sum += d.duzina();
		return sum;
		
	}
	public char oznaka()throws GOznaka{
		int[] brojnost = new int[26];
		if (deonice.size()==0)throw new GOznaka();
		for(Deonica d:deonice) {
			brojnost[d.oznaka()-65]++;
		}
		int max = 0;
		char ret = '\0';
		for (Deonica d:deonice) {
			if(brojnost[d.oznaka()-65]>max) { 
				max = brojnost[d.oznaka()-65];
				ret = d.oznaka();
			}
		}
		return ret;
	}
	
	
	public double brzina(double Vp) {
		
		for (Deonica d: deonice) {
			Vp= d.brzina(Vp);
			
		}
		return Vp;
			
	}
	public double vreme(double Vp) {
		double vreme = 0;
		double Vk=0;
		for (Deonica d: deonice) {
			vreme += d.vreme(Vp);
			Vk = d.brzina(Vp);
			Vp = Vk;
		}
		return vreme;
			
	}
	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder();
		str.append(naziv).append("|");
		str.append(broj()); str.append("|");
		str.append(duzina()); str.append("|");
		str.append(nagib()); str.append("\n[");
		int i = 0;
		for(Deonica d:deonice) {
			if (i++ != 0) str.append(",");
			str.append(d.toString());
		}
		str.append("]");
		return str.toString();
	}


}
