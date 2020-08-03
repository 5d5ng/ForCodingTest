package BigO.Pro;

public class P9 {
    //배열에 새로운 값을 추가할 때 마다 더 크기가 큰 배열을 새로 만든 뒤 해당 배열을 반환하는 함수
    int [] copyArray(int[] array){ //:O(n^2)
        int[] copy = new int[0];
        for (int value:array){
            copy = appendToNew(copy,value);
        }
        return copy;

    }
    int[] appendToNew(int[] array,int value){
        //copy all elements over to new array
        int[] bigger = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            bigger[i] = array[i];

        }
        //새 원소 추가
        bigger[bigger.length-1] = value;
        return bigger;
    }
}
