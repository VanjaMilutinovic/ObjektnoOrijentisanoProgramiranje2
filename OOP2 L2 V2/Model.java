package revija;

public class Model {


//fields
	private static int ID = 0;
	private int id = ID++;
	private Velicina velicina;
//constructor	
	public Model(Velicina velicina) {
		this.velicina = velicina;
	}
//getters
	public int dohvId() {
		return id;
	}
	public Velicina dohvVelicinu() {
		return velicina;
	}
	
@Override
	public String toString() {
		return "Model " + id + "(" + velicina + ")";
	}
//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
