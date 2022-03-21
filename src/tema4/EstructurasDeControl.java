package tema4;

public class EstructurasDeControl {

	public static void main(String[] args) {

		int numeroIf = 30;
		int numeroWhile = 1;
		String estacion = "otoño";

		if (numeroIf > 0)
			System.out.println("El número es positivo");
		else if (numeroIf == 0)
			System.out.println("El número es 0");
		else
			System.out.println("El número es negativo");

		while (numeroWhile < 3) {
			numeroWhile++;
			System.out.println("numeroWhile = " + numeroWhile);
		}

		do {
			numeroWhile++;
		} while (numeroWhile < 4);

		for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
			System.out.println(numeroFor);
		}

		switch (estacion) {
		case "otoño":
			System.out.println("Los arboles se quedaron sin hojas, estamos en " + estacion);
			break;
		case "invierno":
			System.out.println("Estamos en " + estacion + ". Hace muho frío.");
			break;
		case "primavera":
			System.out.println("Los campos florecen, estamos en " + estacion);
			break;
		case "verano":
			System.out.println("No se soporta este calor, estamos en " + estacion);
			break;
		default:
			System.out.println("No hay ninguna estación con este nombre.");
			break;
		}
	}
}
