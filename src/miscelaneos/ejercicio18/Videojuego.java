/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelaneos.ejercicio18;

public class Videojuego implements Entregable {
    //Default
    private final int HORAS_EST=10;
    private final boolean ENTREGADO=false;
    //Atributos
    private String titulo;
    private int horasEst;
    private boolean entregado;
    private String genero;
    private String compania;

    public Videojuego() {
        this.titulo="";
        this.horasEst=HORAS_EST;
        this.entregado=ENTREGADO;
        this.genero="";
        this.compania="";
    }

    public Videojuego(String titulo, int horasEst) {
        this.titulo = titulo;
        this.horasEst = horasEst;
        this.genero="";
        this.compania="";
    }

    public Videojuego(String titulo, int horasEst, String genero, String compania) {
        this.titulo = titulo;
        this.horasEst = horasEst;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getHorasEst() {
        return horasEst;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEst(int horasEst) {
        this.horasEst = horasEst;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
    
    @Override
    public String toString(){
        return "Informacion del videojuego: \n" +
                "\tTitulo: "+titulo+"\n" +
                "\tHoras estimadas: "+horasEst+"\n" +
                "\tGenero: "+genero+"\n" +
                "\tCompañia: "+compania;
    }
    
    @Override
    public int compareTo(Object o){
        //Haciendo el downcasting
        Videojuego v=(Videojuego)o;
        if(horasEst>v.getHorasEst()){
            return 1;
        }else if(horasEst<v.getHorasEst()){
            return -1;
        }else{
            return 0;
        }
    }
    
    @Override
    public void entregar(){
        entregado=true;
    }
    
    @Override
    public void devolver(){
        entregado=false;
    }
    
    @Override
    public boolean isEntregado(){
        if(entregado){
            return true;
        }else{
            return false;
        }
    }
    
}
