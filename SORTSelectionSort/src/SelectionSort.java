
public class SelectionSort {
	
	public static void sort(int[] arr){
		int min;
		for(int i = 0; i<arr.length-1; i++){
			min = i;
			for(int j = i+1; j<arr.length; j++){
				if(arr[j]<arr[min]) min = j;
			}
			//swap
			if(min!=i){
				int tmp = arr[min];
				arr[min] = arr[i];
				arr[i] = tmp;
			}
		}
	}
}
