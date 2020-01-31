package 수학;

import java.util.Scanner;

public class 분수찾기 {

    public static void main(String[] args) {

        int flag = 2; //1/1일때 분자 분모합은 2이므로 2로시작
        int cnt =0 ,num1=0,num2=0; // 반복횟수를 이용해 x번째까지 반복 num1,num2는 분모 분자가 될 수
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int chk = 1; //분자를 세는건지 분모를 세는건지 판단 하나의 줄을 돌고나면
        //포문을 돌 분자 분모의 기준이 변화 함으로 -1을 곱해줌
        while(num1==0 ) {
            for(int i=1;i<flag;i++) {
                cnt++;
                if(cnt==x) { //x번째에 도달하면?
                    num1 = i;
                    num2 = flag-i;
                    break;
                }
            }
            chk*=(-1);
            flag++;
        }
        if(chk>0) {
            System.out.println(num1+"/"+num2);
        }
        else {
            System.out.println(num2+"/"+num1);
        }


        sc.close();
    }

}
