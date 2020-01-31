package lv2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {

	public static void main(String[] args) {
		다리를지나는트럭 app = new 다리를지나는트럭();
		int [] so = {10};

		app.solution(100, 100,so );
	}
	class T{
		int pos;
		int w;
		T (int pos,int w){
			this.pos = pos;
			this.w = w;
		}
	}
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		Queue<T> before = new LinkedList<T>();
		Queue<T> onB = new LinkedList<T>();
		for(int i: truck_weights) {
			T truck = new T(0,i);
			before.add(truck);

		}
		while(!before.isEmpty() || !onB.isEmpty()) {
			
			
			T doneTruck = null;
			int sum = 0;
			
			for(T truck : onB) { //다리위 트럭을 검사
				sum+= truck.w;
				truck.pos++;
				
				if(truck.pos>bridge_length) { //다리를 지났다면
					doneTruck = truck;
				}
			}
			
			if(doneTruck != null) { //다리를 지난 트럭이 존재한다면
				onB.remove(doneTruck);
				sum -= doneTruck.w;
				
			}
			
			if(!before.isEmpty() && (onB.size() < bridge_length) ){
				T truck = before.peek();
				
				if(truck.w + sum <= weight) { // 다리위에 트럭을 올려도되는지 확인
					before.remove();
					onB.add(truck);
					truck.pos++;
				}
				
				
			}
			
			answer++;

		}
		System.out.println(answer);
		return answer;
	}



}
