package Algorithm;

/**
 *@Auther:Mactupe
 *@Date:2020/3/20-13:51
 *@Description:输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class OddEvenArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 0, 6, 9, 8, 7, 34};
        //{1,3,5,9,7,2,4,0,6,8}
        reOrderArray(array);
    }

    public static void reOrderArray(int[] array) {
        //数据初始化
        int halfLength = array.length % 2 == 1 ? array.length / 2 + 1 : array.length / 2;
        int[] oddArray = new int[halfLength]; //奇数数组
        int[] evenArray = new int[halfLength];  //偶数数组
        int oddIndex = 0;
        int evenIndex = 0;
        //将奇偶数分开存放
        for (Integer i : array) {
            if (i % 2 == 0) {
                oddArray[oddIndex] = i;
                oddIndex++;
            }
            if (i % 2 != 0) {
                evenArray[evenIndex] = i;
                evenIndex++;
            }
        }
        System.out.println("分别打印奇数和偶数数组：");
        printArr(oddArray, evenArray);

        //数组合成
        int[] resultArr = new int[array.length];
        for (int index = 0; index < resultArr.length; index++) {
            if (index < oddArray.length) {
                resultArr[index] = oddArray[index];
            } else {
                resultArr[index] = evenArray[index - evenArray.length];
            }

        }
        //打印数组
        System.out.print("转换后数组为：");
        for (int i = 0; i < resultArr.length; i++) {
            System.out.print(" " + resultArr[i]);
        }
    }

    //分别打印两个数组
    public static void printArr(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" " + arr1[i]);
        }
        System.out.println(" ");
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(" " + arr2[j]);
        }
        System.out.println(" ");

    }
}
