package Algorithm;

import java.util.Arrays;

/**
 *@Auther:Mactupe
 *@Date:2020/3/19-15:20
 *@Description:输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 */
public class NumOfOneInBinarySys {

    public static void main(String[] args) {
        int index = (int) (Math.random() * 100);
        System.out.println("输入随机数为：" + index);
        System.out.println("当前输入随机数的二进制中1的个数为：" + NumberOf1(index));
    }

    public static int NumberOf1(int n) {
        int result = 0;
        String binary = Integer.toBinaryString(n);
        System.out.println("当前输入随机数的二进制数为：" + binary);

        char[] binaryArr = binary.toCharArray();
        for (char bin: binaryArr){
            System.out.print(bin);
            if ('1' == bin){
                result++;
            }
        }
        return result;
    }
}
