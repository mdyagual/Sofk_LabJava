import algoritmos.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op ="";
        while (!(op.equals("3"))){
            System.out.println("Sofka U - Laboratorio de Java");
            System.out.println("1. Algoritmos: Ejercicios del 1 al 15");
            System.out.println("2. Misceláneos: Ejercicios del 16 al 18");
            System.out.println("3. Salir");

            System.out.print("Seleccione una opción: ");
            op = sc.nextLine();
            switch (op){
                case "1":
                    String subop ="";
                    while (!(subop.equals("R"))){
                        mostrarOpsAlg();
                        System.out.print("Seleccione una opción: ");
                        subop = sc.nextLine();

                        switch (subop){
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

                            case "R":
                                System.out.println("Regresando al menú principal");
                                System.out.println();
                            default:
                                System.out.println("Ingrese una opción válida");
                                break;
                        }
                    }
                    break;
                case "2":
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
        System.out.println("1. Ejercicio 1y2");
        for(int i=2; i<15;i++){
            System.out.printf("%d. Ejercicio %d\n",i,(i+1));
        }
        System.out.println("R. Regresar al menú principal");
        System.out.println();
    }
}
