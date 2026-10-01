//初始解法
import java.util.ArrayList;
class Solution {
    public void setZeroes(int[][] matrix) {
        //先找到0所在位置的横纵坐标
        ArrayList<Integer> arr = new ArrayList<>();
        int col = matrix[0].length;
        int row = matrix.length;

        for (int i = 0;i < row;i++) {
            for (int j = 0;j < col;j++) {
                if (matrix[i][j] == 0) {
                    arr.add(i);
                    arr.add(j);
                }
            }
        }
        for (int i = 0;i < arr.size();i += 2) {
            int row_ = arr.get(i);
            int col_ = arr.get(i+1);
            for (int j = 0;j < row;j++) {
                for (int k = 0;k < col;k++) {
                    if (j == row_ || k == col_) {
                        matrix[j][k] = 0;
                    }
                }
            }
        }
    }
}