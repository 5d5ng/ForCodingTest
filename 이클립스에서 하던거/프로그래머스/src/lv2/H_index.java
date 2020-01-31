package lv2;

import java.util.Arrays;

public class H_index {

	public static void main(String[] args) {
		H_index app = new H_index();
		int [] arr = {3,0,6,1,5};
		app.solution(arr);

	}

	public int solution(int[] citations) {
		Arrays.parallelSort(citations);
		int h = citations[0];
		int n = citations.length;
		for(int i=0;i<n;i++) {
			
		}
		
		return h;
	}
}
