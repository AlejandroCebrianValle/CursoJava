import java.util.Arrays;

public class ManejoArray {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	String nombres[] = {"Pepe", "Juan", "Luis", "Lucas", "Miguel"};
	double sueldos[] = {1000,2000,2500,1200,1800};
	
	String agenda[][] = {
			{"Alicia", "C/ Pez, 35", "913672020"},
			{"Rosa", "C/ Oca, 35", "61888888"},
			{"Carlos", "C/ Sol, 35", "913672021"},
			{"Luis", "C/ Pera, 35", "913672023"}
	};
	for (int i = 0; i < nombres.length; i++) {
		System.out.println(nombres[i] + " ; " + sueldos[i]);
	}
	for (int j = 0; j < agenda.length; j++) {
		System.out.println(Arrays.toString(agenda[j]));
	}
	}
}
