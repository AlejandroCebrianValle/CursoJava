import java.util.Scanner;

public class Ejercicios30Septiembre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*                          Alias                                    */
        Scanner in = new Scanner(System.in); // Alias of Scanner function.
		// Variables primer ejercicio
        int i;				// Iterador
        String names[];		// Array guarda nombres
        String name;		
        /*
         * 							MAIN
         */
        /*							Ejercicio 1								 */
        System.out.println("----------------------------------------"
							+ "\nEjercicio 1");
        names = new String[5];
        for (i = 0; i < 5; i++) {
        	System.out.print("Introducir nombre: ");
        	name = in.next();
        	names[i] = name;
        }
        for (i = 4; i >= 0; i--) {
        	System.out.println(names[i]);
        }
        in.close();
        /*							Ejercicio AB							 */
        System.out.println("----------------------------------------"
				+ "\nEjercicio AB");
        int a=5, b=8;
        System.out.println("Suma = " + suma(a, b));
	}
	
	public static int suma(int a, int b) {
		return a+b;
	}
}
