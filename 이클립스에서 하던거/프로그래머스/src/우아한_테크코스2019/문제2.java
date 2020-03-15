package 우아한_테크코스2019;
import java.util.*;
public class 문제2 {

	public static void main(String[] args) {
		int [] res = {0,0};
		int [][]riders = {{-700,0},{150,180},{500,500},{150,-800},{800,800},{-900,500},{-1100,900}};
		int k= 1000;
		문제2 app  = new 문제2();
	}
	   public int[] solution(String logs) {
	        int[] answer = new int[24];
	        int flag = 9;
	        String[] target = logs.split("\\n");
	        for(int i=0;i<target.length;i++) {
	    
	        	target[i]=target[i].substring(11, 13);
	        	int tmp = (Integer.parseInt(target[i])+flag)%24;
	        	answer[tmp]++;
	        	System.out.println(tmp);
	        }
	        
	        
	        return answer;
	    }
	   

}
