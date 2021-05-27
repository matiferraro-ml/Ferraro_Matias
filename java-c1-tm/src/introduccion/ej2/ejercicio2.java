package introduccion.ej2;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros multiplos deseados: ");
        int n = scanner.nextInt();
        System.out.println("Ingrese el numero: ");
        int m = scanner.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println(i*m);
        }

    }

}
