package lv2;

public class 조이스틱 {

    public static void main(String[] args) {

        조이스틱 app = new 조이스틱();
        app.solution("JCNAAAA");
    }
    public int solution(String name) {
        int answer = 0;
        int []isA = new int [name.length()];
        for(int i=0;i<name.length();i++) {
            int shortest = 0;
            shortest = - ('A' - name.charAt(i) );
            if(shortest > name.charAt(i) - 'A' ) {
                shortest = name.charAt(i) - 'A';
            }

            answer+=shortest;

        }
//		System.out.println(name.indexOf('A'));
        if(name.contains("A") && name.indexOf("A")!=0) {

        }
//		System.out.println(answer);
        return answer ;
    }
    public int solution2(String name) {
        int answer = 0;
        int exp = name.length() - 1;
        for(int i = 0; i < name.length(); i++){
            char c = name.charAt(i);
            answer += ('Z'- c + 1) > c - 'A' ? c - 'A' : ('Z' - c + 1);
            if(c == 'A'){
                int nextIdx = i+1;
                int countA = 0;
                while (nextIdx < name.length() &&
                        name.charAt(nextIdx) == 'A'){
                    countA ++;
                    nextIdx++;
                }
                int tmp = (i-1)*2 + (name.length() -1 -i - countA) ;
                if(exp > tmp) exp = tmp;
            }
        }

        answer += exp;
        return answer;
    }

}
