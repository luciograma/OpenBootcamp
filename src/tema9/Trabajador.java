package tema9;

import tema8.Persona;

public class Trabajador extends Persona{
	
	private double salario;

	public Trabajador(double salario) {
		super();
		this.salario = salario;
	}

	public Trabajador() {
		super();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public static void main(String[] args) {
		Trabajador trabajador = new Trabajador();
		trabajador.setNombre("Pedro");
		trabajador.setEdad(18);
		trabajador.setTelefono(34123453);
		trabajador.setSalario(45000.56);
		trabajador.getNombre();
		trabajador.getEdad();
		trabajador.getTelefono();
		trabajador.getSalario();
	}
}
