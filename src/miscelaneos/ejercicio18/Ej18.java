/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelaneos.ejercicio18;

public class Ej18 {
    public static void main() {
        System.out.println("Ejercicio 19: Series y Videojuegos");
        //Creamos dos arrays de cada tipo de objeto
        Serie[] listaSeries =new Serie[5];
        Videojuego[] listaVideojuegos =new Videojuego[5];
  
        //Creamos un objeto en cada posicion del array
        listaSeries[0]=new Serie();
        listaSeries[1]=new Serie("El juego del calamar", "Jung Jae-il");
        listaSeries[2]=new Serie("Modern family", 11, "Humor", "Christopher Lloyd");
        listaSeries[3]=new Serie("Futurama", 7 ,"Humor", "Matt Groening");
        listaSeries[4]=new Serie("Better call Saul", 5, "Thriller", "Vince Gilligan");
  
        listaVideojuegos[0]=new Videojuego();
        listaVideojuegos[1]=new Videojuego("Resident Evil 4", 30, "Aventura", "Capcom");
        listaVideojuegos[2]=new Videojuego("God of war: Ascension", 30);
        listaVideojuegos[3]=new Videojuego("Super Mario Galaxy", 30, "Plataforma", "Nintendo");
        listaVideojuegos[4]=new Videojuego("Child of Light", 200, "Rol", "Ubisoft");
  
        //entregamos algunos videojuegos y series
        listaSeries[1].entregar();
        listaSeries[4].entregar();
        System.out.printf("La serie %s está prestada\n",listaSeries[1].getTitulo());
        System.out.printf("La serie %s está prestada\n",listaSeries[4].getTitulo());

        listaVideojuegos[1].entregar();
        listaVideojuegos[3].entregar();
        System.out.printf("El videojuego %s está prestado\n",listaVideojuegos[1].getTitulo());
        System.out.printf("El videojuego %s está prestado\n",listaVideojuegos[3].getTitulo());

        System.out.println();
        
        //Recorremos los arrays para contar cuantos entregados hay, tambien los devolvemos
  
        int entregados=0;
  
        for(int i=0;i<listaSeries.length;i++){
            if(listaSeries[i].isEntregado()){
                entregados+=1;
                listaSeries[i].devolver();
                System.out.printf("La serie %s ha sido devuelta\n",listaSeries[i].getTitulo());
  
            }
            if(listaVideojuegos[i].isEntregado()){
                entregados+=1;
                listaVideojuegos[i].devolver();
                System.out.printf("El videojuego %s ha sido devuelto\n",listaVideojuegos[i].getTitulo());
            }
        }
  
        System.out.println("\nSe entregaron "+entregados+" articulos y han sido devueltos\n");
  
            
        //Creamos dos objetos con la primera posicion de cada array
        Serie serieMayor=listaSeries[0];
        Videojuego videojuegoMayor=listaVideojuegos[0];
  
        //Recorremos el array desde la posicion 1 (no 0), comparando el mayor con las posiciones del array
        for(int i=1;i<listaSeries.length;i++){
            if(listaSeries[i].compareTo(serieMayor)==1){
                serieMayor=listaSeries[i];
            }
            if(listaVideojuegos[i].compareTo(videojuegoMayor)==1){
                videojuegoMayor=listaVideojuegos[i];
            }
  
        }
  
        //Mostramos toda la informacion del videojuego y serie mayor
        System.out.println("Videojuego con más horas estimadas");
        System.out.println(videojuegoMayor);
        System.out.println("\nSerie con más temporadas");
        System.out.println(serieMayor);
  
    }
    
}
