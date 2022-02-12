package miscelaneos.ejercicio16;

import java.util.Scanner;

public class Ej16 {
    public static void main() {
        System.out.println("Ejercicio 16: IMC persona");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String nom=sc.nextLine();
        System.out.print("Ingrese edad: ");
        int edad=sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese sexo: ");
        String sexo=sc.nextLine();
        System.out.print("Ingrese peso: ");
        double peso=Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese altura: ");
        double altura=Double.parseDouble(sc.nextLine());
        System.out.println("------------------------------------");

        Persona p1 = new Persona(nom,edad,sexo.charAt(0),peso,altura);
        Persona p2 = new Persona(nom,edad,sexo.charAt(0));
        Persona p3 = new Persona();


        mostrarIMC(p1);
        System.out.println(p1);
        System.out.println("Es mayor de edad: "+p1.isMayorDeEdad());
        System.out.println();

        mostrarIMC(p2);
        System.out.println(p2);
        System.out.println("Es mayor de edad: "+p2.isMayorDeEdad());
        System.out.println();

        mostrarIMC(p3);
        System.out.println(p3);
        System.out.println("Es mayor de edad: "+p3.isMayorDeEdad());
        System.out.println("------------------------------------");

    }

    public static void mostrarIMC(Persona p){
        switch(p.calcularIMC()){
            case Persona.PESO_ALTO:
                System.out.println("La siguiente persona tiene sobrepeso");
                break;
            case Persona.PESO_BAJO:
                System.out.println("La siguiente persona tiene bajo peso");
                break;
            case Persona.PESO_IDEAL:
                System.out.println("La siguiente persona tiene peso ideal");
                break;

        }

    }
}
