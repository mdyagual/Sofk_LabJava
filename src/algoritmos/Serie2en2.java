package algoritmos;

import java.util.Scanner;

public class Serie2en2 {

    public static void ej14() {
        System.out.println("Ejercicio 14: Serie 2 en 2");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n=sc.nextInt();
        while (n<=1000){
            System.out.println(n);
            n+=2;

        }


    }
}
