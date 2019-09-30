import java.util.Scanner;

public class Ordenamientos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int i, j, nota[], aux;
		nota = new int[5];
			
		for (i=0; i<nota.length; i++) {
			System.out.println("Nota de la asignatura " + i + " (0 a 100): ");
			nota[i] = lector.nextInt();
		}
		lector.close();
			
		for (i=0; i<nota.length; i++) {
			for (j=0; j<nota.length-(i+1); j++) {
				if (nota[j]>nota[j+1]) {
					aux = nota[j];
					nota[j] = nota[j+1];
					nota[j+1] = aux;					
				}
			}
		}
				
		for (i=0; i<nota.length; i++) {
			System.out.println("Nota de la asignatura " + i + ": "+nota[i]);
		}



	}

}
