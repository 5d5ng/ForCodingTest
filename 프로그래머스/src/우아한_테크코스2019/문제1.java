package 우아한_테크코스2019;
import java.util.*;
public class 문제1 {

	public static void main(String[] args) {
		int [] res = {0,0};
		int [][]riders = {{-700,0},{150,180},{500,500},{150,-800},{800,800},{-900,500},{-1100,900}};
		int k= 1000;
		문제1 app  = new 문제1();
		int answs= app.solution(res, riders, k);
		System.out.println(answs);
	}
	   public int solution(int[] restaurant, int[][] riders, int k) {
	        int answer = 0;
	        for(int i=0;i<riders.length;i++) {
	        	if(getDis(restaurant[0],restaurant[1],riders[i][0],riders[i][1])<=k) {
	        		answer++;
	        	}
	        }
	        return answer;
	    }
	double getDis(int a,int b,int c,int d) {
		return Math.sqrt(Math.pow(c-a, 2)+Math.pow(d-b, 2));
	}

}
