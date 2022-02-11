/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelaneos.ejercicio17;

/**
 *
 * @author Henry
 */
public class Ej17 {


    public static void main() {
        Electrodomestico listaE[]=new Electrodomestico[10];
        
        listaE[0]=new Electrodomestico(200, "Verde",'C',60);
        listaE[1]=new Lavadora(150, 30);
        listaE[2]=new Television(500, "negro",'E',80, 42, false);
        listaE[3]=new Electrodomestico();
        listaE[4]=new Electrodomestico(600, "gris", 'D', 20);
        listaE[5]=new Lavadora(300, "blanco", 'Z', 40 ,40);
        listaE[6]=new Television(250, 70);
        listaE[7]=new Lavadora(400,"azul", 'A', 100, 15);
        listaE[8]=new Television(200,"naranja", 'C', 60, 30, true);
        listaE[9]=new Electrodomestico(50, 10);
   
        
        mostrarInfo(listaE);
        mostrarPrecioFinal(listaE);
    }
    
    public static void mostrarPrecioFinal(Electrodomestico[] lista){
        double pElec=0;
        double pLav=0;
        double pTel=0;
        double resB;
        
        for (int x=0; x<lista.length;x++){
            resB=lista[x].precioFinal();            
            if (lista[x] instanceof Lavadora){
                pLav+=resB;               
            }else if (lista[x] instanceof Television){
                pTel+=resB;       
               
            }else{
                pElec+=resB;
                
                
            }           
        }
        double total=pElec+pLav+pTel;
        System.out.println("------------------------------------------");
        System.out.println("Total de electrodomesticos: "+pElec);
        System.out.println("Total de lavadoras: "+pLav);
        System.out.println("Total de televisores: "+pTel);
        System.out.println("Total: "+total);
        
    }
    public static void mostrarInfo(Electrodomestico[] lista){
        System.out.println("Listado de electrodomésticos");
        System.out.println("------------------------------------------");
        for (int x=0; x<lista.length;x++){
            if (lista[x] instanceof Lavadora){
                System.out.println("Lavadora");
            }else if (lista[x] instanceof Television){
                System.out.println("Televisión");
            }else{
                System.out.println("Electrodomestico");
            }
            lista[x].informacionGeneral();
            System.out.println("------------------------------------------");
        }
    }
    
}
