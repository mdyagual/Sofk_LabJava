package miscelaneos.ejercicio16;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Persona {
    //Constantes
    private final char SEX_DEF='H';

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
        this.peso=0.0;
        this.altura=0.0;
    }

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        double imc = this.peso/(Math.pow(this.altura,2));
        if(imc<20){
            return -1;
        }else if(imc<25 && imc>20){
            return 0;
        }
        return 1;

    }

    public void revisarSexo(char sexo){
        if(!(sexo=='H' || sexo=='M')){
            this.sexo=SEX_DEF;
        }
    }

    public String generarDNI(){
        String secNums = Arrays.stream(generarSecuenciaNums())
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(""));
        return this.sexo+secNums;
    }

    public int [] generarSecuenciaNums(){
        int [] sec = new int[8];
        Random r = new Random();
        for (int i=0; i<sec.length;i++){
            sec[i]=r.nextInt(10);
        }
        return sec;
    }
}
