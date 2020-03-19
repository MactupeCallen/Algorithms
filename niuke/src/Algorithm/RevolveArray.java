package Algorithm;
/**
 *@Auther:Mactupe
 *@Date:2020/3/18-17:12
 *@Description:数组的最小值
 */
public class RevolveArray {

    public static void main(String[] args) {
        int[] array = {2,3,4,6,32,67,34,1};
        System.out.println(minNumberInRotateArray(array));
    }

    public static int minNumberInRotateArray(int [] array) {
        if (array.length == 0){
            return 0;
        }
        if(array.length == 1){
            return array[0];
        }
        int result = 0;
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i+1]){
                result = array[i+1];
            }
        }
        return result;
    }
}
