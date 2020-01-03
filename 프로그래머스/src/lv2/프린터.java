package lv2;

import java.util.LinkedList;
import java.util.Queue;

public class 프린터 {

	public static void main(String[] args) {

		프린터 app  = new 프린터();
		int [] p = {1,4,3,78,2,1,1};
		int l=5;
		app.solution(p, l);
	}
	public int solution(int[] priorities, int location) {
		int answer = 0;
		Queue<paper> Q = new LinkedList<paper>();
		Queue<paper> tempQ = new LinkedList<paper>();
		for(int i=0;i<priorities.length;i++) {  
			paper p = new paper(false,priorities[i]);
			if(i==location) p.mine = true;
			Q.offer(p);
			tempQ.offer(p);
		}
		while(!Q.isEmpty()) {
			paper temp = Q.peek();
			int chk = 0;
			for(paper p : Q) {
				if(temp.priority < p.priority) {
					chk = 1;
					break;
				}
			}
			
			if(chk==0) {
				answer++;
				Q.poll();
				if(temp.mine) {		
					break;
				}
			}
			else {
				Q.poll();
				Q.offer(temp);
			}			
		}

		System.out.println(answer);
		return answer ;
	}
	class paper{
		boolean mine;
		int priority;
		paper(boolean mine,int priority){
			this.mine = false;
			this.priority = priority;
		}		
	}

}
