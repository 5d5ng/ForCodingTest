import java.io.*;
import java.util.*;

class TT {
    String s1;
    String s2 ;
    
    public TT(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    Comparator<TT> c1 = new Comparator<TT>() {
        @Override
        public int compare(TT o1, TT o2) {
            return o1.s1.length()-o2.s1.length();
        }
    };

    Comparator<TT> c2 = new Comparator<TT>() {
        @Override
        public int compare(TT o1, TT o2) {
            return o1.s2.length()-o1.s2.length();
        }
    };
}

public class TEst {

    public static void main(String[] args) {
        TT[] gr = new TT[10];
        for (int i = 0; i <gr.length ; i++) {
            gr[i] = new TT("s"+i,"s"+i*2);
        }
        gr[3].s1 = "sssssssssssss";
        Arrays.sort(gr,gr[0].c1);
        for(TT s:gr) {
            System.out.println(s.s1);
        }
        Integer[] ar = {3,2,123,1,21312,2,33};
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };
        Arrays.sort(ar,com);
        for(Integer i:ar)
        {
            System.out.println(i);
        }

    }
}
