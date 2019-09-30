/*
  Author: Alejandro Cebrian del Valle
  Version: 1.1      27 / sept /2019

  Silly and basic parking manager for cmd/shell execution.
  This parking manager only functions w/ equal number of places for each floor
  Function:
        This program creates an array type string and a array list (I mean, an
        array with one "row") witch saves car plates. To add/remove a "car",
        two nested for-loop go through an array searching a free ("libre") or
        occuped (plate) place and SMASH this memory record.

        To obtain a "permanent"-executing program (unless user kill the process
        or end the program), the program use an infinite while loop
        (while (true)) and a try-catch sentences as Exception controler.

 */

/*                              imports                                      */
import java.util.*;

public class GestorDeParking11 {

    public static void main(String[] args) {
        /*                          Alias                                    */
        Scanner in = new Scanner(System.in); // Alias of Scanner function.
        /*                          Variables                                */
        Boolean tester;          // Boolean indicator of duplicate plate
        int     i;               // Row iterator
        int     j;               // Col iterator
        int     floor = 0;  	 // Number of floors in the parking
        int     free;            // Number of all free places
        int     freeFloor;       // Number of free places for each floor
		int     plFloor = 0;	 // Number of place/floor in the parking
        int     option;          // Option selector of manage menu
        String  park[][]; 		 // The name says all...
        String  plate;           // Plate of each car.
        String  placeDecision;   // Option selector of submenu Choose place?
        String  plateList[];     // List of plates which are in the parking
        /*
         *                            MAIN
         */
        System.out.println("Bienvenido al gestor de Parking."
							+ "\n---------------------------------\n"
							+ "Introduzca las dimensiones del parking");
        while (floor == 0 || plFloor == 0) {
            try {
                System.out.print("Numero de pisos: ");
				floor = in.nextInt();
				System.out.print("Numero de plazas por piso: ");
				plFloor = in.nextInt();
                break;
            } catch (Exception ex) {
                floor = 0;
                plFloor = 0;
                System.out.println("Introduzca un valor correcto (1 o 2).");
                in.nextLine();  // Catch not printable elements
            }       // TRY-catch Exception for not int Scanner
        }           // while matrix dimensions giver
        System.out.println("Su parking dispone de " + (floor * plFloor)
                            + " plazas");
        /*            Array and list of plates creation and fill             */
        park = new String[floor][plFloor];
        plateList = new String[floor * plFloor];
        for (i = 0; i < park.length; i++) {
            for (j = 0; j < park[i].length; j++) {
                park[i][j] = "Libre";
                plateList[j + (i * plFloor)] = "Libre";
            }
        }
        /*                         Printing                                  */
        for (i = 0; i < park.length; i++) {
			System.out.println(Arrays.toString(park[i]));
		}
        /*                      Repetitive menu                              */
        loop1: while (true){ // loop creates a callable variable
            try {
                System.out.print("\nMenu:\n"
								+ "1.\tConsultar Plazas.\n2.\tEntrada de "
                                + "coche.\n3.\tSalida de coche.\n"
								+ "0.\tSalida del programa.\n\tOpcion: ");
				option = in.nextInt();
                switch (option) {
                /*                      Exit option                          */
                case 0:
                    System.out.println("Adios, saliendo del programa...");
                    break loop1;
                /*                      Query option                         */
                case 1:
                    free = 0;
                    for (i = 0; i < park.length; i++) {
						freeFloor = 0;
						for (j = 0; j < park[i].length; j++) {
							if (park[i][j] == "Libre") {
								free++;
								freeFloor++;
							}
						}
						System.out.print("Plazas libres en piso "
										+ i + " : " + freeFloor + "\n");
						System.out.println("\t" + Arrays.toString(park[i]));
					}        // FOR Searching-free-place wanderer
					System.out.println("Plazas libres en totales: " + free);
                    break;
                /*                      add car option                       */
                case 2:
                    System.out.print("Introduzca la matricula del coche: ");
                    plate = in.next();
                    tester = true;
                    for (i = 0; i < plateList.length; i++) {
                        if (plate.equalsIgnoreCase(plateList[i])) {
                            System.out.println("Introduzca una matricula no"
                                               + " repetida.");
                            tester = false;
                            break;
                        }
                    }           // FOR not duplicate plate tester
                    if (! tester) break;
                                // IF manager for duplicate cases
                    System.out.print("Elija plaza (Si: s/No: cualquiera): ");
                    placeDecision = in.next();
                    if (placeDecision.equalsIgnoreCase("s")) {
                        System.out.print("Introduzca piso: ");
                        i = in.nextInt();
                        System.out.print("Introduzca plaza del piso: ");
                        j = in.nextInt();
                        park[i][j] = plate;
                        plateList[j + (i * plFloor)] = plate;
                        System.out.print("Coche en plaza:"
                                          + i + " - " + j + "\n");
                    } else {
                        loop2: for (i = 0; i < park.length; i++) {
            					for (j = 0; j < park[i].length; j++) {
            						if (park[i][j] == "Libre") {
                                        park[i][j] = plate;
                                        plateList[j + (i * plFloor)] = plate;
                                        System.out.print("Coche en plaza:"
                                                          + i + " - "
                                                          + j + "\n");
                                        break loop2;
            						}   // IF free place condition
            					}
                            } // FOR Search-free-place wanderer to asign place
                        }               //IF & ELSE specific/ !specific place
                    break;
                /*                   remove car option                       */
                case 3:
                    System.out.print("Introduzca la matricula del coche: ");
                    plate = in.next();
                    loop3: for (i = 0; i < park.length; i++) {
                        for (j = 0; j < park[i].length; j++) {
                            if (plate.equals(plateList[i])) {
                                park[i][j] = "Libre";
                                plateList[j + (i * plFloor)] = "Libre";
                                break loop3;
                            }
                        }
                    System.out.print("La matricula introducida no está en"
                                     + " este aparcamiento");
                    }           // FOR searcher
                    break;
                default:
                    System.out.println("Introduzca un valor correcto (1/2/3).");
                    break;
                }               // switch multioption
            } catch (Exception exc) {
				System.out.println("Introduzca un valor numerico correcto.");
				in.nextLine();  // Catch not printable elements
				continue;
            }   // TRY-catch Exception for not int Scanner option manager
        }                       // while MENU
        in.close();
    }                           // class  MAIN
}                               // class PROGRAMA
