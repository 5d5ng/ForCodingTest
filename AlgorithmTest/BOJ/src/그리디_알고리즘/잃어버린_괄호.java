package 그리디_알고리즘;
import java.io.*;
import java.util.*;
public class 잃어버린_괄호 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] in = br.readLine().split("-");
        ArrayList<Integer> list = new ArrayList<>();
        for(String s :in){
          int temp = 0 ;
           String []nums = s.split("\\+");
          for(String num:nums){
              temp+=Integer.parseInt(num);
          }
          list.add(temp);
        }
        int ans = list.remove(0);
        for(int num:list){
            ans-=num;
        }
        System.out.println(ans);

    }
}
