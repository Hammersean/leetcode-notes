//给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
//version1，将num先转成字符串再转成char类型数组，对数组进行相加操作
/*
class Solution {
    public int addDigits(int num) {
        String str = num + "";
        int ans = 0;
        while(true) {
            if (ans != 0) {
                str = ans + "";
            }
            ans = 0;
            char[] arr = str.toCharArray();
            for (int i = 0;i < arr.length;i++) {
                ans += arr[i] - '0';//此处不减去'0'，将导致ans进行的运算是ASCII码的相加，导致无限循环
            }
            if (ans <= 9) break;
        }
        return ans;

    }
}

 */
//version2,直接进行取模运算
/*
class Solution {
    public int addDigits(int num) {
        int sum = num;
        while(sum >= 10) {
            num = sum;
            sum = 0;
            while(num >= 1) {
                sum += num % 10;
                num /= 10;
            }
        }
        return sum;
    }
}

 */
//version3,数学思想
class Solution {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}