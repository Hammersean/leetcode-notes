//给你一个整数n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
class Solution {
    public int subtractProductAndSum(int n) {
        int num = n;
        int num1 = 0;
        int num2 = 1;
        while(num >= 1) {//每次取最后一位
            num1 += num % 10;
            num2 *= num % 10;
            num /= 10;
        }
        return num2 - num1;
    }
}