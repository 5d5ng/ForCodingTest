package lv2;
import java.util.*;
public class �踷��� {

	public static void main(String[] args) {
	
		�踷��� app = new �踷���();
		String s = "()(((()())(())()))(())";
		app.solution(s);
		
	}
    public int solution(String arrangement) {
        int answer = 0;
        String temp = arrangement.replace("()", "0");
        Stack s = new Stack<Character>();
        for(int i=0;i<temp.length();i++) {	
        	char t = temp.charAt(i);
        	if(t=='(') {
        		s.push(t);
        	}
        	else if(t=='0') {
        		answer+=s.size();
        	}
        	else if(t==')') {
        		
        		answer++;
        		s.pop();
        	}
        	
        	
        }
        System.out.println(answer);
        
        return answer;
    }
}
