package Pattern_famous;
public class Sliding_Window {// Sliding Window(variable size)
    static int subArrSum(int[] num,int k){
        int maxlen=0;   int sum=0;  int left=0;

        for (int right=0; right < num.length; right++) {
            sum = sum + num[right];

            while (sum > k)
                sum = sum - num[left++];

            if (sum == k)
                maxlen = Math.max(right-left+1,maxlen);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int[] arr = {10,5,2,6,2,15,1,6,15};
        System.out.println(subArrSum(arr,15));
    }
}