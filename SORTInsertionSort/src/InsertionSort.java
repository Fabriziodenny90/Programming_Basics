
public class InsertionSort {
	
	public static void sort(int[] arr){
		for(int i = 1; i<arr.length; i++){
			int t = i;
			while(t>=1 && arr[t-1]>arr[t]){
				//swap
				int tmp = arr[t-1];
				arr[t-1]=arr[t];
				arr[t]=tmp;
				t--;
			}
		}
	}

}
