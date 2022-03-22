package tema9;

import tema8.Persona;

public class Cliente extends Persona{
	
	private double credito;

	public Cliente(double credito) {
		super();
		this.credito = credito;
	}

	public Cliente() {
		super();
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNombre("Eduardo");
		cliente.setEdad(23);
		cliente.setTelefono(34123453);
		cliente.setCredito(300000);
		cliente.getNombre();
		cliente.getEdad();
		cliente.getTelefono();
		cliente.getCredito();
	}
}
