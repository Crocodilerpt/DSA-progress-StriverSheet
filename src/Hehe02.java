import java.util.ArrayList;
import java.util.Arrays;
class Hehe02{
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
