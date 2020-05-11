package lv3;

public class 문자열압축 {
    public static void main(String[] args) {
        String s ="a";

        System.out.println(solution(s));
    }
    public  static  int solution(String s) {
        int answer = Integer.MAX_VALUE;
        int size = s.length();


        for(int flag = 1;flag<size;flag++){// 자르는 단위
            int val =(int)Math.ceil((double) size/flag);
            String [] ar = new String[val];
            int start = 0;
            String res = "";
            for(int i=0;i<val;i++){
                if(start+flag>=size){
                    ar[i] = s.substring(start,size);
                }
                else {
                    ar[i] = s.substring(start, start + flag);
                }
                start+=flag;
//                System.out.println(ar[i]);
            }
            int cnt = 1;
            for(int i=0;i<val-1;i++) //압축 처리
            {
                if( ar[i].equals(ar[i+1]) ){
                    cnt++;
                }
                else{ //다른 문자 나오면\
                    if(cnt>1) {
                        res += Integer.toString(cnt);
                        cnt = 1;
                    }
                    res += ar[i];
                }
            }
            if(cnt>1){
                res += Integer.toString(cnt);
            }
            res +=ar[val-1];
            System.out.println(res);
            answer = Math.min(answer,res.length());
        }
        return answer == Integer.MAX_VALUE ? 1:answer;
    }
}
