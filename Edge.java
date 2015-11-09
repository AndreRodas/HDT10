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
* Esta clase represetna una arista de un grafo.
* Con esta clase se puededeteriminar en qué lugar
* está una persona, hacia donde se dirigie y la
* distancia que habrá entre nodos (distancia en
* km de una ciudad a otra)
*
**/
public class Edge {
    
    private Vertex origen;		// de donde parte
    private Vertex destino;		// hacia donde va
    private double distancia;
    
    /**
    * Este es el constructor de objetos
    * se crea la arista
    *
    **/
    public Edge(Vertex origen, Vertex destino, double distancia){
        this.origen=origen;
        this.destino=destino;
        this.distancia=distancia;
    }
    
    
    /**
    * Setters y Getters de origen, destino y distancia
    * Permiten establecer y/u obtner un origne, destino 
    * o distiancia en el grafo
    *
    **/
	public void setOrigen(Vertex origen) {
        this.origen = origen;
    }
	
	  public Vertex getOrigen() {
        return origen;
    }

	
	 public void setDestino(Vertex destino) {
        this.destino = destino;
    }
    
    public Vertex getDestino() {
        return destino;
    }
	
	  public boolean equals(Edge ar){
        if((origen.getNombre().equals(ar.getOrigen().getNombre()))&&(destino.getNombre().equals(ar.getDestino().getNombre()))){
            return true;
        }
        return false;
    }
	
    public void setdistancia(float distancia) {
        this.distancia = distancia;
    }
	
	  public double getdistancia() {
        return distancia;
    }
   
}