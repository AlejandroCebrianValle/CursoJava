import java.util.*;
public class GestorDeParking {

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		// Variables
		Boolean compr = false;
		int piso = 0;  			//numero de pisos
		int plPiso = 0;			//plaza por piso
		int opcion; 			//manejador de menu
		int i;					//indice filas (piso)
		int j;					//indice columnas (plaza del piso)
		int libres;				//numero de palzas libres
		int libresPiso;			//plazas libres por piso
		String garaje[][]; 		//el nombre lo dice todo...
		String matricula;		//matricula del coche
		// String matriculaL;		//Lista de matriculas introducidas
		String decidePl;		//manejador de menu de entrada de plaza
		// Alias
		Scanner in = new Scanner(System.in); // Alias de funcion escaner.
		/*
		 * 		MAIN
		 */
		// Generar el array, introduciendo datos
		System.out.println("Bienvenido al gestor de Parking."
							+ "\n---------------------------------\n"
							+ "Introduzca las dimensiones del parking");
		while (true) {
			try {
				System.out.print("Numero de pisos: ");
				piso = in.nextInt();
				System.out.print("Numero de plazas por piso: ");
				plPiso = in.nextInt();
			}//TRY Excepcion piso y plPiso 
			catch (Exception f) {
				System.out.println("Introduzca un valor correcto");
				continue;
			} //catch-Excepcion piso y plPiso
			finally {
				break;
			}
		}//while Introductor datos END
		System.out.println("Su parking dispone de "
							+ (piso*plPiso) + " plazas");
		// Creacion del array
		garaje = new String[piso][plPiso];
		// Rellenado
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
				System.out.print("Menu:\n"
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
					System.out.println("Plazas libres en totales: " + libres);
				}//If-Consulta plaza
				else if (opcion == 2) {
					System.out.print("Introduzca la matricula del coche: ");
					matricula = in.next();
					System.out.print("¿Va a alguna plaza determinada?(S/N): ");
					decidePl = in.next();
					if (decidePl.equals("S") || decidePl.equals("s")) {
						System.out.print("Introduzca piso: ");
						i = in.nextInt();
						System.out.print("Introduzca plaza del piso: ");
						j = in.nextInt();
						garaje[i][j] = matricula;
						System.out.print("Coche añadido...\n");
					} //if-Decisor de plaza END
					else if (decidePl.equals("N") || decidePl.equals("n")) {
						for (i = 0; i < garaje.length; i++) {
							for (j = 0; j < garaje[i].length; j++) {
								if (garaje[i][j] == "Libre")
								{
									compr = true;
									garaje[i][j] = matricula;
									System.out.print("Coche añadido en piso:  "
													+ i + " pl: " + j + "\n");
									break;
								}//If-Comprueba libre END
							}
							if (compr) break;
						}//For recorreplazas libres END
					}//Else if encasqutador de plaza END
					else System.out.println("Introduzca un valor correcto");
				}//If-Entrada coches
				/*else if (opcion == 3) {
					
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
