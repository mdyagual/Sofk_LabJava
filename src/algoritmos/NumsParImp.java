package algoritmos;

import java.util.Scanner;

public class NumsParImp {
    public static void ej5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 5: Números pares e impares - While ver.");
        System.out.print("Números pares (P) o impares (I): ");
        String op=sc.nextLine();
        mostrarNums(op);


    }


    public static void mostrarNums(String op){
        int n=1;
        switch(op){
            case "P":
                while (n<=100){
                    if(n%2==0){
                        System.out.println(n);
                    }
                    n++;
                }
                break;
            case "I":
                while (n<=100){
                    if(n%2!=0){
                        System.out.println(n);
                    }
                    n++;
                }
                break;
        }


    }
}
