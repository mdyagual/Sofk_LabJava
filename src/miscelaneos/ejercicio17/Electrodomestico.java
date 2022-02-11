package miscelaneos.ejercicio17;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Electrodomestico {
    
    //Constantes
    protected final String COLOR_DEF="blanco";
    protected final char CONENER_DEF='F';
    protected final double PREBASE_DEF=100;
    protected final double PESOKG_DEF=5;
    
    //Atributos de la clase
    protected double precioBase;
    protected String color;
    protected char conEner;
    protected double pesoKg;
    
    //Constructores: Aplicando sobrecarga
    public Electrodomestico(){
        this.precioBase=PREBASE_DEF;
        this.color=COLOR_DEF;
        this.conEner=CONENER_DEF;
        this.pesoKg=PESOKG_DEF;
    }
    
    public Electrodomestico(double precioBase,double pesoKg){
        this.precioBase=precioBase;
        this.pesoKg=pesoKg;
        this.color=COLOR_DEF;
        this.conEner=CONENER_DEF;
    }
    public Electrodomestico(double precioBase,String color,char conEner,double pesoKg){
        this.precioBase=precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(conEner);
        this.pesoKg=pesoKg;
    }
    
    //Getters
    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConEner() {
        return conEner;
    }

    public double getPesoKg() {
        return pesoKg;
    }
    
    
    private void comprobarColor(String color){
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
        for (String c:colores){
            if(c.equals(color)){
                this.color=color;
                encontrado=true;
            }
        }
        if (!(encontrado)){
            this.color=COLOR_DEF;
        }        
    }
    
    
    private void comprobarConsumoEnergetico(char letra){
        char letrasCons[]={'A','B','C','D','E','F'};
        boolean encontrado=false;
        for (char l:letrasCons){
            if(l==letra){
                this.conEner=letra;
                encontrado=true;            }
        }
        if (!(encontrado)){
            this.conEner=CONENER_DEF;
        }        
    
    }
    public double precioFinal(){
        double adicional=0.0;
        //Consumo de energía
        switch(conEner){
            case 'A':
                adicional+=100;
                break;
            case 'B':
                adicional+=80;
                break;
            case 'C':
                adicional+=60;
                break;
            case 'D':
                adicional+=50;
                break;
            case 'E':
                adicional+=30;
                break;
            default:
                adicional+=10;                       
                        
        }
        //Peso
        if(pesoKg>=0&&pesoKg<=19){
            adicional+=10;
        }else if(pesoKg>=20 && pesoKg<=49){
            adicional+=10;
        }else if(pesoKg>=50 && pesoKg<=79){
            adicional+=80;
        }else{
            adicional+=100;
        }
        return precioBase+adicional;
    }

   
    public void informacionGeneral() {
        System.out.printf("Precio base: %.2f\n", precioBase);
        System.out.printf("Color: %s\n", color);
        System.out.printf("Consumo de energía: %c\n", conEner);
        System.out.printf("Peso kg: %.2f\n", pesoKg);
        
    }

    
}
