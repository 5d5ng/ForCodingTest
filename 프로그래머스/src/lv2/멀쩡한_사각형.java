package lv2;

public class ������_�簢�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		������_�簢�� app = new ������_�簢��();
		app.solution(1, 3);
	}

	public long solution(int w,int h) {
		long answer = 1;
		if(w>h) {
			int temp = h;
			h = w;
			w = temp;
		}
		else if(w==h) {
			return w*h - w;
		}
		double a = (double)w/(double)h;
		System.out.println(a);
		long cnt = 0 ;
		if(h%w==0) {
			cnt=h/w;
		}
		else {
			while(a+1>cnt) {
				cnt++;
			}
		}

		answer = w*h - cnt*w;
		System.out.println(answer);
		return answer;
	}
}
