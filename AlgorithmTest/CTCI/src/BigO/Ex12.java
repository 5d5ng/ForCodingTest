package BigO;

public class Ex12 {
    public static void main(String[] args) {

        Ex12 app = new Ex12();
        String s = "abcd";
        System.out.println(s.substring(0,1));
        System.out.println(s.substring(2));
//        app.permutation("abcd");


    }
    void permutation(String str){
        permutation(str,"");
    }
    void permutation(String str,String prefix){
        if(str.length()==0){
//            System.out.println(prefix);
        }else{
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0,i)+ str.substring(i+1); //i 빼고 저
                System.out.println(rem);
                permutation(rem,prefix+str.charAt(i)); // i를 선택하는 것

            }
        }
    }
}
