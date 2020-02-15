package 정렬;

import java.io.*;
public class 수_정렬하기2 {
    static int [] arr;
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언\
            int n = Integer.parseInt(bf.readLine());
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(bf.readLine());
            }
        mergeSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int q = (start + end) / 2;
            mergeSort(arr, start, q);
            mergeSort(arr, q + 1, end);
            merge(arr, start, q, end);
        }
    }
   static void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k++] = L[i++];
            }
            else
            {
                arr[k++] = R[j++];

            }
        }
        while (i < n1)
        {
            arr[k++] = L[i++];

        }
        while (j < n2)
        {
            arr[k++] = R[j++];
        }
    }
}
