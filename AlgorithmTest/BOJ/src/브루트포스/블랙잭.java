package 브루트포스;

import java.util.Scanner;

public class 블랙잭 {
    public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] cards = new int[N];
        int NumOfCard = cards.length;
        for(int i= 0 ;i< NumOfCard;i++)
            cards[i] = sc.nextInt();
        for (int i = 0; i < NumOfCard ; i++) {
            for (int j = i+1; j < NumOfCard; j++) {
                for (int k = j+1; k < NumOfCard; k++) {
                   int target =  cards[i]+cards[j]+cards[k] ;
                    if( target<= M && res < target){
                        res = target;
                    }
                }
            }
        }
        System.out.println(res);


    }
}
