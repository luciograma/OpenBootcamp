package tema3;

public class Coche {

	public int puertas;
	
	public Coche(int puertas) {
		this.puertas = puertas;
	}
	
	public int getPuertas() {
		return puertas;
	}
	
	public void aumentarPuertas(int cantidad) {
		this.puertas+= cantidad;
	}
	
	public static void main(String[] args) {
		Coche miCoche = new Coche(2);
		miCoche.aumentarPuertas(0);
		System.out.println(miCoche.getPuertas());
	}
}
