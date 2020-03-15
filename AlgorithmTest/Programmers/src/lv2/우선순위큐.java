package lv2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class 우선순위큐 {

    public static void main(String[] args) {
        우선순위큐 app = new 우선순위큐();
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
        public int compareTo(paper p) { // 우선순위가 큰 것이 먼저 나오도록
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
