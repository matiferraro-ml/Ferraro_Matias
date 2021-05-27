package introduccion.ej3;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero a analizar: ");
        int n = scanner.nextInt();

        boolean esPrimo = true;

        double techoRaizN = Math.ceil(Math.sqrt((double) n));

        if(n <= 2) {
            esPrimo = true;
        }

        else {
            for (int i = 2; i <= (int) techoRaizN; i++) {
                if (n % i == 0) {
                    esPrimo = false;
                }
            }
        }

        if(!esPrimo) {
            System.out.println("No es primo");
        }
        else {
            System.out.println("Es primo");
        }

    }

}
