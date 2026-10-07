package Striver_Array_midium01;// rearrange array by sign
import java.util.ArrayList;
public class RearrangeArrBySign {
    static void leads(int[] num) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= 0)
                pos.add(num[i]);
            else if (num[i] < 0)
                neg.add(num[i]);
        }
        int i = 0;  int a = 0;  int b = 0;
        while (a < pos.size() && b < neg.size()) {
            if (i % 2 == 0)
                num[i++] = pos.get(a++);
            else if (i % 2 == 1)
                num[i++] = neg.get(b++);
        }
        while (a < pos.size())
            num[i++] = pos.get(a++);
        while (b < neg.size())
            num[i++] = neg.get(b++);
    }
    public static void main(String[] args) {
        int[] num = {-2, -1, 3, -6, 4, 5, -9, -8};
        leads(num);
        for (Integer ans : num)
            System.out.print(ans + " ");
    }
}


/* brute O(n+m)
static void leads(int[] num) {
    int[] neg = new int[num.length/2];
    int[] pos = new int[num.length/2];
    int a=0; int b=0;
    for (int i=0; i < num.length; i++){
        if (num[i] > 0)
            pos[a++] = num[i];
        else
            neg[b++] = num[i];
    }
    a=0;b=0;
    for (int i = 0; i < num.length; i++) {
        if (i % 2 == 1){
            num[i] =pos[a++];
        }else
            num[i] = neg[b++];
    }
} */



/*   optimal tc O(n), sc O(n)
static int[] leads(int[] num) {
    int[] temp = new int[num.length];
    int e=0;
    int o=1;
    for (int i = 0; i < num.length; i++) {
        if (num[i] > 0){
            temp[e] = num[i];
            e = e + 2;
        } else if (num[i] < 0){
            temp[o] = num[i];
            o = o + 2;
        }
    }
    return temp;
}   */