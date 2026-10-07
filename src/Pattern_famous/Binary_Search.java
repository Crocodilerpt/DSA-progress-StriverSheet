package Pattern_famous;
public class Binary_Search {
    static int binary(int[] num,int target){
        int left=0; int right=num.length-1;

        while (left <= right){
            int mid = left + (right - left)/2;

            if (num[mid] == target)
                return mid;
            else if(num[mid] > target)
                right = mid-1;
            else
                left = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9};
        System.out.println(binary(arr,8));
    }
}
