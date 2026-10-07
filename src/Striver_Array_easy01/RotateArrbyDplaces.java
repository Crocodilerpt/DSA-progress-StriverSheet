package Striver_Array_easy01;
public class RotateArrbyDplaces{
    static void rotByD(int[] num, int d){
        rev(num,0,d-1);
        rev(num,d,num.length-1);
        rev(num,0, num.length-1);
    }
    static void rev(int[] num, int i, int j){
        while(i <= j) {
           int temp = num[i];
           num[i] = num[j];
           num[j] = temp;
           j--; i++;
       }
    }
    public static void main(String[] args){
        int[] num = {2,3,4,5,6,7};
        rotByD(num, 3 % num.length);
        for (int aa: num)
            System.out.print(aa+" ");
    }
}


/*  brute --- tc O(2n), sc O(n)
static int[] rotByD(int[] num,int n, int d){
        int[] temp = new int[d];
        for (int i = 0; i < d; i++)
            temp[i] = num[i];

        for (int i = d; i < num.length; i++)
            num[i-d] = num[i];

        for (int i= n-d; i < n; i++)
            num[i] = temp[i-(n-d)];

        return num;
}
*/