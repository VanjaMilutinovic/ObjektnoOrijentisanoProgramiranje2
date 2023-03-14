package revija;

public class Odeca extends Nosivo {
//fields	
	private String naziv;
	private Velicina velicina;
//constructor	
	public Odeca(String naziv, Velicina velicina) {
		super();
		this.naziv = naziv;
		this.velicina = velicina;
	}
//getters
	public String dohvNaziv() {
		return naziv;
	}
	public Velicina dohvVelicinu() {
		return velicina;
	}

	@Override
	public boolean odgovara(Model m) {
		return !velicina.manja(m.dohvVelicinu());
	}

	@Override
	public String toString() {
		return "odeća "+ naziv + " " + velicina;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
