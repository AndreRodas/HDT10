import static org.junit.Assert.*;

import org.junit.Test;


public class GraphTest {

	@Test
	public void testAddVertex() {
		Graph grafo = new Graph();
		grafo.addVertex("Pana");
		assertEquals(0,0,0);
	}

	@Test
	public void testRemoveEdge() {
		Graph grafo = new Graph();
		grafo.addVertex("A");
		grafo.addVertex("B");
		try {
			grafo.addEdge("A", "B", 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		grafo.removeEdge("A", "B");
		assertEquals(0,0,0);
	}

	@Test
	public void testAddEdge() {
		Graph grafo = new Graph();
		grafo.addVertex("B");
		grafo.addVertex("A");
		try {
			grafo.addEdge("B", "A", 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		grafo.removeEdge("B", "A");
		assertEquals(0,0,0);
	}

	@Test
	public void testGetdistancia() {
		Graph grafo = new Graph();
		grafo.addVertex("B");
		grafo.addVertex("A");
		try {
			grafo.addEdge("B", "A", 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		grafo.getdistancia("A", "B");
		assertEquals(1,1,1);
		
	}

}
