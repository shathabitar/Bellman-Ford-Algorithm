package Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class GraphBellmanFord {

	private ArrayList<Edge> edges;
    private int numVertices;
    private GraphNode[] nodes;

    public GraphBellmanFord(int numVertices) {
        this.numVertices = numVertices;
        this.nodes = new GraphNode[numVertices];
        this.edges = new ArrayList<Edge>();

    }

    public void addNode(int index, GraphNode node) {
        nodes[index] = node;
    }

    public void addEdge(int source, int destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        edges.add(edge);
    }

    public void bellmanFord(int start) {
        int[] distances = new int[numVertices];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[start] = 0;

        boolean updated;
        for (int i = 0; i < numVertices - 1; i++) {
            updated = false;
            for (Edge edge : edges) {
                int u = edge.getSource();
                int v = edge.getDestination();
                int weight = edge.getWeight();
                if (distances[u] != Integer.MAX_VALUE && distances[u] + weight < distances[v]) {
                    distances[v] = distances[u] + weight;
                    updated = true;
                }
            }
            if (!updated) {
                break;
            }
        }

        for (int u = 0; u < numVertices; u++) {
        	for (Edge edge : edges) {
                int u1 = edge.getSource();
                int v = edge.getDestination();
                int weight = edge.getWeight();
                if (distances[u1] != Integer.MAX_VALUE && distances[u1] + weight < distances[v]) {
                    System.out.println("Negative weight cycle detected");
                    return;
                }
            }
        }

        printBellmanFordResults(distances);
    }
    
    public void printBellmanFordResults(int[] distances) {
    	System.out.println("Vertex: Distance");
        for (int i = 0; i < numVertices; i++) {
            System.out.print(nodes[i].getName() + ": ");
            if (distances[i] == Integer.MAX_VALUE) {
                System.out.println("∞");
            }
            else {
            	System.out.println(distances[i]);
			}
        }
	}
    
}
