package algoritmos;

import java.util.Scanner;

public class QuitarEspacio {
    public static void ej10() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ejercicio 10: Eliminar espacios en texto");
        System.out.print("Ingrese una frase cualquiera: ");
        String [] frase=sc.nextLine().split(" ");
        System.out.println(String.join("",frase));

    }
}
