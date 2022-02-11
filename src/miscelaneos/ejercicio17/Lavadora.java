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
public class Lavadora extends Electrodomestico{
    //Constante
    private final double CARGA_DEF=5;

    //Atributos
    private double carga;
    
    public Lavadora(double precioBase, double pesoKg){
        super(precioBase,pesoKg);
        this.carga=CARGA_DEF;
    }
    public Lavadora(double precioBase,String color,char conEner,double pesoKg,double carga){
        super(precioBase,color,conEner,pesoKg);
        this.carga=carga;
    }
    public double getCarga(double carga){
        return carga;
    }

    //Sobreescribiendo porque se añade otra restricción exclusiva para Lavadora
    @Override
    public double precioFinal(){
        double adicional=super.precioFinal();
        if(carga>30){
            adicional+=50;
        }
        return adicional;
    }

   @Override
    public void informacionGeneral() {
        super.informacionGeneral();
        System.out.println(String.format("Carga: %.2f",carga));
    }
   
    
    
    
}
