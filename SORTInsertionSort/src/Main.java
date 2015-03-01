
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,4,1,6,9,5,7,2,10,-1};
		InsertionSort.sort(array);
		for(int i = 0 ; i < 10; i++){
			System.out.print(array[i] + " ");
		}
	}

}
