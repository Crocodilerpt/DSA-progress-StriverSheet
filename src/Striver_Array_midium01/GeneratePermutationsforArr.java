package Striver_Array_midium01;
import java.util.Arrays;
public class GeneratePermutationsforArr {
    static void genPermutation(int[] num,int index){
        if(index == num.length){
            System.out.println(Arrays.toString(num));
            return;
        }
        for (int i = index; i < num.length; i++) {

            int cng = num[index];
            num[index] = num[i];
            num[i] = cng;

            genPermutation(num,index+1);

            int backtrack = num[index];
            num[index] = num[i];
            num[i] = backtrack;
        }
    }
    public static void main(String[] args){
        int[] num = {1,2,3};
        genPermutation(num,0);
    }
}
