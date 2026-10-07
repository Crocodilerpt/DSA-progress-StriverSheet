package Striver_Array_midium01; // leaders in array
import java.util.ArrayList;
public class LeadersInArray {
    static void leads(int[] num){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0,0);
        int x=1;
        for (int i=num.length-1; i >= 0; i--) {
            if(num[i] > al.get(x-1)){
                al.add(x,num[i]);
                x++;
            }
        }
        al.remove(0);
        System.out.println(al);
    }
    public static void main(String[] args) {
        int[] num= {21,22,12,3,0,1,6};
        leads(num);
    }
}


/* another optimal
static void leads(int[] num) {
    ArrayList<Integer> al = new ArrayList<>();
    int max = Integer.MIN_VALUE;

    for (int i=num.length-1; i >= 0; i--){
        if (max < num[i]){
            max = num[i];
            al.add(num[i]);
        }
    }
    System.out.println(al);
} */

/* brute tc O(n^2)
static void leads(int[] num){
    for (int i=0; i<num.length; i++) {
        boolean lead = true;
        for (int j=i+1; j < num.length; j++) {
            if (num[i]<num[j]){
                lead = false;
                break;
            }
        }
        if (lead)
            System.out.print(num[i]+" ");
    }
}   */
