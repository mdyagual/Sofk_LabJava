package algoritmos;

import java.util.*;

public class ChequeoFrase {
    public static void ej11() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ejercicio 11: Chequeo frase");
        System.out.print("Ingrese una frase cualquiera: ");
        String frase=sc.nextLine();
        System.out.println(String.join("",frase));
        checar(frase);

    }

    public static void checar(String frase){
        longitudFrase(frase);
        conteoVocales(frase);
    }

    public static void longitudFrase(String frase){
        System.out.printf("Longitud de la frase: %d \n",frase.length());
    }

    public static void conteoVocales(String frase){
        Map<String,Integer> contarVocales = new HashMap<>();
        contarVocales.put("a",0);
        contarVocales.put("e",0);
        contarVocales.put("i",0);
        contarVocales.put("o",0);
        contarVocales.put("u",0);
        for (int i=0; i<frase.length();i++){
            char l = frase.charAt(i);
            if(esVocal(l)){
                String key=String.valueOf(l).toLowerCase();
                contarVocales.put(key,contarVocales.get(key)+1);
            }

        }
        System.out.print("Conteo de vocales: ");
        Map<String,Integer> ordVocales = new TreeMap<>(contarVocales);
        System.out.println(ordVocales);
    }

    public static boolean esVocal(char letra){
        return "aeiou".contains(String.valueOf(letra).toLowerCase());
    }
}
