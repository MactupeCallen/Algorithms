package Algorithm;

import java.util.Scanner;

public class FibonacciOut {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//创建一个键盘扫描类对象
        System.out.println("请输入需要展示的斐波那契阶数：");
        int n = input.nextInt();
        System.out.println(Fibonacci(n));
    }

    public static int Fibonacci(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
