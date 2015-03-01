import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

	public static void sort(int[] array, int intervals){

		int min = array[0];
		int max = array[0];

		for(int i = 1; i < array.length; i++){
			if(array[i]>max){
				max = array[i];
			}
			if(array[i]<min){
				min = array[i];
			}
		}

		double range = (double)(max-min+1)/(double)intervals;

		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] buckets = new ArrayList[intervals];

		for(int i = 0; i < buckets.length; i++){
			buckets[i] = new ArrayList<Integer>();
		}

		for(int i = 0; i < array.length; i++){
			int pos = (int) ((array[i]-min)/range);
			buckets[pos].add(array[i]);
		}

		int fin = 0;
		for(int i = 0; i < buckets.length; i++){
			Collections.sort(buckets[i]);
			for(int j = 0; j < buckets[i].size(); j++){
				array[fin++] = buckets[i].get(j);
			}
		}
	}
}

