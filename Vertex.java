/**
*Universidad del Valle de Guatemala
*Algoritmos y Estructura de Datos
*Seccion: 10
*Andre Rodas - carnet 14395
*Yosemite Melendez - carnet: 14413
*08/11/2015
*Hoja de Trabajo 10
**/

/**
* Con esta clase se puededeteriminar hacia qué lugar
* se quiere dirigir la persona. Es uno de los vértices
* del grafo
*
**/
public class Vertex {
	
    private String nombre;
   
    /**
    * Este es el constructor de objetos de la clase
    * Vertex. Aquí se crea el vértice.
    *
    **/
    public Vertex(String nombre){
        this.nombre=nombre;
    }
    
    /**
    * Get para obtener el nombre del vértice
    * (obtener nombre de una ciudad)
    **/
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Set para darle un nombre al vértice
     * (un nombre a una ciudad)
     *
     **/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
}
