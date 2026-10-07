package Striver_Array_easy01;
import java.util.ArrayList;
public class InterSectionArrays {
    static ArrayList<Integer> inter(int[] ar1, int[] ar2){
        ArrayList<Integer> al = new ArrayList<>();
        int i=0; int j=0;
        while (i < ar1.length && j < ar2.length) {
            if (ar1[i] <= ar2[j]){
                if (ar1[i] == ar2[j])
                    al.add(ar1[i++]);

                i++;
            }else
                j++;
        }
        return al;
    }
    public static void main(String[] args){
        int[] ar1 = {1,1,2,2,4,4,6};
        int[] ar2 = {1,2,3,3,4,5,6};
        ArrayList<Integer> as = inter(ar1,ar2);
        for (Integer aa: as) System.out.print(aa+" ");
    }
}
