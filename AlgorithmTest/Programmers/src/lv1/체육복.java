package lv1;

public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if(lost[j]>0) {
                    if (reserve[i] == lost[j]) {
                        reserve[i] = -1;
                        lost[j] = -1;
                    }
                }
            }
        }
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if(lost[j]>0) {
                    if (reserve[i]-1 == lost[j] || reserve[i]+1 == lost[j]) {
                        reserve[i] = -1;
                        lost[j] = -1;
                    }
                }
            }
        }
        for (int i = 0; i < lost.length; i++) {
            if(lost[i]>0) n--;
        }
        return n;
    }
}
