package Striver_Array_easy01;// sorted array remove duplicate
public class RemoveDuplicateArr {
    static int rmvDupli(int[] num){ //brute
        int i=0;
        for (int j = 0; j < num.length; j++) {
            if (num[i] != num[j]){
                i++;
                num[i] = num[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,5,5,5,6};
        int ps = rmvDupli(arr);
        for (int i=0; i < ps; i++)
            System.out.print(arr[i]+" ");
    }
}

/* brute tc = O(n+m) , sc = O(n)
static int rmvDupli(int[] nums){
    Set<Integer> hs = new HashSet<>();
    for (Integer se : nums) hs.add(se);

    int index = 0;
    for (int ans: hs)
        nums[index++] = ans;

    return index;
}
 */