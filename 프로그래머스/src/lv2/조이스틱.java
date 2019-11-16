package lv2;

public class ¡∂¿ÃΩ∫∆Ω {

	public static void main(String[] args) {
		
		¡∂¿ÃΩ∫∆Ω app = new ¡∂¿ÃΩ∫∆Ω();
		app.solution("JAN");
	}
	public int solution(String name) {
		int answer = 0;
		for(int i=0;i<name.length();i++) {
			int shortest = 0;
			shortest = - ('A' - name.charAt(i) );
			if(shortest > name.charAt(i) - 'A' ) {
				shortest = name.charAt(i) - 'A';
			}
		
			answer+=shortest;
			
		}
		System.out.println(answer);
		return answer ;
	}

}
