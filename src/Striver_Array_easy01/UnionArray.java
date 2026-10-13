package Striver_Array_easy01;
import java.util.ArrayList;
public class UnionArray {
    static ArrayList<Integer> onion(int[] ar1,int[] ar2){
        ArrayList<Integer> alist = new ArrayList<>();
        int i=0;    int j=0;
        while(ar1[i] < ar1.length && ar2[j] < ar2.length ){
            int x;
            if (ar1[i] <= ar2[j])
                x = ar1[i++];
            else
                x = ar2[j++];

            if (alist.isEmpty() || alist.get(alist.size()-1) != x)
                alist.add(x);
        }
        while (i<ar1.length){
            if (alist.isEmpty() || alist.get(alist.size()-1) != ar1[i])
                alist.add(ar1[i]); i++;
        }
        while (j<ar2.length){
            if (alist.isEmpty() || alist.get(alist.size()-1) != ar2[j])
                alist.add(ar2[j]); j++;
        }
        return alist;
    }
    public static void main(String[] args){
        int[] ar1 = {1,1,2,4,4,5};
        int[] ar2 = {1,3,3,4,6};
        ArrayList<Integer> ans = onion(ar1,ar2);
        for(Integer aa: ans) System.out.print(aa+" ");
    }
}
// do brute using Set<> ans after taking all element from both arr
// now Set<> have all unique get back in the ans array
// use TreeSet<Integer>

/*
        int i = 0, j = 0, k = 0;
int[] res = new int[ar1.length + ar2.length];

        while (i < ar1.length && j < ar2.length) {
int val = ar1[i] < ar2[j] ? ar1[i++] : ar2[j++];
            if (k == 0 || val != res[k - 1]) res[k++] = val;
        }
                while (i < ar1.length) {
int val = ar1[i++];
            if (k == 0 || val != res[k - 1]) res[k++] = val;
        }
                while (j < ar2.length) {
int val = ar2[j++];
            if (k == 0 || val != res[k - 1]) res[k++] = val;
        }
                return Arrays.copyOf(res, k);
    }*/