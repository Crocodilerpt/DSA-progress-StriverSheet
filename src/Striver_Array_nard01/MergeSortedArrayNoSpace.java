package Striver_Array_nard01;
import java.util.ArrayList;
import java.util.Arrays;
public class MergeSortedArrayNoSpace {
    static int[][] mergeOver(int[][] arr){
        ArrayList<int[]> al = new ArrayList<>();
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=0; i < arr.length; i++) {
            int start = arr[i][0];
            int end = arr[i][1];
            if (!al.isEmpty() && end <= al.get(al.size()-1)[1]) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j][0] <= end)
                    end = Math.max(end, arr[j][1]);
                else
                    break;
            }
            al.add(new int[]{start,end});
        }
        return al.toArray(new int[al.size()][]);
    }
    public static void main(String[] args){
        int[][] arr = {{1,3},
                {2,6},
                {8,9},
                {9,11},
                {8,10},
                {2,4},
                {15,18},
                {16,17}};
        int[][] ans = mergeOver(arr);
        System.out.println(Arrays.deepToString(ans));
    }
}


/* optimal code
static int[][] mergeOver(int[][] arr){
    ArrayList<int[]> al = new ArrayList<>();
    Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
    if (arr.length <= 1)return arr;
    for (int i = 0; i < arr.length; i++) {
        int[] ar = arr[i];
        if(al.isEmpty() || ar[0] > al.get(al.size()-1)[1])
            al.add(ar.clone());
        else{
            int[] last = al.get(al.size()-1);
            last[1] = Math.max(last[1],ar[1]);
        }}
    return al.toArray(new int[al.size()][]);
}*/