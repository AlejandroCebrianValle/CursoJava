import java.util.*;

public class Enunciados25Septiembre {

	public static void main(String[] args) {
		// Variables generales
		int opcion;
		// Variables Primer Ejercicio
		int i;
		double longi;
		double area;
		// Variables Segundo Ejercicio
		int j;
		int mult=5;
		// Variables Tercer Ejercicio
		int k;
		int l;
		// Variables Cuarto Ejercicio
		double a;
		double b;
		double c;
		// Variables Quinto Ejercicio
		int factorial=1;
		int factor;
		// Variables Sexto Ejercicio
		int m;
		double numero;
		double suma=0;
		double media=0;
		//  Main //
		Scanner in = new Scanner(System.in);
		while (true){
			System.out.println("\nMenu: Elija una opcion para realizar el "
								+  "Ejercicio:\n1.\tArea y longitud del"
								+ " circulo desde 15 a 180 u (de 15 en 15).\n"
								+ "2.\tTabla de multiplicar del 5.\n"
								+ "3.\tTablas de multiplicar del 1 al 10.\n"
								+ "4.\tEvaluador de triangulos.\n"
								+ "5.\tCalculadora de factoriales.\n"
								+ "6.\tSumatorio y Media de 10 numero "
								+ "introducidos por teclado.\n"
								+ "Introduzca 0 para salir.");
			opcion = in.nextInt();
			if (opcion == 1) {
				System.out.println("----------------------------------------"
									+ "\nEjercicio 1");
				for (i=15; i<=180; i+=15) {
					longi=2*Math.PI*i;
					area=Math.PI*(i^2);
					System.out.println("Radio:" + i + "\tArea: "+ area
										+ "\tLongitud: " + longi);
				}
			}
			else if (opcion == 2) {
				System.out.println("----------------------------------------"
									+ "\nEjercicio 2");
				for (j=0; j<=10; j++) {
					System.out.println(mult + " x " + j + " == " + (j*mult));
				}
			}
			else if (opcion == 3) {
				System.out.println("----------------------------------------"
						+ "\nEjercicio 3");
				for (k=1; k<=10; k++) {
					System.out.println("------ Tabla del " + k + "-------");
					for (l=0; l<=10; l++) {
						System.out.println(k + " x " + l + "==" + (k*l));
					}
				}
			}
			else if (opcion == 4) {
				System.out.println("----------------------------------------"
						+ "\nEjercicio 4");
				System.out.println("Ingrese los lados del Triangulo	:");
				a = in.nextDouble();
				System.out.println("Segundo lado: ");
				b = in.nextDouble();
				System.out.println("Tercer lado: ");
				c = in.nextDouble();
				if (a == b && a == c && b == c) {
					System.out.println("Su triangulo es Equilátero.");
				}
				else if (a == b || a == c || b == c) {
					System.out.println("Su triangulo es Isósceles.");
				}
				else {
					System.out.println("Su triangulo es Escaleno.");
				}
			}
			else if (opcion == 5) {
				System.out.println("----------------------------------------"
						+ "\nEjercicio 5");
				System.out.println("Ingrese el numero a calcular su"
									+ " factorial:");
				factor = in.nextInt();

				for (i=factor; i >= 1; i--) {
					factorial = factorial*i;
				}
				System.out.println("El factorial de " + factor + " es "
									+ factorial);
				factorial = 1;
			}
			else if (opcion == 6) {
				System.out.println("----------------------------------------"
						+ "\nEjercicio 6");
				for (m=1; m<=10; m++) {
					System.out.println("Introduzca el " + m +"º numero:");
					numero = in.nextDouble();
					suma+=numero;
					media+=(numero/10);
				}
				System.out.println("La media de los numero introducidos es: "
									+ media +"\nEl sumatorio es: " + suma);
			}
			else if (opcion == 0) {
				System.out.println("Fin del Programa.");
				in.close();
				break;
			}
			else {
				System.out.println("Introduce una opcion correcta.");
			}
		} //while true END
	}

}
