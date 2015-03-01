import java.util.ArrayList;
import java.util.HashMap;


public class MyTree {

	ArrayList<Node> nodes = new ArrayList<Node>();
	
	int res;

	public int DFS(int key){
		HashMap<Integer,Boolean> visited = new HashMap<Integer,Boolean>();
		for(Node h : nodes){
			visited.put(h.key, false);
		}
		for(int j = 0; j < nodes.size(); j++){
			res = -1;
			
			if(visited.get(nodes.get(j).key)!= null && visited.get(nodes.get(j).key)==false)
				DFSHelper(nodes.get(0), key, visited);
			
			if (res != -1) return res;
		}
		return -1;


	}

	private void DFSHelper(Node node, int key, HashMap<Integer,Boolean> visited) {

		visited.put(node.key, true);
		if(node.key==key) {
			res = node.value;
			return;
		}


		for(int i = 0; i < node.neigh.size(); i ++){
			if(visited.get(nodes.get(i).key)!= null && visited.get(node.neigh.get(i).key)==false){
				DFSHelper(node.neigh.get(i),key,visited);
			}
		}
		return;
	}

}
