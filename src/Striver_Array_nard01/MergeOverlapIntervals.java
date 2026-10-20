package Striver_Array_nard01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MergeOverlapIntervals {
    static int[][] mergeOver(int[][] arr) {
        if (arr.length <= 1) return arr;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> al = new ArrayList<>();

        for (int[] ar : arr) {
            if (al.isEmpty() || ar[0] > al.get(al.size() - 1)[1]) {
                al.add(ar.clone());
            } else {
                int[] last = al.get(al.size() - 1);
                last[1] = Math.max(last[1], ar[1]);
            }
        }
        return al.toArray(new int[al.size()][]);
    }

    //{1,3}, {2,4}, {2,6}, {8,9}, {8,10}, {9,11}, {15,18}, {16,17}
    public static void main(String[] args){
        int[][] arr = {{1,3},
                {2,6},
                {8,9},
                {9,11},
                {8,10},
                {2,4},
                {15,18},
                {16,17}};
        System.out.println(mergeOver(arr));
    }
}


/* optimal approach sorting then a logic
static int mergeOver(int[][] arr){
    Arrays.sort(arr, (a, b) -> a[0] - b[0]);
    int count=1;
    int end = arr[0][1];
    for(int i=1; i < arr.length; i++){
        if(arr[i][0] < end) {
            end = Math.max(end, arr[i][1]);
        }
        else{
            count++;
            end = arr[i][1];
        }
    }
    return count;// update count first end the interval later
} //{1,3}, {2,4}, {2,6}, {8,9}, {8,10}, {9,11}, {15,18}, {16,17}
*/