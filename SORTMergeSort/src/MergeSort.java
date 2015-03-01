
public class MergeSort {

	public static void sort(int[] array) {
		sortHelper(array,0,array.length-1);
	}

	private static void sortHelper(int[] array, int start, int end){

		if(start>=end) return;		

		int middle = (start+end)/2;
		sortHelper(array,start,middle);
		sortHelper(array,middle+1,end);
		merge(array,start,end);
	}

	private static void merge(int[] array, int start, int end){
		
		int[] tmp = new int[array.length];
		int middle = (start+end)/2;
		int i = start;
		int j = middle+1;
		int t = start;
		while(i<=middle && j<=end) {
			if(array[i]<array[j]){
				tmp[t++]=array[i++];
			} else {
				tmp[t++]=array[j++];
			}
		}
		while(i<=middle){
			tmp[t++]=array[i++];
		}
		while(j<=end){
			tmp[t++]=array[j++];
		}
		
		//copy tmp back
		for(int i1 = start; i1<=end; i1++){
			array[i1] = tmp[i1];
		}
	}

}


