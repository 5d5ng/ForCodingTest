package 우아한_테크코스2019;
import java.util.*;
public class 문제3 {

	public static void main(String[] args) {
		
		문제3 app = new 문제3();
		int[] prices={10000,20000,14000,23000};
		int[] discount = {20,5,30};

		System.out.println(app.solution(prices,discount));
		
	}

	 public int solution(int[] prices, int[] discounts) {
	        int answer = 0;
	        Arrays.sort(prices);
	        Arrays.sort(discounts);
	        int flag=0;
	        if(prices.length>discounts.length) {
	        	flag = prices.length -discounts.length;
	        }
	        int cnt = 0;
	       for(int i=flag;i<prices.length;i++) {
	    	   discounts[cnt]=100-discounts[cnt];
	    	   prices[i]*=discounts[cnt];
	    	   prices[i]/=100;
	    	   cnt++;
	       }
	       
	       for(int i=0;i<prices.length;i++)
	    	   answer+=prices[i];
	       
	        return answer;
	    }

}
