package algoritmos;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DiaSemana {
    static Scanner sc = new Scanner(System.in);
    public static void ej8() {
        List<String> diasL = Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes");
        System.out.println("Ejercicio 8: Día de la semana");
        System.out.print("Ingrese un día de la semana: ");
        String dia=sc.nextLine();
        switch (dia){
            case "Lunes":
                System.out.printf("El día Lunes es día laboral: %b\n",diasL.contains(dia));
                break;
            case "Martes":
                System.out.printf("El día Martes es día laboral: %b\n",diasL.contains(dia));
                break;
            case "Miercoles":
                System.out.printf("El día Miercoles es día laboral: %b\n",diasL.contains(dia));
                break;
            case "Jueves":
                System.out.printf("El día Jueves es día laboral: %b\n",diasL.contains(dia));
                break;
            case "Viernes":
                System.out.printf("El día Viernes es día laboral: %b\n",diasL.contains(dia));
                break;
            case "Sabado":
                System.out.printf("El día Sabado es día laboral: %b\n",diasL.contains(dia));
                break;
            case "Domingo":
                System.out.printf("El día Domingo es día laboral: %b\n",diasL.contains(dia));
                break;
            default:
                System.out.println("Lo que ha ingresado no es un día de la semana");
                break;

        }


    }

}
