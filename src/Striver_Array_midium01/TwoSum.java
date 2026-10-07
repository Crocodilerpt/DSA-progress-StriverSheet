package Striver_Array_midium01;
import java.util.HashMap;
public class TwoSum {
    static int[] sumThem(int[] num, int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<num.length; i++){

            int require = target - num[i];
            if(hm.containsKey(require)){
                return new int[]{hm.get(require),i};
            }
            hm.put(num[i],i);
        }
        return new int[]{-1};
    }
    public static void main(String[] args){
        int[] nums = {1,6,2,10,3};
        int[] ans = sumThem(nums,16);
        for(Integer an: ans) System.out.print(an+" ");
    }
}


/*  brute O(n^2)
static int[] sumThem(int[] num, int target){

    for(int i=0; i<num.length; i++){
        for(int j=0; j<num.length; j++){
            int sum = num[i] + num[j];
            if (sum == target)
                return new int[]{i,j};
        }
    }
    return new int[]{-1};
}
*/
/*  tc -- O(nlogn) + O(n)
static int[] sumThem(int[] num, int target){

    Arrays.sort(num);
    int i=0; int j= num.length-1;
    while (i<=j){
        int sum= num[i] + num[j];
        if (sum == target)return new int[]{i,j};
        else if(sum>target) j--;
        else i++;
    }
    return new int[]{-1};
}*/