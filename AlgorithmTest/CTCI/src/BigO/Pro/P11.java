package BigO.Pro;

public class P11 {
    //정렬된 문자열 중 길이가 k인 모든 문자열을 출력하는 코드 *** k:문자열 길이 c:알파벳 갯수 O(K*c^k)
    int numChars = 26;
    void printSortedStrings(int remaining){
        printSortedStrings(remaining,"");
    }

    private void printSortedStrings(int remaining, String prefix) {
        if(remaining == 0){
            if(isInOrder(prefix)){
                System.out.println(prefix);
            }
        }else{
            for (int i = 0; i < numChars; i++) {
                char c = ithLetter(i);
                printSortedStrings(remaining - 1,prefix+c);

            }
        }
    }

    private boolean isInOrder(String s) {
        for (int i = 0; i < s.length() ; i++) {
            int prev = ithLetter(s.charAt(i-1));
            int curr = ithLetter(s.charAt(i));
            if(prev>curr){
                return false;
            }

        }
        return true;
    }

    private char ithLetter(int i) {
        return (char) (((int)'a')+i);
    }
}
