package Striver_Array_easy01;
public class MoveZeroEnd {
    static void movEnd(int[] num){
        int[] temp = new int[num.length];
        int indx = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0)
                temp[indx++] = num[i];
        }
        for (int j = 0; j < num.length; j++) {
            num[j] = temp[j];
        }
    }
    public static void main(String[] args) {
        int[] num = {0,0,2,3,0,0,1,0,1,0};
        movEnd(num);
        for (int ans : num)
            System.out.print(ans+" ");
    }
}
/* O(n)
static void movEnd(int[] num){
    int i=0; int j= num.length-1;
    while (i < j){
        if (num[j] != 0 && num[i]==0){
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            i++;
        }
        j--;
    }
}
*/

/*
static void movEnd(int[] num){
    int a=0;
    for (int b = 0; b < num.length; b++) {
        if (num[b] != 0){
            int temp = num[a];
            num[a] = num[b];
            num[b] = temp;
            a++;
        }
    }
} */