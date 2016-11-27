
package n皇后;

/**
 * @author zyw
 *
 */
public class Queen {

	private static final int N = 8;
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short[][] matrix = new short[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = 0;
			}
		}
		putQueen(matrix, 0);
	}

	private static void putQueen(short[][] matrix, int row) {
		// TODO Auto-generated method stub
		if (row == N) {
			count++;
			System.out.println("第" + count + "种解");
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.println();
				}
			}
			return;
		}
		short[][] chessTemp = matrix.clone();

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < N; j++) {
				chessTemp[row][j] = 0;// 清空那一行
			}
			chessTemp[row][i] = 1;
			if (canPut(chessTemp, row, i)) {
				putQueen(chessTemp, row + 1);
			}
		}
	}

	/**
	 * 判断是不是可以放皇后
	 * 
	 * @param k
	 * @return
	 */
	private static boolean canPut(short[][] arr, int row, int col) {
		int step = 1;
		while (row >= step) {
			if (arr[row - step][col] == 1)
				return false;
			if (col - step >= 0 && arr[row - step][col - step] == 1)
				return false;
			if (col + step < N && arr[row - step][col + step] == 1)
				return false;
			step++;
		}
		return true;
	}
}
