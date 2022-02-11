package algoritmos;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
public class ConsultarFecha {
    public static void ej13() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ejercicio 13: Consultar fecha");
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        System.out.println("La fecha de hoy es: "+dateFormat.format(date));
        System.out.println();


    }
}
