package BigO.Pro;

public class P12 {
    int intersection(int[] a,int[] b){ //O(BlogB+AlogB)
        mergesort(b); //BlogB
        int intersect = 0;
        for (int x:a){
            if(binarySearch(b,x)>=0){ // logB
                intersect++;
            }
        }
        return intersect;
    }
}
