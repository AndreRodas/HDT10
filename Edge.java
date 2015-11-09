public class Edge {
    
    private Vertex origen;
    private Vertex destino;
    private double peso;
    
    public Edge(Vertex origen, Vertex destino, double peso){
        this.origen=origen;
        this.destino=destino;
        this.peso=peso;
    }
    
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
	
    public void setPeso(float peso) {
        this.peso = peso;
    }
	
	  public double getPeso() {
        return peso;
    }
   
}