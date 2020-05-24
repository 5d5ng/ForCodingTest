package lv1;

public class P2016년 {

        public String solution ( int a, int b){
            String answer = "";
            String[] ar = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

            int day = 0;
            if (a == 1) return ar[b % 7];
            for (int m = 1; m < a; m++) {
                if (m == 2) day += 29;

                else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                    day += 31;
                } else {
                    day += 30;
                }
            }
            day += b;


            return ar[day % 7];
        }
}

