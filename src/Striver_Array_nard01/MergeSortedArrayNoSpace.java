package Striver_Array_nard01;
import java.util.Arrays;
public class MergeSortedArrayNoSpace {
    static void mergeArray(int[] ar1,int[] ar2){
        for(int i=0; i < ar1.length; i++){
            for(int j=0; j < ar2.length; j++){
                int min = 0;
                if (ar2[j] > min) min = ar2[j];
                if(ar1[i] > min)
                    swaps(ar1,ar2,i,j);
                else if(ar1[i] < ar2[j])
                    break;
            }
        }Arrays.sort(ar2);
    }
    static void swaps(int[] ar1,int[] ar2,int i,int j){
        int temp = ar1[i];
        ar1[i] = ar2[j];
        ar2[j] = temp;
    }
    public static void main(String[] args){
        int[] ar1 = {1,3,5,7};
        int[] ar2 = {0,2,6,8,9};
        mergeArray(ar1,ar2);
        for (int a :ar1) System.out.print(a+" ");
        System.out.println();
        for (int b :ar2) System.out.print(b+" ");
    }
}