import java.util.*;
public class OrderArraySongs {

	public static void main(String[] args) {
		/* 						Alias										*/
		Scanner in = new Scanner(System.in); // Alias of Scanner function.
		/* 						Variables									*/
		String opc;					// Variable selectora de opcion
		int i;						// Iterador
		int posix;					// Posicion de busqueda
		String letra;				// Inicial de la canción a buscar
		String nombre;				// Nombre de la cancion a buscar
		/*            			Lista Canciones								*/
		String canciones[][] = new String[10][2];
		canciones[0][0]="Nothing compares to you";
		canciones[0][1]="Sinead O connor";
		canciones[1][0]="Still Loving You";
		canciones[1][1]="Scorpions";		
		canciones[2][0]="The Scientist";
		canciones[2][1]="Coldplay ";		
		canciones[3][0]="A Sky Full Of Stars";
		canciones[3][1]="Coldplay ";		
		canciones[4][0]="scorpions lady";
		canciones[4][1]="Scorpions";		
		canciones[5][0]="Nothing else matters";
		canciones[5][1]="Metalica";		
		canciones[6][0]="Me paro cuando suena";
		canciones[6][1]="Orquesta de las nubes";
		canciones[7][0]="Bohemian rhapsody";
		canciones[7][1]="Queen";		
		canciones[8][0]="Imagine ";
		canciones[8][1]="John Lennon";
		canciones[9][0]="Another One Bites the Dust";
		canciones[9][1]="Queen";
		/*
		 * 						MAIN
		 */
		do {
			menu();
			System.out.print("Introduzca opción: ");
			opc = in.next();
			switch (opc) {
			case "1":
				System.out.println("******\tCanciones por Grupo\t*****");
				System.out.print("Introduzca parte o el total del nombre"
								 + " del grupo: ");
				nombre = in.next();
				listadoCancionesGrupo(canciones, nombre);
				break;
			case "2":
				System.out.println("******\tCanciones por inicial\t*****");
				System.out.print("Introduzca la inicial de la cancion: ");
				letra = in.next();
				listadoCancionesLetra(canciones, letra);
				break;
			case "3":
				System.out.println("******\tCanciones en la posicion\t*****");
				System.out.print("Introduzca posicion: ");
				posix = in.nextInt();
				listadoCancionesUnicaP(canciones, posix);
				break;
			case "4":
				System.out.println("******\tCanciones por nombre\t*****");
				System.out.print("Introduzca parte o el total del nombre"
								 + " de la cancion: ");
				nombre = in.next();
				listadoCancionesNombre(canciones, nombre);
				break;
			case "5":
				System.out.println("***\tCanciones a partir de posicion\t***");
				System.out.print("Introduzca posicion: ");
				posix = in.nextInt();
				listadoCancionesPosicion(canciones, posix);
				break;
			case "6":
				System.out.println("*******\tTodas las canciones\t**********");
				mostrarTodasCanciones(canciones);
				break;
			case "7":
				System.out.print("Hasta pronto...");
				break;
			default:
				System.out.println("Seleccione la opcion correcta.");
				break;
			}
		} while (!opc.equals("7"));
		in.close();
	}
	public static void menu() {
		System.out.println("--------------------");
		System.out.println("Almacen de canciones");
		System.out.println("--------------------");
		System.out.println("1.\tListado de canciones de un grupo");
		System.out.println("2.\tListado de canciones que empiezan por "
							+ "una letra");
		System.out.println("3.\tBuscar canción por posicion");
		System.out.println("4.\tBuscar cancion por nombre");
		System.out.println("5.\tListado de canciones a partir de una posicion");
		System.out.println("6.\tTodas las canciones");
		System.out.println("7.\tFin del programa");
	}
	public static void listadoCancionesGrupo (String[][] array, String grupo) {
		Boolean	hazSong = false;	// Comprobador de existencia de canciones
		int i;						// Iterador
		for (i = 0; i < array.length; i++) {
			if (array[i][1].toLowerCase().contains(grupo.toLowerCase())) {
				System.out.println("Cancion: " + array[i][0]
						+ "\tGrupo:(" + array[i][1] + ")");
				hazSong = true;
			}
		}
		if (!hazSong) System.out.println("No tenemos esa cancion.");
	}
	public static void listadoCancionesLetra (String[][] array, String letter) {
		Boolean	hazSong = false;	// Comprobador de existencia de canciones
		int i;						// Iterador
		letter = letter.substring(0,1);
		for (i = 0; i < array.length; i++) {
			if (array[i][0].substring(0,1).toLowerCase().contains(letter.toLowerCase())) {
				System.out.println("Cancion: " + array[i][0]
						+ "\tGrupo:(" + array[i][1] + ")");
				hazSong = true;
			}
		}
		if (!hazSong) System.out.println("No tenemos esa cancion.");
	}
	public static void listadoCancionesUnicaP (String [][] array, int posix) {
		System.out.println("Cancion: " + array[posix][0]
							+ "\tGrupo:(" + array[posix][1] + ")");
	}
	public static void listadoCancionesNombre (String[][] array, String name) {
		Boolean	hazSong = false;	// Comprobador de existencia de canciones
		int i;						// Iterador
		for (i = 0; i < array.length; i++) {
			if (array[i][0].toLowerCase().contains(name.toLowerCase())) {
				System.out.println("Cancion: " + array[i][0]
						+ "\tGrupo:(" + array[i][1] + ")");
				hazSong = true;
			}
		}
		if (!hazSong) System.out.println("No tenemos esa cancion.");
	}
	public static void listadoCancionesPosicion (String [][] array, int posix) {
		int i;						// Iterador
		for (i = posix; i < array.length; i++) {
			System.out.println("Cancion: " + array[i][0]
					+ "\tGrupo:(" + array[i][1] + ")");
		}
	}
	public static void mostrarTodasCanciones(String[][] array) {
		/* 						Variables									*/
		int i;						// Iterador
		for (i = 0; i < array.length; i++) {
			System.out.println("Cancion: " + array[i][0]
								+ "\tGrupo:(" + array[i][1] + ")");
		}
	}

}
