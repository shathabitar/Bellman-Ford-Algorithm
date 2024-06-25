package Graph;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class GraphNode {

	private String name;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");;
    private Date due_date;
    private String priority;
    private String category;
    private ArrayList<GraphNode> shortestPath;
    private int distance;
    
    public GraphNode(String name, String due_date, String priority, String category) {
        this.name = name;
        this.priority = priority;
        this.category = category;
        this.shortestPath = new ArrayList<GraphNode>();
        this.distance = Integer.MAX_VALUE;
        
        try {
	        this.due_date = (Date) dateFormat.parse(due_date);
	    } catch (ParseException e) {
	        System.out.println("Failed to parse due date: " + e.getMessage());
	        e.printStackTrace();
	    }
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDue_date() {
		return due_date;
	}

	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public ArrayList<GraphNode> getShortestPath() {
		return shortestPath;
	}

	public void setShortestPath(ArrayList<GraphNode> shortestPath) {
		this.shortestPath = shortestPath;
	}

	@Override
	public String toString() {
		return "GraphNode [name=" + name + ", shortestPath=" + shortestPath + ", distance=" + distance + "]";
	}

    
	
}
	
