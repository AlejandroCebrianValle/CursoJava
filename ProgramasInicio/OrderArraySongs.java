import java.util.*;
public class OrderArraySongs {

	public static void main(String[] args) {
		/* 						Alias										*/
		Scanner in = new Scanner(System.in); // Alias of Scanner function.
		/* 						Variables									*/
		String opc;					// Variable selectora de opcion
		int i;						// Iterador
		int posix;					// Posicion de busqueda
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
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				System.out.print("Introduzca posicion: ");
				posix = in.nextInt();
				listadoCancionesPosicion(canciones, posix);
				break;
			case "6":
				mostrarTodasCanciones(canciones);
				break;
			case "7":
				System.out.print("Hasta pronto...");
				break;
			default:
				System.out.print("Seleccione la opcion correcta.");
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
		System.out.println("2.\tListado de canciones que empiezan por una letra");
		System.out.println("3.\tBuscar canción por posicion");
		System.out.println("4.\tBuscar cancion por nombre");
		System.out.println("5.\tListado de canciones a partir de una posicion");
		System.out.println("6.\tTodas las canciones");
		System.out.println("7.\tFin del programa");
	}
	public static void listadoCancionesPosicion (String [][] array, int posix) {
		int i;						// Iterador
		for (i = posix; i < array.length; i++) {
			System.out.println("Cancion: " + array[i][0]
								+ "\tGrupo:" + array[i][1]);
		}
	}
	public static void mostrarTodasCanciones(String[][] array) {
		/* 						Variables									*/
		int i;						// Iterador
		for (i = 0; i < array.length; i++) {
			System.out.println("Cancion: " + array[i][0]
								+ "\tGrupo:" + array[i][1]);
		}
	}

}
