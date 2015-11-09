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
* Con esta clase se puededeteriminar hacia qu� lugar
* se quiere dirigir la persona. Es uno de los v�rtices
* del grafo
*
**/
public class Vertex {
	
    private String nombre;
   
    /**
    * Este es el constructor de objetos de la clase
    * Vertex. Aqu� se crea el v�rtice.
    *
    **/
    public Vertex(String nombre){
        this.nombre=nombre;
    }
    
    /**
    * Get para obtener el nombre del v�rtice
    * (obtener nombre de una ciudad)
    **/
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Set para darle un nombre al v�rtice
     * (un nombre a una ciudad)
     *
     **/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
}