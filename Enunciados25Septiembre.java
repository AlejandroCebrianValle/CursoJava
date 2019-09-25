import java.util.*;  

public class Enunciados25Septiembre {

	public static void main(String[] args) {
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
		while (true){
			System.out.println("Ejercicio 1");
			for (i=15; i<=180; i+=15) {
				longi=2*Math.PI*i;
				area=Math.PI*(i^2);
				System.out.println("Radio:" + i + "\tArea: "+ area
									+ "\tLongitud: " + longi);
			}
			System.out.println("--------------------------------------------"
								+ "\nEjercicio 2");
			for (j=0; j<=10; j++) {
				System.out.println(mult + " x " + j + " == " + (j*mult));
			}
			System.out.println("--------------------------------------------"
					+ "\nEjercicio 3");
			for (k=1; k<=10; k++) {
				System.out.println("-------- Tabla del " + k + "--------");
				for (l=0; l<=10; l++) {
					System.out.println(k + " x " + l + "==" + (k*l));
				}
			}
			System.out.println("--------------------------------------------"
					+ "\nEjercicio 4");
			Scanner in = new Scanner(System.in);
			System.out.println("Ingrese los lados del Triangulo	:");
			a = in.nextDouble();
			System.out.println("Segundo lado: ");
			b = in.nextDouble();
			System.out.println("Tercer lado: ");
			c = in.nextDouble();
			if (a == b && a == c && b == c) {
				System.out.println("Su triángulo es Equilátero.");
			}
			else if (a == b || a == c || b == c) {
				System.out.println("Su triángulo es Isósceles.");
			}
			else {
				System.out.println("Su triángulo es Escaleno.");
			}
			System.out.println("--------------------------------------------"
					+ "\nEjercicio 5");
			System.out.println("Ingrese el número a calcular su factorial:");
			factor = in.nextInt();
			
			for (i=1; i <= factor; i++) {
				factorial = factorial*i;
			}
			System.out.println("El factorial de" + factor + " es "
								+ factorial);
			System.out.println("--------------------------------------------"
					+ "\nEjercicio 6");
			for (m=1; m<=10; m++) {
				System.out.println("Introduzca el " + m +"º numero:");
				numero = in.nextDouble();
				suma+=numero;
				media+=(numero/10);
				System.out.println("La media de los número introducidos es:"
						+ media +"\nEl sumatorio es: " + suma);
			}
			System.out.println("La media de los número introducidos es: "
								+ media +"\nEl sumatorio es: " + suma);
			in.close();
			break;
		}
		System.out.println("Fin del Programa.");

	}

}
