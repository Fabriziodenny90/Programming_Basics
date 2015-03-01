import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;


public class MyTree {

	ArrayList<Node> nodes = new ArrayList<Node>();
	int res;

	public int DFS(int key){
		HashMap<Integer,Boolean> visited = new HashMap<Integer,Boolean>();
		
		//prepare flags for the visited nodes
		for(Node h : nodes){
			visited.put(h.key, false);
		}
		
		//use this in case of unconnected graphs
		for(int j = 0; j < nodes.size(); j++){
			res = -1;
			if(visited.get(nodes.get(j).key)==false)
				DFSHelper(nodes.get(0), key, visited); //update res if found in this connected component of teh graph
			if (res != -1) return res;
		}

		return -1;
	}

	private void DFSHelper(Node node, int key, HashMap<Integer,Boolean> visited) {
		
		Stack<Node> stack = new Stack<Node>(); //allocating the explicit stack to avoid recursion
		stack.push(node); //first node
		
		while(!stack.isEmpty()){
			
			Node n = stack.pop();
			
			visited.put(n.key, true); //you visited the node now
			
			//check if the key is what we want
			if(n.key==key) {
				res = n.value;
				return;
			}
			
			//add NON VISITED neighbors to the stack and continue the while
			for(int i = 0; i < n.neigh.size(); i ++){
				if(visited.get(n.neigh.get(i).key)==false){
					stack.push(n.neigh.get(i));
				}
			}
		}
	}
}
