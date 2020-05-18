package lv2;

import java.util.Arrays;

public class H_index {

    public static void main(String[] args) {
        H_index app = new H_index();
        int [] arr = {3,0,6,1,5};
        System.out.println(app.solution(arr));

    }

    public int solution(int[] citations) {

        int h = 0 ;
        Arrays.parallelSort(citations);
        for (int i = 0; i <=citations[citations.length-1] ; i++) { //논문 인용최대값까지
            int cnt1 = 0,cnt2 = 0;
            for (int j = 0; j < citations.length; j++) { //순회
                if(citations[j]>=i){
                    cnt1++; //인용이 많은 경우
                }
                else{
                    cnt2++; //인용이적은 경우
                }
            }
            if(cnt1>=i && cnt2<=i ) h = Math.max(i,h);
        }
        return h;

    }
}
