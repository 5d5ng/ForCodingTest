package lv2;

public class 점프와_순간이동 {
    public static void main(String[] args) {

        System.out.println(solution(5000));
    }
    public static int solution(int n){
        int ans = 0;
        String s = Integer.toBinaryString(n);
        for(char i:s.toCharArray()){
            if(i=='1')ans++;
        }
        return ans;
    }
}
