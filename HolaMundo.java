
public class HolaMundo {

	public static void main(String[] args) {
		String nombre="Pepe";
		int edad=17;
		// Espacio de impresiones.
		System.out.println("¡Hola, Mundo!" + " ¡Hola, " +
							nombre +"!" + "\nTienes " + edad + " años");
		System.out.println("¡Era mi primerito programa!");
		if (edad <= 18) {
			System.out.println("Eres menor, no puedes pasar.");
		}
	}
}
