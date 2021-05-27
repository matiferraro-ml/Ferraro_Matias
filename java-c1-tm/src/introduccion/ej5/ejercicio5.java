package introduccion.ej5;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros naturales deseados: ");
        int n = scanner.nextInt();
        System.out.println("Ingrese la cantidad de digitos: ");
        int m = scanner.nextInt();
        System.out.println("Ingrese el digito a contener: ");
        int d = scanner.nextInt();

        int i = 0, acum = 0;

        while(acum < n) {
            if(cumpleCondicion(i, m, d)) {
                acum++;
                System.out.println(i);
            }
            i++;
        }

    }

    public static boolean cumpleCondicion(int i, int m, int d) {
        Integer iI = i;
        Integer dI = d;
        String iS = iI.toString();
        String dS = dI.toString();
        return (apariciones(iS, dS) == m);
    }

    public static int apariciones(String i, String d) {
        int acum = 0;
        for(char c : i.toCharArray()) {
            if(d.charAt(0) == c) {
                acum++;
            }
        }
        return acum;
    }

}
