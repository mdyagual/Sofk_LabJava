package algoritmos;

import java.util.Scanner;

public class GestionCinematografica {

    public static void ej15() {
        Scanner sc = new Scanner(System.in);
        menu();
        System.out.print("Seleccione una opción: ");
        String op = sc.nextLine();
        while(!(op.equals("8"))){

            switch (op){
                case "1":
                    menu();
                    break;
                case "2":
                    menu();
                    break;
                case "3":
                    menu();
                    break;
                case "4":
                    menu();
                    break;
                case "5":
                    menu();
                    break;
                case "6":
                    menu();
                    break;
                case "7":
                    menu();
                    break;
                case "8":
                    System.out.println("Fin del programa de gestión cinematográfica");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo");
                    break;

            }
            System.out.print("Seleccione una opción: ");
            op = sc.nextLine();
        }
        System.out.println();

    }

    public static void menu(){
        System.out.println("****** GESTION CINEMATOGRÁFICA ********\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR");
    }
}
