/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelaneos.ejercicio18;

/*Recordar:
1. No se declaran atributos
2. Los metodos no tiene cuerpo
3. Debe ser public
4. Puede ser implementada por n-clases
5. No encapsula datos
6. Las clases que implementen Entregable deben usar todos los métodos declarados/sobreescribirlos en sus clases
*/
public interface Entregable {
   
   public void entregar();
   public void devolver();
   public boolean isEntregado();
   
   public int compareTo(Object o);
   
}
