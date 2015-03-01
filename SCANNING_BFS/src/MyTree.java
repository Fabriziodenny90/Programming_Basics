import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class MyTree {
	
	ArrayList<Node> nodes = new ArrayList<Node>();
	
	public int BFS(int key) throws InterruptedException{
		HashMap<Integer,Boolean> visited = new HashMap<Integer,Boolean>();
		
		BlockingQueue<Node> queue = new LinkedBlockingQueue<Node>();
		int res = -1;
		for(Node h : nodes){
			visited.put(h.key, false);
		}
		
		for(int i = 0; i < nodes.size() && visited.get(nodes.get(i).key)==false; i++){
			queue.offer(nodes.get(i));
			res = BFSHelper(key, queue, visited);
			if(res!=-1) return res;
		}
		
		return res;
		
	}

	private int BFSHelper(int key, BlockingQueue<Node> queue, HashMap<Integer,Boolean> visited) throws InterruptedException {
		
		while(!queue.isEmpty()){
			Node n = queue.take();
			if(visited.get(n.key)==false){
				visited.put(n.key,true);
				if(n.key==key) return n.value;
				for(int j=0; j<n.neigh.size(); j++){
					if(visited.get(n.neigh.get(j).key)==false)
						queue.offer(n.neigh.get(j));
				}
			}
		}
		return -1;
		
	}

}
