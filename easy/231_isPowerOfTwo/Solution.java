//思路分析：
// 是2的幂的正整数的二进制数各位上只有一个1，当该数-1时，各位置上的数由1变成0，由0变成1
// 然后将变化前与变化后的两数进行按位与运算，结果得到0（按位与将两个二进制数的每一位进行判断，得到的结果全为0）
//version1:
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        if ((n & (n-1)) == 0)return true;
        return false;
    }
}
//version2
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n-1)) == 0;
    }
}