package algoritmos;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
//Ejercicio 1 y 2
public class MayorMenor {
    public static void ej1y2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 1 y 2: Mayor-Menor");
        System.out.print("N1: ");
        int n1=sc.nextInt();
        sc.nextLine();
        System.out.print("N2: ");
        int n2=sc.nextInt();;

        mayorQue(n1,n2);
        System.out.println();
    }




    //Funciones soporte
    //Soporte ej1y2()
    public static void mayorQue(int n1, int n2){
        if(n1>n2){
            System.out.printf("%d es mayor que %d",n1,n2);
        }else{
            System.out.printf("%d es mayor que %d",n2,n1);
        }
    }
}
