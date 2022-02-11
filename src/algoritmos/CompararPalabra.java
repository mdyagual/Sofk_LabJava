package algoritmos;

import java.util.Scanner;

public class CompararPalabra {
    public static void ej12() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ejercicio 12: Comparar palabras");
        System.out.print("Palabra 1: ");
        String p1=sc.nextLine();
        System.out.print("Palabra 2: ");
        String p2=sc.nextLine();

        comparacion(p1,p2);

    }

    public static void comparacion(String p1, String p2){
        String [] s_p1=p1.split("");
        String [] s_p2=p2.split("");
        if(p1.equals(p2)){
            System.out.println("Son iguales.");
        }else{
            if(s_p1.length>s_p2.length){
                for(int i=0; i<s_p2.length; i++){
                    if(!(s_p1[i].equals(s_p2[i]))){
                        System.out.printf("Diferencia en %s y %s\n",s_p1[i],s_p2[i]);
                    }
                }
                System.out.printf("La palabra %s es más larga que %s\n",p1,p2);
            }else if (s_p2.length>s_p1.length){
                for(int i=0; i<s_p1.length; i++){
                    if(!(s_p2[i].equals(s_p1[i]))){
                        System.out.printf("Diferencia en %s y %s\n",s_p1[i],s_p2[i]);
                    }
                }
                System.out.printf("La palabra %s es más larga que %s\n",p2,p1);
            }else{
                for(int i=0; i<s_p1.length; i++){
                    if(!(s_p2[i].equals(s_p1[i]))){
                        System.out.printf("Diferencia en %s y %s\n",s_p1[i],s_p2[i]);
                    }
                }

            }
        }
        System.out.println();
    }
}
