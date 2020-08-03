package BigO;

public class Ex16 { //1과 n을 포함하여 그 사이에 있는 모든 2의 승수를 출력하는 함수
    public static void main(String[] args) {
        Ex16 app = new Ex16();
        app.powerOf2(15);

    }
    int powerOf2(int n){
        if(n<1){
            return 0;
        }
        else if(n==1){
            System.out.println(1);
            return 1;
        }
        else{
            int prev = powerOf2(n/2); //O(logN)
            int curr = prev *2;
            System.out.println(curr);
            return curr;
        }
    }
}
