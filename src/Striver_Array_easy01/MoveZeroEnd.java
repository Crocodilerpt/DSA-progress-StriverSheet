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
static void moveZend(int[] num) {
    int a = 0;
    for (int b = 0; b < num.length; b++) {
        if (num[b] != 0) {
            if (a != b) {
                int temp = num[a];
                num[a] = num[b];
                num[b] = temp;
            }
            a++;
        }
    }
} */


/* brute -- sorting technique
static void moveZend(int[] num) {
    for (int i = 0; i < num.length; i++) {
        for (int j = 0; j < num.length-1; j++) {
            if (num[j] < num[j+1]){
                int tem = num[j];
                num[j] = num[j+1];
                num[j+1] = tem;
            }
        }
    }
}*/

/* tc o(n), sc 0(n)
static void moveZend(int[] num) {
    int[] temp = new int[num.length];
    int f=0; int l=num.length-1;
    for(int i=0; i < num.length; i++){
        if (num[i]==0)
            temp[f++]=num[i];
        else
            temp[l--]=num[i];
    }
    for (int a :temp) System.out.print(a+" ");
}*/

/*
static void moveZend(int[] num) {
    int i=0;
    for (int j= num.length-1; j>=0;j--){
        while (num[j]==0){
            int tem = num[i];
            num[i] = num[j];
            num[j] = tem;
            i++;
        }
    }
}*/

/*
static void moveZend(int[] num) {
    int i=0; int j= num.length-1;
    while (i < j){
        if(num[j]==0){
            if(num[i]==0)
                i++;
            int tem = num[i];
            num[i] = num[j];
            num[j] = tem;
            i++;
        }
        j--;
    }
}*/