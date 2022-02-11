/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelaneos.ejercicio18;

public class Serie implements Entregable {
    //Default values
    private final int NUM_TEMP=3;
    private final boolean ENTREGADO=false;
    
    //Atributos
    private String titulo;
    private int numeroDeTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;
    
    //Sobrecarga de constructores
    public Serie(){
        this.titulo="";
        this.numeroDeTemporadas=NUM_TEMP;
        this.entregado=ENTREGADO;
        this.genero="";
        this.creador="";        
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numeroDeTemporadas=NUM_TEMP;
        this.entregado=ENTREGADO;
        this.genero="";
    }

    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
    }    
   

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }
   

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
         return "Informacion de la Serie: \n" +
                "\tTitulo: "+titulo+"\n" +
                "\tNumero de temporadas: "+numeroDeTemporadas+"\n" +
                "\tGenero: "+genero+"\n" +
                "\tCreador: "+creador;
    }
    
    @Override
    public int compareTo(Object o){
        //Haciendo el downcasting
        Serie s=(Serie)o;
        if(numeroDeTemporadas>s.getNumeroDeTemporadas()){
            return 1;
        }else if(numeroDeTemporadas<s.getNumeroDeTemporadas()){
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
