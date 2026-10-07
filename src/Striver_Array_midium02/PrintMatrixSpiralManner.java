package Striver_Array_midium02;
public class PrintMatrixSpiralManner {
    static void spiralManner(int[][] num){
        int top = 0, left = 0;
        int bottom = num.length-1;
        int right = num[0].length-1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++)
                System.out.print(num[top][i] + " ");
            top++;

            for (int j = top; j <= bottom; j++)
                System.out.print(num[j][right] + " ");
            right--;

            if (top <= bottom) {
                for (int k = right; k >= left; k--)
                    System.out.print(num[bottom][k] + " ");
                bottom--;
            }
            if (left <= right) {
                for (int l = bottom; l >= top; l--)
                    System.out.print(num[l][left] + " ");
                left++;
            }
        }
    }
    public static void main(String[] args){
        int[][] num = {
                { 1, 2, 3, 4},
                {10,11,12, 5},
                { 9, 8, 7, 6}};
        spiralManner(num);
    }
}
