import java.util.*;
public class Enunciados26Septiembre {

	public static void main(String[] args) {
		// Variables generales
		int opcion;
		// Usados en 7, 8 y 9
		int lLimit2 = 1;
		int rLimit2 = 10;
		// Alias
		Scanner in = new Scanner(System.in); // Alias de funcion escaner.
		// Variables primer ejercicio
		int i = 50;
		// Variables segundo ejercicio
		int j = 100;
		// Variables tercer ejercicio
		int a;
		int b;
		// Variables cuarto ejercicio
		int k;
		int suma = 0;
		// Variables quinto ejercicio
		String equipoL;
		String equipoV;
		int golL;
		int golV;
		// Variables sexto ejercicio
		int l;
		int lLimit = 1;
		int rLimit = 20;
		int suma2 = 0;
		int rInt;
		// Variables septimo ejercicio
		int n; // numero random
		int c; // elemento a pedir
		int m; // indice
		// Variables octavo ejercicio
		int d; // numero aleatorio
		int e = 0; // indice
		// Variables noveno ejercico
		int f; // numero aleatorio
		// Variables 10 ejercicio
		int g; // numero aleatorio
		int lLimit3 = 1;
		int rLimit3 = 5;
		/*
		 * 				MAIN
		 */
		while (true) {
			System.out.println("\nMenu: Elija una opcion para realizar el "
					+ "Ejercicio:\n7.\tContador de 50 a 100 de 5 en 5.\t\n" //1
					+ "8.\tContador inverso de 100 a 10 de 10 en 10.\n"		//2
					+ "9.\tContador de a hasta b, dados por usuario.\n"		//3
					+ "10.\tSumatorio de números positivos.\n"				//4
					+ "11.\tValorador de equipos de futbol.\n"				//5
					+ "12.\tSumatorio de 10 numeros aleatorios de 1 a 10.\n"//6
					+ "13.\tAdivinador de numero aleatorio.\n"				//7
					+ "14.\tValorador de numero aleatorio (y II).\n"		//8
					+ "15.\tValorador de aleatorio (y III).\n"				//9
					+ "16.\tValorador de aleatorio (y IV).\n"			   //10
					+ "Introduzca 0 para salir.");
			opcion = in.nextInt();
			if (opcion == 7) {
				System.out.println("----------------------------------------"
									+ "\nEjercicio 7");
				while (i <= 100) {
					System.out.println("Contando por el: " + (i += 5));
				}// while contador 50 a 100 END
			} // if-7 END
			else if (opcion == 8) {
				System.out.println("----------------------------------------"
									+ "\nEjercicio 8");
				while (j > 10) {
					System.out.println("Contando por el: " + (j-=10));
				}// while contador inverso 100 a 10 END
			}// if-8 END
			else if (opcion == 9) {
				System.out.println("----------------------------------------"
									+ "\nEjercicio 9");
				do {
					System.out.println("Introduzca Limite inferior");
					a = in.nextInt();
					System.out.println("Introduzca Limite superior");
					b = in.nextInt();
				} while (a >= b);
				while (b >= a) {
					System.out.println("Contando por el: " + (a++));
				}// while contador a-b END
			}// if-9 END
			else if (opcion == 10) {
				System.out.println("----------------------------------------"
						+ "\nEjercicio 10");
				while (true) {
					System.out.println("Introduzca numeros naturales: ");
					k = in.nextInt();
					if (k < 0) {
						System.out.println("Solo admite positivos.");
						System.out.println("Sumado: " + suma);
						break;
					}//if rompecodigo END
					suma += k;
					System.out.println("Sumando: " + suma);
				}//while sumatorio
			}//if-10
			else if (opcion == 11) {
				System.out.println("----------------------------------------"
						+ "\nEjercicio 11");
				System.out.println("Introduzca Equipo Visitante:");
				equipoV = in.next();
				System.out.println("Introduzca goles del Equipo Visitante:");
				golV = in.nextInt();
				System.out.println("Introduzca Equipo Local:");
				equipoL = in.next();
				System.out.println("Introduzca goles del Equipo Local:");
				golL = in.nextInt();
				if (golL < golV) {
					System.out.println("Ganó " + equipoV + " por " + golV
										+ " a " + golL);
				}//if-Valorador goles A END
				else if (golL > golV) {
					System.out.println("Ganó " + equipoL + " por " + golL
										+ " a " + golV);
				}//if-Valorador goles A END
				else {
					System.out.println("Empataron " + equipoL + " y " + equipoV
							+ " a " + golV +" goles.");
				}//else-empate END
			}//if-11 END
			else if (opcion == 12) {
				System.out.println("----------------------------------------"
						+ "\nEjercicio 12");
				for (l = 0; l <= 10; l++) {
					rInt = lLimit + (int) (new Random().nextFloat() * (rLimit
							- lLimit));
					suma2 += rInt;
					System.out.println("Sumando: " + rInt + " = "+ suma2);
				}//for END
				System.out.println("Sumado: " + suma2);
			}// if-12 END
			else if (opcion == 13) {
				System.out.println("----------------------------------------"
						+ "\nEjercicio 13");
				n = lLimit2 + (int) (new Random().nextFloat() * (rLimit2
					- lLimit2));
				for (m = 0; m < 5; m++) {
					System.out.println("Intento " + (m+1) + ", introduce:");
					c = in.nextInt();
					if (n == c) {
						System.out.println("Acertaste");
						break;
					} // acierto
					else if (n < c) {
						System.out.println("Es menor al introducido");
					} // menor
					else {
						System.out.println("Es mayor al introducido");
					} // mayor
				}//for oportunidad END
				if (m >= 5) {
					System.out.println("La solucion era: " + n);
				}//
			}//if-13 END
			else if (opcion == 14) {
				System.out.println("----------------------------------------"
						+ "\nEjercicio 14");
				do {
					e++;
					d = lLimit2 + (int) (new Random().nextFloat() * (rLimit2
							- lLimit2));
					System.out.println("azar: " + d);
				} while (d != 7);
				System.out.println("Se necesitaron " + e + " ciclos");
			}//if-14 END
			else if (opcion == 15) {
				System.out.println("----------------------------------------"
						+ "\nEjercicio 14");
				f = lLimit2 + (int) (new Random().nextFloat() * (rLimit2
					- lLimit2));
				if (f > 5) System.out.println("Hoy va a ser un gran dia");
				else if (f < 5) System.out.println("Hoy va a ser el mejor"
													+ " día del mundo");
				else System.out.println("AAAAH, sin opcion...");
			}//if-15 END
			else if (opcion == 16) {
				g = lLimit3 + (int) (new Random().nextFloat() * (rLimit3
						- lLimit3));
				switch (g) {
				case 1:
					System.out.println("Bueno, algo es algo");
					break;
				case 2:
					System.out.println("casi casi");
					break;
				case 3:
					System.out.println("El valor de PI");
					break;
				case 4:
					System.out.println("La silla");
					break;
				case 5:
					System.out.println("hala, tas pasao', tio...");
					break;
				default:
					System.out.println("Esto no esta previsto");
				}//switch END
			}//if-16 END
			else if (opcion == 0) {
				System.out.println("Fin del Programa.");
				in.close();
				break;
			}// if-0 END
			else {
				System.out.println("Introduce una opción correcta.");
			} // else capturatodo END
		} // while true END
	} // main END
}
