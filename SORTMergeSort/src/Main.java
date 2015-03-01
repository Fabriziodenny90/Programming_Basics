
public class Main {

	public static void main(String[] args) {
		int[] array = {1, 12, 5, 26, 7, 14, 3, 7, 2};
		MergeSort.sort(array);
		for(int i = 0 ; i < 9; i++){
			System.out.print(array[i] + " ");
		}
	}
}
