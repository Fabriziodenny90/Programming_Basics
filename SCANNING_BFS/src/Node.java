import java.util.ArrayList;


public class Node {
	
	public Node(int i, int j) {
		key=i;
		value=j;
	}
	int key;
	int value;
	ArrayList<Node> neigh = new ArrayList<Node>();

}
