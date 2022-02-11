package algoritmos;

import java.util.Scanner;

public class AreaCirculo {
    public static void ej3() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ejercicio 3: Área círculo");
        System.out.print("Ingrese el radio del círculo: ");
        String s_radio=sc.nextLine();

        double d_radio=Double.parseDouble(s_radio);

        System.out.printf("El área del círculo con radio %.2f es %.2f\n",d_radio,calcularArea(d_radio));

    }

    public static double calcularArea(double radio){
        return 2 * Math.PI * Math.pow(radio,2);
    }
}
