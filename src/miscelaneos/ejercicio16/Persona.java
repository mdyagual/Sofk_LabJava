package miscelaneos.ejercicio16;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Persona {
    //Constantes
    private final char SEX_DEF='H';
    public final static int PESO_BAJO=-1;
    public final static int PESO_IDEAL=0;
    public final static int PESO_ALTO=1;

    //Atributos
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    //Constructores: Aplicando sobrecarga
    public Persona(){
        this.nombre="";
        this.edad=0;
        this.dni=generarDNI();
        this.sexo=SEX_DEF;
        this.peso=0.0;
        this.altura=0.0;
    }

    public Persona(String nombre, int edad, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.dni=generarDNI();
        this.sexo=sexo;
        revisarSexo(sexo);
        this.peso=0.0;
        this.altura=0.0;

    }

    public Persona(String nombre, int edad,  char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.sexo = sexo;
        revisarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        double imc = peso/(Math.pow(altura,2));
        if(peso == 0){
            return PESO_BAJO;
        }else{
            if(imc<20){
                return PESO_BAJO;
            }else if(imc<=25 && imc>=20){
                return PESO_IDEAL;
            }
            return PESO_ALTO;
        }


    }

    public void revisarSexo(char sexo){
        if(sexo!='H' && sexo!='M'){
            this.sexo=SEX_DEF;
        }
    }

    public String generarDNI(){
        int secNums=generarSecuenciaNums();
        char letra=generaLetraDNI((int) Math.floor(Math.random()*26));

        return Integer.toString(secNums)+letra;

    }

    public int  generarSecuenciaNums(){
        return ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));

    }

    private char generaLetraDNI(int res) {
        char [] letras = {'A','B','C','D','E','F','G','H','I',
                          'J','K','L','M','N','O','P','Q','R',
                          'S','T','U','V','W','X','Y','Z'};

        return letras[res];
    }

    public boolean isMayorDeEdad(){
        return edad>=18;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Informacion: \n" +
                "\tNombre: "+nombre+"\n" +
                "\tDNI: "+dni+"\n" +
                "\tEdad: "+edad+"\n" +
                "\tSexo: "+sexo+"\n" +
                "\tPeso: "+peso+"\n" +
                "\tAltura: "+altura;

    }
}
