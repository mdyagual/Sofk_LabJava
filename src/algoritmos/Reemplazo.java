package algoritmos;

import java.util.Scanner;

public class Reemplazo {
    public static void ej9() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ejercicio 9: Reemplazo en frase");
        String texto="La sonrisa sera la mejor arma contra la tristeza";
        //Reemplazo
        String n_texto=texto.replace('a','e');
        System.out.print("Ingrese una frase cualquiera: ");
        String frase=sc.nextLine();
        System.out.println(n_texto.concat(" "+frase));

    }
}
