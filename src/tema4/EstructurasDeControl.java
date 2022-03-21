package tema4;

public class EstructurasDeControl {

	public static void main(String[] args) {

		int numeroIf = 30;
		int numeroWhile = 1;
		String estacion = "oto�o";

		if (numeroIf > 0)
			System.out.println("El n�mero es positivo");
		else if (numeroIf == 0)
			System.out.println("El n�mero es 0");
		else
			System.out.println("El n�mero es negativo");

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
		case "oto�o":
			System.out.println("Los arboles se quedaron sin hojas, estamos en " + estacion);
			break;
		case "invierno":
			System.out.println("Estamos en " + estacion + ". Hace muho fr�o.");
			break;
		case "primavera":
			System.out.println("Los campos florecen, estamos en " + estacion);
			break;
		case "verano":
			System.out.println("No se soporta este calor, estamos en " + estacion);
			break;
		default:
			System.out.println("No hay ninguna estaci�n con este nombre.");
			break;
		}
	}
}
