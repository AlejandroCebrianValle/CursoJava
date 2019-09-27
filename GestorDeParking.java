import java.util.*;
public class GestorDeParking {

	public static void main(String[] args) {
		// Variables
		int piso;   //numero de pisos
		int plPiso; //plaza por piso
		int opcion; //manejador de menu
		int i;		//indice filas (piso)
		int j;		//indice columnas (plaza del piso)
		int libres;		//numero de palzas libres
		int libresPiso;	//plazas libres por piso
		String garaje[][]; // el nombre lo dice todo...
		// Alias
		Scanner in = new Scanner(System.in); // Alias de funcion escaner.
		/*
		 * 		MAIN
		 */
		// Generar el array
		System.out.println("Bienvenido al gestor de Parking."
							+ "\n---------------------------------\n"
							+ "Introduzca las dimensiones del parking");
		System.out.print("Número de pisos: ");
		piso = in.nextInt();
		System.out.print("Número de plazas por piso: ");
		plPiso = in.nextInt();
		System.out.println("Su parking dispone de "
							+ (piso*plPiso) + " plazas");
		// Creacion del array
		garaje = new String[piso][plPiso];
		// Rellenador
		for (i = 0; i < garaje.length; i++) {
			for (j = 0; j < garaje[i].length; j++) {
				garaje[i][j] = "Libre";
			}
		}
		// Imprimir
		for (i = 0; i < garaje.length; i++) {
			System.out.println(Arrays.toString(garaje[i]));
		}
		// Bucle repetitivo para el funcionamiento
		while (true) {
			try {
				System.out.print("Menú:\n"
									+ "1.\tConsultar Plazas.\n"
									+ "2.\tEntrada de coche.\n"
									+ "3.\tSalida de coche.\n"
									+ "0.\tSalida del programa.\n\tOpcion: ");
				opcion = in.nextInt();
				if (opcion == 1) {
					libres = 0;
					for (i = 0; i < garaje.length; i++) {
						libresPiso = 0;
						for (j = 0; j < garaje[i].length; j++) {
							if (garaje[i][j] == "Libre") {
								libres++;
								libresPiso++;
							}
						}
						System.out.print("Plazas libres en piso " 
										+ i + " : " + libresPiso + "\n");
						System.out.println(Arrays.toString(garaje[i]));
					}//RecorreGaraje para ver libre
					System.out.print("Plazas libres en totales: " + libres);
				}//If-Consulta plaza
				/*else if (opcion == 2) {
					
				}//If-Entrada coches
				else if (opcion == 3) {
					
				}//If-Salida coche
				*/ 
				else if (opcion == 0) {
					in.close();
					System.out.println("Adios, saliendo del programa...");
					break;
				}//If-Salida programa
				else {
					System.out.println("Introduzca un valor correcto");
				}//Else capturatodo
			}// TRY
			catch (Exception e) {
				System.out.println("Introduzca un valor correcto (0,1,2 o 3)");
				in.next();
				continue;
			}// CATCH
		} // while true END
	}
}
