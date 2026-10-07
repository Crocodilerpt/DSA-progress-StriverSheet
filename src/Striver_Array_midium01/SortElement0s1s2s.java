package Striver_Array_midium01;// sort zeros ones & twos
public class SortElement0s1s2s{// DUTCH NATIONAL FLAG Algorithm...
    static void sortThem(int[] num){
        int x=0; int l=0; int r=num.length-1;
        while(x<=r){
            if(num[x]==0){
                swap(num,x,l);
                l++; x++;
            }else if(num[x]==2){
                swap(num,x,r);
                r--;
            }else
                x++;
        }
    }
    static void swap(int[] num,int i,int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    public static void main(String[] args) {
        int[] num = {2,2,1,1,0,2,1,0,0,2,1,2};
        sortThem(num);
        for (Integer ans: num)
            System.out.print(ans+" ");
    }
}

/*  brute O(n^2)
static void sortThem(int[] num){
    for (int i = 0; i < num.length; i++) {
        for (int j = 0; j < num.length-i-1; j++) {
            if (num[j] >= num[j+1]){
                int temp = num[j];
                num[j] = num[j+1];
                num[j+1] = temp;
            }
        }
    }
}   */


/*  better O(n+m)
static void sortThem(int[] num){
    int zero=0; int one=0; int two=0;
    for (int i=0; i<num.length; i++){
        if (num[i]==0) zero++;
        else if(num[i]==1) one++;
        else two++;
    }
    for (int a=0; a<num.length; a++){
        if(zero!=0) {
            num[a]=0; zero--;
        }
        else if(one!=0){
            num[a]=1;   one--;
        }
        else
            num[a]=2;   two--;
    }
}
*/