import java.util.Stack;


public class QuickSortIterative {

	public static void sort(int[] array) {
		
		helper(array,0,array.length-1);
		
	}

	private static void helper(int[] array, int start, int end){
		
		if(start>=end) return;		
		
		Stack<Integer> stackL = new Stack<Integer>();
		Stack<Integer> stackR = new Stack<Integer>();
		stackL.push(start);
		stackR.push(end);
		while(true){
			
			if(stackR.isEmpty() && stackR.isEmpty()) break;
			
			int l = stackL.pop();
			int r = stackR.pop();
			
			if(l>=r) continue;
			
			int pivot = scan(array,l,r);

			stackL.push(pivot);
			stackR.push(r);
			stackL.push(l);
			stackR.push(pivot-1);

			
			//helper(array,start,pivot-1);
			//helper(array,pivot+1,end);
		}
	}

	private static int scan(int[] array, int start, int end){
		int i = start;
		int j = end;
		int p = array[(start+end)/2];
//		System.out.print("Beginning scan --- Array now :");
//		for(int g = 0 ; g < 9; g++){
//			System.out.print(array[g] + " ");
//		}
//		System.out.println();
		while(i<j){
			while(array[i]<p) i++;
			while(array[j]>p) j--;
			if(i<j){
				exchange(array,i,j);
			}
			i++;
			j--;
		}
//		System.out.print("Pivot was " + p + " --- Array now :");
//		for(int g = 0 ; g < 9; g++){
//			System.out.print(array[g] + " ");
//		}
//		System.out.println("Return " + i);
		return i;
	}

	private static void exchange(int[] array, int a, int b){
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}

}


