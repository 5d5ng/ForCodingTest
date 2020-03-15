package 문자열;

import java.util.Scanner;

class Button{
    int time = 0;
    int num = 0 ;
    String alphaNum;

    public Button(int time, int num, String alphaNum) {
        this.time = time;
        this.num = num;
        this.alphaNum = alphaNum;
    }
}
public class 다이얼 {

    public static void main(String[] args) {

        Button [] buttons = new Button[10];
        buttons[1] = new Button(2,1,"");
        buttons[2] = new Button(3,2,"ABC");
        buttons[3] = new Button(4,3,"DEF");
        buttons[4] = new Button(5,4,"GHI");
        buttons[5] = new Button(6,5,"JKL");
        buttons[6] = new Button(7,6,"MNO");
        buttons[7] = new Button(8,7,"PQRS");
        buttons[8] = new Button(9,8,"TUV");
        buttons[9] = new Button(10,9,"WXYZ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int res = 0;
        for (int i = 0; i < input.length() ; i++) {
            res += chkNum(input.charAt(i),buttons);

        }

        System.out.println(res);

    }
    public static  int chkNum(char target , Button [] buttons){

       for(int i = 2;i<10;i++) {
           for (int k = 0; k < buttons[i].alphaNum.length(); k++) {
               if (buttons[i].alphaNum.charAt(k) == target)
                   return buttons[i].time;
           }

       }
        return  0 ;
    }

}
