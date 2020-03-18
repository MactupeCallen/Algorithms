package Algorithm;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 * 
 * @author mactupe
 *
 */
public class ArraySolution {

	public static void main(String[] args) {
		int target = 4;
//		int[][] array = new int[][] {{1,3,5},{7,9,11},{13,15,17}};
		int[][] array = new int[3][3];
		Boolean returnBoolean = Find(target, array);
		System.out.println(returnBoolean.toString());
	}

	public static boolean Find(int target, int[][] array) {
		Boolean returnBoolean = false;
		if (null == array || array.length == 0 || 0 == array[0].length) {
			return returnBoolean;
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (target == array[i][j]) {
					returnBoolean = true;
				}
			}
		}
		return returnBoolean;
	}
}
