package Striver_Array_midium01;// KADANE's Algorithm
public class MaxSubarraySum {
    static int maxSum(int[] num){
        int max = Integer.MIN_VALUE;
        int sum = 0;   int start = 0;
        int ansStart = 0, ansEnd = 0;

        for (int a = 0; a < num.length; a++){
            sum += num[a];

            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = a;
            }
            if (sum < 0) {
                sum = 0;
                start = a + 1;
            }
        }
        System.out.println("max: "+max);
        System.out.println("indices: "+ansStart+" "+ansEnd);
        return max;
    }
    public static void main(String[] args){
        int[] num = {-2,-3, 4,-1,-2, 1, 5, 2,-3};
        maxSum(num);
    }
}


/*   better O(n^2)
static int maxSum(int[] num,int target){
    int max=0;
    for(int i=0; i<num.length; i++) {
        int sum=0;
        for(int j=i; j < num.length; j++) {
            sum = sum + num[j];

            if (sum==target)
                max = Math.max(max,j-i+1);
        }
    }return max;
}   */
