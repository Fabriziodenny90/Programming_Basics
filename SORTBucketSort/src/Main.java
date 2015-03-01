
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 120, 5, 26, 7, 14, 3, 7, 2};
		BucketSort.sort(array,4);
		for(int i = 0 ; i < 9; i++){
			System.out.print(array[i] + " ");
		}
	}

}
