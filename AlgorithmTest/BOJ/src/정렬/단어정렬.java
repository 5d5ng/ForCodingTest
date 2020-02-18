package 정렬;

import java.io.*;
import java.util.*;

public class 단어정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < n; i++) {
            set.add( br.readLine());

        }
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               int l1 = o1.length(), l2 =o2.length();
               if(l1>l2) return 1; //l1 이 l2 보다 길이가 크면 1 리턴 즉 위치 바꿈
               else if(l1 == l2 ){
                   if(o1.compareTo(o2)>=0) return 1;
                   else return -1;
               }
               else return -1;
            }
        };
        List<String> list = new ArrayList(set);
        list.sort(c);

       for(String s:list) {
           System.out.println(s);
       }

    }
}
