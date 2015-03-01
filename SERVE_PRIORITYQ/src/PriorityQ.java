public class PriorityQ<T> {

	class Node<W> {
		int p1;
		W elem1;
		
		public Node(W elem, int p){
			this.elem1 = elem;
			this.p1 = p;
		}
	}

	//peekMax()
	//takeMax()
	//addElement<T>(T elem, int priority);
	//changePriority(T elem, int newpriority);

	Node<T> heap[];
	int nelem;
	int maxsize;

	@SuppressWarnings("unchecked")
	public PriorityQ(int size){
		maxsize = size;
		heap = new Node[size];
		nelem = 0;
	}

	public T peekMax(){
		if(heap[0]!=null){
			return heap[0].elem1;
		} 
		return null;
	}

	public T takeMax() throws Exception{
		if(nelem==1) {
			nelem = 0;
			return heap[0].elem1;
		}
		
		if(nelem>0){
			Node<T> tmp = heap[0];
			heap[0] = heap[nelem-1];
			heap[nelem-1] = tmp;
			nelem--;
			heapify(0);
			return heap[nelem].elem1;
		} 
		throw new Exception("Empty queue");
	}

	public boolean addElement (T elem, int p) throws Exception{
		if(nelem==maxsize){
			throw new Exception("Full queue");
		}
		
		nelem++;
		heap[nelem-1] = new Node<T>(elem,p);

		int current = nelem -1;
		int parenti = (current-1)/2;
		while(parenti >= 0 && heap[parenti].p1<p){
			//swap
			Node<T> n = heap[parenti];
			heap[parenti] = heap[current];
			heap[current] = n;
			current=parenti;
			parenti = (current-1)/2;
		}
		return true;
	}

	private void heapify(int index){
		int left = index*2+1;
		int right = index*2 +2;
		int maxi = index;
		if(left<nelem && heap[left].p1>heap[index].p1){
			maxi = left;
		}
		if(right<nelem && heap[right].p1>heap[maxi].p1){
			maxi = right;
		}
		if(maxi!=index){
			Node<T> tmp = heap[index];
			heap[index] = heap[maxi];
			heap[maxi] = tmp;
			heapify(maxi);
		}
	}
	
	public void changePriority(T elem, int newpriority){
		int n = findNode(elem);
		if(n!=-1){
			heap[n].p1 = newpriority;
			int current = n;
			int parenti = (current-1)/2;
			while(parenti >= 0 && heap[parenti].p1<newpriority){
				//swap
				Node<T> n1 = heap[parenti];
				heap[parenti] = heap[current];
				heap[current] = n1;
				current=parenti;
				parenti = (current-1)/2;
			}
			heapify(current);
		}
		return;
	}
	
	private int findNode(T elem){
		
		for(int i = 0; i < nelem; i++){
			if(heap[i].elem1==elem){
				return i;
			}
		}
		return -1;
		
	}

}


