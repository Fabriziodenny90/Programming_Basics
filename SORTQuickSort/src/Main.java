
public class Main {

	public static void main(String[] args) {
		boolean iterative = true;

		int[] array = {1, 12, 5, 26, 7, 14, 3, 7, 2};
		if(!iterative){
			QuickSort.sort(array);
			System.out.print("Recursive -> ");
		} else {
			System.out.print("Iterative -> ");
			QuickSortIterative.sort(array);
		}
		for(int i = 0 ; i < 9; i++){
			System.out.print(array[i] + " ");
		}
	}

}
