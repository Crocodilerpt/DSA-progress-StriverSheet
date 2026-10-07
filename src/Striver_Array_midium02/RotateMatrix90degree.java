package Striver_Array_midium02;//rotate 90 degree right - transpose and reverse
public class RotateMatrix90degree {
    static int[][] rotate(int[][] num) {
        int rows = num.length; int cols = num[0].length;
        int[][] mod = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mod[j][rows - 1 - i] = num[i][j];
            }
        }
        return mod;
    }
    public static void main(String[] args){
        int[][] num = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        int[][] ans = rotate(num);
        for (int i=0; i < ans.length; i++) {
            System.out.println();
            for (int j=0; j < ans.length; j++) {
                System.out.print(ans[i][j]);
            }
        }
    }
}



/*
static int[][] rotate(int[][] num) {
    int rows = num.length, cols = num[0].length;
    ArrayList<Integer> al = new ArrayList<>();
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < cols; j++)
            al.add(num[i][j]);

    int[][] res = new int[cols][rows];   // dimensions swap
    int idx=0;
    for (int c = rows - 1; c >= 0; c--)
        for (int r = 0; r < cols; r++)
            res[r][c] = al.get(idx++);

    return res;
}   */



/* tranpose and reverse -- optimal
static int[][] rotate(int[][] num) {
    int n = num.length;
    // transpose
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            int temp = num[i][j];
            num[i][j] = num[j][i];
            num[j][i] = temp;
        }
    }
    // reverse each row
    for (int i = 0; i < n; i++) {
        int p1 = 0, p2 = n - 1;
        while (p1 < p2) {
            int t = num[i][p1];
            num[i][p1] = num[i][p2];
            num[i][p2] = t;
            p1++; p2--;
        }
    }
    return num;
} */