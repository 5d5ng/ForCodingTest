package lv2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class �ٸ���������Ʈ�� {

	public static void main(String[] args) {
		�ٸ���������Ʈ�� app = new �ٸ���������Ʈ��();
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
			
			for(T truck : onB) { //�ٸ��� Ʈ���� �˻�
				sum+= truck.w;
				truck.pos++;
				
				if(truck.pos>bridge_length) { //�ٸ��� �����ٸ�
					doneTruck = truck;
				}
			}
			
			if(doneTruck != null) { //�ٸ��� ���� Ʈ���� �����Ѵٸ�
				onB.remove(doneTruck);
				sum -= doneTruck.w;
				
			}
			
			if(!before.isEmpty() && (onB.size() < bridge_length) ){
				T truck = before.peek();
				
				if(truck.w + sum <= weight) { // �ٸ����� Ʈ���� �÷����Ǵ��� Ȯ��
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
