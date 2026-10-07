package Striver_Array_midium01;// Longest consecutive sequence in array
import java.util.HashSet;
import java.util.Set;
public class LongestConsecutiveSequence{
    static int funk(int[] num){
        Set<Integer> hs = new HashSet<>();
        int len = Integer.MIN_VALUE;
        for (Integer s : num) hs.add(s);
        if(num.length == 0)return 0;

        for (Integer in : hs){
            if (!hs.contains(in - 1)){
                int curNum = in;
                int curCnt = 1;
                while (hs.contains(curNum + 1)){
                    curNum += 1;
                    curCnt += 1;
                }
                len = Math.max(len,curCnt);
            }
        }
        return len;
    }
    public static void main(String[] args){
        int[] num = { 2, 4, 103, 3, 3, 5, 5, 5, 102, 101, 1, 1};
        System.out.println(funk(num));
    }
}


/* brute force
static int funk(int[] num){
    if (num.length == 0) return 0;
    int len = 1;
    for (int i = 0; i < num.length; i++) {
        int x = num[i];
        int count = 1;
        while (linearSearch(num,x+1)){
            x = x+1;
            count = count+1;
        }
        len = Math.max(len,count);
    }
    return len;
}
static boolean linearSearch(int[] num, int target){
    for (int nu : num)
        if (nu == target) return true;

    return false;
}   */




/* better approach O(n log n)
static int funk(int[] num){
    int len = Integer.MIN_VALUE;
    Arrays.sort(num);
    int count = 1;
    for (int i=0; i < num.length-1; i++){
        if (num[i]+1 == num[i+1])
            count++;
        else if (num[i] == num[i+1]) {
            // do nothing;
        } else
            count=1;

        len = Math.max(len,count);
    }
    return len;
} */