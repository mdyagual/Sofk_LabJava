/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelaneos.ejercicio17;


public class Television extends Electrodomestico {
    //Constantes
    private final int RES_DEF=20;
    private final boolean TDT_DEF=false;
    //Atributos
    private int resolucion;
    private boolean tdt;
    
   public Television(double precioBase, double pesoKg){
        super(precioBase,pesoKg);
        this.resolucion=RES_DEF;
        this.tdt=TDT_DEF;
    }
   
    
    public Television(double precioBase,String color,char conEner,double pesoKg,int resolucion,boolean tdt) {
        super(precioBase, color, conEner, pesoKg);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }
    @Override
    public double precioFinal(){
        double adicional=super.precioFinal();
        if(resolucion>40){
            adicional+=(adicional*0.3);
        }else if(tdt){
            adicional+=50;
        }
        return adicional;
    }

   @Override
    public void informacionGeneral() {
        super.informacionGeneral();
        System.out.println(String.format("Resolución: %d",resolucion));
        System.out.println(String.format("TDT: %b", tdt));
    }
   
   
    
}
