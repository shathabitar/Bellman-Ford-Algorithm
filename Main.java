package Graph;

public class Main {

	public static void main(String[] args) {

		//GraphDijkstra graph = new GraphDijkstra(8);
		GraphBellmanFord graph = new GraphBellmanFord(8);
	        graph.addNode(0, new GraphNode("Assignment 1", "01-06-2024", "urgent", "University"));
	        graph.addNode(1, new GraphNode("Clean", "02-06-2024", "normal", "Personal"));
	        graph.addNode(2, new GraphNode("Project 1", "03-06-2024", "normal", "Work"));
	        graph.addNode(3, new GraphNode("Cook", "04-06-2024", "normal", "Personal"));
	        graph.addNode(4, new GraphNode("Project 2", "05-06-2024", "urgent", "Work"));
	        graph.addNode(5, new GraphNode("Run", "09-06-2024", "normal", "Health"));
	        graph.addNode(6, new GraphNode("Assignment 2", "10-06-2024", "urgent", "University"));
	        graph.addNode(7, new GraphNode("Course 1", "15-06-2024", "urgent", "Personal"));

	        graph.addEdge(0, 1, 4);
	        graph.addEdge(0, 3, 9);
	        graph.addEdge(0, 2, 5);
	        graph.addEdge(1, 4, 5);
	        graph.addEdge(1, 3, 7);
	        graph.addEdge(1, 0, 8);
	        graph.addEdge(2, 1, 2);
	        graph.addEdge(2, 3, 7);
	        graph.addEdge(3, 4, 8);
	        graph.addEdge(3, 5, 3);
	        graph.addEdge(4, 0, 9);
	        graph.addEdge(4, 5, 2);
	        graph.addEdge(4, 3, 2);
	        graph.addEdge(4, 6, -1);
	        graph.addEdge(5, 3, 1);
	        graph.addEdge(5, 2, 6);
	        graph.addEdge(5, 6, 6);
	        graph.addEdge(5, 7, 3);
	        graph.addEdge(6, 7, 9);
	        graph.addEdge(7, 5, 8);
	        graph.addEdge(7, 1, 15);


	        graph.bellmanFord(0);
	        //graph.dijkstra(0);
	}

}
