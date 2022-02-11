package algoritmos;

import java.text.SimpleDateFormat;
import java.util.Date;
public class ConsultarFecha {
    public static void ej13() {
        System.out.println("Ejercicio 13: Consultar fecha");
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        System.out.println("La fecha de hoy es: "+dateFormat.format(date));
        System.out.println();


    }
}
