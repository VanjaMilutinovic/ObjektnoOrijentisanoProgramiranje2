package skijanje;


abstract public class Deonica {
	private double duzina;
	private double nagib;

	public abstract char oznaka();
	
	public Deonica(double duzina, double nagib) {
		super();
		this.duzina = duzina;
		this.nagib = nagib;
	}

	public double brzina(double Vp) {
		return Math.sqrt(Vp*Vp + 2*duzina*ubrzanje());
	}
	public double vreme(double Vp) {
		return (brzina(Vp)-Vp)/ubrzanje();
	}
	
	public abstract double ubrzanje() ;
	@Override
	public String toString() {
		return oznaka()+"("+duzina()+","+nagib()+")";
	}
	public double duzina() {
		return duzina;
	}

	public double nagib() {
		return nagib;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
