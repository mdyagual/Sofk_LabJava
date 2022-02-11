package algoritmos;

import java.util.Scanner;

public class Facturar {
    static double iva = 0.21;
    public static void ej4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ejercicio 4: Facturar");
        System.out.print("Ingrese el precio del producto: ");
        double precio= sc.nextDouble();
        sc.nextLine();

        System.out.printf("Total: %.2f\n",calcularTotal(precio));
    }
    public static double calcularTotal(double precio){
        return precio+(precio*iva);
    }
}
