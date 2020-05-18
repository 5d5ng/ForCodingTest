package lv2;

import jdk.nashorn.internal.ir.ReturnNode;

import java.util.Arrays;

public class H_index {

    public static void main(String[] args) {
        H_index app = new H_index();
        int [] arr = {3,0,6,1,5};
        System.out.println(app.solution(arr));

    }

    public int solution(int[] citations) {

        Arrays.sort(citations);
        int start = (int)Math.ceil(citations.length/2);
        for(;start>=0;start--){
            if(citations[start]>=start+1) return start+1;
        }
        return 0;
    }
}
