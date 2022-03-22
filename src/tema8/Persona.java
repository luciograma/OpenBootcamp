package tema8;

public class Persona {

	private int edad;
	private String nombre;
	private long telefono;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	public static void main(String[] args) {
		Persona carlos = new Persona();
		carlos.setNombre("Carlos");
		carlos.setEdad(23);
		carlos.setTelefono(341322333);
		System.out.println("Nombre: "+carlos.getNombre());
		System.out.println("Edad: "+carlos.getEdad());
		System.out.println("Telefono: "+carlos.getTelefono());
	}	
}

 
