package lv2;

public class ž {

	public static void main(String[] args) {
		ž app = new ž();
		int [] heights= {1,5,3,6,7,6,5};
		int [] res=new int[heights.length];
		res=app.solution(heights);
		for(int i=0;i<heights.length;i++)
			System.out.println(res[i]);
	}
	public int[] solution(int[] heights) {
		int[] answer = new int[heights.length];
		int cnt = heights.length-1;
		for(int i=heights.length-1;i>=0;i--){
			for(int j=i-1;j>=0;j--){
				if(heights[j]>heights[i]){
					answer[cnt] = j+1;
					break;
				}
			}
			cnt--;
		}
		return answer;
	}
}
