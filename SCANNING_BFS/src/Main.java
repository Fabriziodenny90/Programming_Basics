
public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyTree tree = new MyTree();
		Node n = new Node(1,2);
		tree.nodes.add(n);
		Node t = new Node(2,4);
		tree.nodes.add(t);
		Node b = new Node(4,8);
		tree.nodes.add(b);
		Node l = new Node(16,32);
		tree.nodes.add(l);
		
		tree.nodes.get(0).neigh.add(t);
		tree.nodes.get(0).neigh.add(b);
		tree.nodes.get(1).neigh.add(l);
		
		System.out.println("Node : " + tree.BFS(4));
	}

}
