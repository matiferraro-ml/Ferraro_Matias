package introduccion.ej1;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros pares deseados: ");
        int n = scanner.nextInt();

        /*for(int i = 0; i < n*2; i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }*/

        for(int i = 0; i < n; i++) {
            System.out.println(2*i);
        }

    }

}
