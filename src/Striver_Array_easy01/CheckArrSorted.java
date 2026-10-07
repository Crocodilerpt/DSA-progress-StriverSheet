package Striver_Array_easy01;
public class CheckArrSorted {
    static boolean isSort(int[] num){
        for (int i = 0; i < num.length-1; i++) {
            if (num[i] > num[i+1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] num = {2,3,4,5};
        System.out.println(isSort(num));
    }
}
