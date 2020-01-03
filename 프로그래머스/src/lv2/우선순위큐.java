package lv2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class �켱����ť {

	public static void main(String[] args) {
		�켱����ť app = new �켱����ť();
		int [] test  = {1,2,3,2,1};
		app.solution(test, 1);
	}
	public int solution(int[] priorities, int location) {
		int answer = 0;
		PriorityQueue<paper> Q = new PriorityQueue<paper>();
		
		for(int i=0;i<priorities.length;i++) {
			paper p = new paper(false,priorities[i]);
			
			if(i==location) p.mine = true;
			
			Q.offer(p);
		}
		while(!Q.isEmpty()) {
			answer++;
			if(Q.poll().mine) {
				break;
			}
		}
		System.out.println(answer);
		return answer;
	}
	class paper implements Comparable<paper>{
		boolean mine;
		int priority;
		paper(boolean mine,int priority){
			this.mine = false;
			this.priority = priority;
		}		
		@Override
		public int compareTo(paper p) { // �켱������ ū ���� ���� ��������
			if(this.priority < p.priority) {
				return 1;
			}
			else if(this.priority > p.priority) {
				return -1;
			}
			return 0;
		}
	}

}
