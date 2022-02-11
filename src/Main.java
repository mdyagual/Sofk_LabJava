import algoritmos.*;
import miscelaneos.ejercicio16.*;
import miscelaneos.ejercicio17.*;
import miscelaneos.ejercicio18.*;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op = "";
        while (!(op.equals("3"))) {
            System.out.println("Sofka U - Laboratorio de Java");
            System.out.println("1. Algoritmos: Ejercicios del 1 al 15");
            System.out.println("2. Misceláneos: Ejercicios del 16 al 18");
            System.out.println("3. Salir");

            System.out.print("Seleccione una opción: ");
            op = sc.nextLine();
            switch (op) {
                case "1":
                    String subop = "";
                    while (!(subop.equals("R"))) {
                        mostrarOpsAlg();
                        System.out.print("Seleccione una opción: ");
                        subop = sc.nextLine().toUpperCase();
                        switch (subop) {
                            case "1":
                                MayorMenor.ej1y2();
                                break;
                            case "2":
                                AreaCirculo.ej3();
                                break;
                            case "3":
                                Facturar.ej4();
                                break;
                            case "4":
                                NumsParImp.ej5();
                                break;
                            case "5":
                                NumsParImp2.ej6();
                                break;
                            case "6":
                                Comprobacion.ej7();
                                break;
                            case "7":
                                DiaSemana.ej8();
                                break;
                            case "8":
                                Reemplazo.ej9();
                                break;
                            case "9":
                                QuitarEspacio.ej10();
                                break;
                            case "10":
                                ChequeoFrase.ej11();
                                break;
                            case "11":
                                CompararPalabra.ej12();
                                break;
                            case "12":
                                ConsultarFecha.ej13();
                                break;
                            case "13":
                                Serie2en2.ej14();
                                break;
                            case "14":
                                GestionCinematografica.ej15();
                                break;
                            case "R":
                                System.out.println("Regresando al menú principal");
                                System.out.println();
                                break;
                            default:
                                System.out.println("Ingrese una opción válida");
                                break;
                        }
                    }
                    break;
                case "2":
                    String subop2 = "";
                    while (!(subop2.equals("R"))) {
                        mostrarOpsMisc();
                        System.out.print("Seleccione una opción: ");
                        subop2 = sc.nextLine().toUpperCase();
                        switch (subop2) {
                            case "16":
                                //Ej16.main();
                                break;
                            case "17":
                                Ej17.main();
                                break;
                            case "18":
                                Ej18.main();
                                break;
                            case "R":
                                System.out.println("Regresando al menú principal");
                                System.out.println();
                                break;
                            default:
                                System.out.println("Ingrese una opción válida");
                                break;
                        }
                        System.out.println();
                    }
                        break;
                        case "3":
                            System.out.println("Laboratorio realizado por Mishell Yagual, para Sofka U~");
                            break;
                        default:
                            System.out.println("Ingrese una opción válida");
                            break;
                    }
            }



    }
    public static void mostrarOpsAlg(){
        System.out.println("Algoritmos~");
        System.out.println("1. Ejercicio 1y2");
        for(int i=2; i<15;i++){
            System.out.printf("%d. Ejercicio %d\n",i,(i+1));
        }
        System.out.println("R. Regresar al menú principal");
        System.out.println();
    }

    public static void mostrarOpsMisc(){
        System.out.println("Misceláneos~");
        for(int i=16; i<19;i++){
            System.out.printf("%d. Ejercicio %d\n",i,(i+1));
        }
        System.out.println("R. Regresar al menú principal");
        System.out.println();
    }
}

