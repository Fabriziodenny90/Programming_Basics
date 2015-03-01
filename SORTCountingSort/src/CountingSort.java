
public class CountingSort {
	
	
	public static void sort(int[] arr){
		
		int[] aux;
		int[] res;
		
		//aux has to be K long (k biggest value in arr)
		aux = new int[30];
		res = new int[arr.length];
		
		for(int i = 0; i<arr.length; i++){
			aux[arr[i]]++;
		}
		
		for(int i = 1; i<aux.length; i++){
			aux[i] += aux[i-1];
		}
		
		for(int i = arr.length-1; i>=0; i--){
			int v = arr[i];
			res[--aux[v]] = v;
		}
		
		for(int i = 0; i<arr.length; i++){
			arr[i]=res[i];
		}
		
		
	}
}
