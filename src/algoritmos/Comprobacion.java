package algoritmos;

import java.util.Scanner;

public class Comprobacion {
    public static void ej7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 7: Comprobación cíclica");
        int num;
        do{
            System.out.print("Ingrese un número: ");
            num=sc.nextInt();
            if(!(num>=0)){
                System.out.println("El número no es mayor o igual que cero. Intente de nuevo.");
            }
            sc.nextLine();
        }while(num<=0);
        System.out.printf("El número %d es mayor o igual a cero\n",num);





    }
}
