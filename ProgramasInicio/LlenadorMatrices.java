import java.util.*;

public class LlenadorMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[][];
		int i;
		int j;
		nums = new int[4][5];
		//matriz de numeros aleatorios
		for (i = 0; i < nums.length; i++) {
			for (j = 0; j < nums[i].length; j++) {
				nums[i][j] = (int) (Math.random()*10);
			}
		}
		for (i = 0; i < nums.length; i++) {
			System.out.println(Arrays.toString(nums[i]));
		}
	}

}
