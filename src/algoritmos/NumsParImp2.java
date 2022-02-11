package algoritmos;

import java.util.Scanner;

public class NumsParImp2 {
    public static void ej6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 6: Números pares e impares - For ver.");
        System.out.print("Números pares (P) o impares (I): ");
        String op=sc.nextLine();
        mostrarNums(op);


    }


    public static void mostrarNums(String op){
        switch(op){
            case "P":
                for (int i=1;i<=100;i++){
                    if(i%2==0){
                        System.out.println(i);
                    }
                }
                break;
            case "I":
                for (int i=1;i<=100;i++){
                    if(i%2!=0){
                        System.out.println(i);
                    }
                }
                break;
        }


    }
}
