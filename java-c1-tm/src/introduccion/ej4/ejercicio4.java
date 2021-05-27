package introduccion.ej4;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros primos a mostrar: ");
        int n = scanner.nextInt();

        int i = 1;
        int j = 0;

        while(n > 0) {
            if(esPrimo(i)) {
                System.out.println(i);
                n--;
            }
            i++;
        }

    }

    public static boolean esPrimo(int n) {
        boolean primo = true;

        double techoRaizN = Math.ceil(Math.sqrt((double) n));

        if(n <= 2) {
            primo = true;
        }

        else {
            for (int i = 2; i <= (int) techoRaizN; i++) {
                if (n % i == 0) {
                    primo = false;
                }
            }
        }

        return primo;
    }
}
