
public class HeapSort {

	public static void sort(int[] array){

		// TODO handle border cases 
		if(array.length<2) return;
		buildHeap(array);

		for(int i = array.length-1; i>=1; i--){
			int tmp = array[0];
			array[0] = array[(i)];
			array[(i)] = tmp;
			heapify(array,0,i);
		}
	}

	//linear complexity
	private static void buildHeap(int[] array){
		int index = array.length/2;
		for(int i = index; i>=0; i--){
			heapify(array, i, array.length);
		}
	}

	//logarithmic complexity
	private static void heapify(int[] array, int index, int len){
		
		int left = 2*index+1;
		int right = 2*index + 2;
		int maxi = index;
		
		if(right<len && array[right]>array[index]){
			maxi=right;
		}
		if(left<len && array[left]>array[maxi]){
			maxi = left;
		}
		
		if(maxi!=index){
			int tmp = array[maxi];
			array[maxi] = array[index];
			array[index] = tmp;
			heapify(array, maxi, len);
		}
	}
}


