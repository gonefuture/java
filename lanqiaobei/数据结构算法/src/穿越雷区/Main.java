package 穿越雷区;

import java.util.Scanner;

public class Main {

	// 代表四个方向
	private static final int[][] dir = { { 0, 1 }, { 0, -1 }, { -1, 0 }, { 1, 0 } };
	private static int minVal = Integer.MAX_VALUE;
	private static int count = 0;
	private static char[][] modelArr = null;// 作为模板，回溯还原格局用

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int line = Integer.parseInt(scanner.nextLine());
		int x = 0, y = 0;
		modelArr = new char[line][line];
		char[][] newArr = new char[line][line];
		for (int i = 0; i < line; i++) {
			char[] chArr = scanner.nextLine().toCharArray();
			for (int j = 0; j < chArr.length; j += 2) {
				int idx = j / 2;
				char ch = chArr[j];
				modelArr[i][idx] = newArr[i][idx] = ch;
				if (ch == 'A') {
					x = i;
					y = idx;
				}
			}

		}
		// System.out.println(x+","+y);
		// print(newArr);

		long t = System.currentTimeMillis();
		dfs(newArr, x, y);
		System.out.println(minVal);
		System.out.println("耗时：" + (System.currentTimeMillis() - t));
	}

	/**
	 * 深搜+回溯
	 * 
	 * @param localArr
	 * @param x
	 * @param y
	 */
	private static void dfs(char[][] localArr, int x, int y) {
		for (int i = 0; i < dir.length; i++) {
			int offsetX = x + dir[i][0];
			int offsetY = y + dir[i][1];
			// 判断越界，如果越界，走另一个方向
			if (offsetX >= 0 && offsetX < localArr[0].length && offsetY >= 0 && offsetY < localArr.length) {
				if (localArr[x][y] == 'B') {
					if (count < minVal)
						minVal = count;
					// print(localArr);
					count--;
					return;
				}
				if (canWalk(localArr, x, y, offsetX, offsetY)) {
					localArr[x][y] = '0';// 访问过的就标记为0
					count++;
					dfs(localArr, offsetX, offsetY);
					localArr[x][y] = modelArr[x][y];// 回溯还原,写在这里就显得很重要，每返回就还原

				}
			}

		}
		count--;
	}

	/**
	 * 打印数组，测试用
	 * 
	 * @param localArr
	 */
	private static void print(char[][] localArr) {
		for (int i = 0; i < localArr.length; i++) {
			for (int j = 0; j < localArr[i].length; j++) {
				System.out.print(localArr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * 判断是否下一个方向可走
	 * 
	 * @param newArr
	 * @param x1
	 *            现在的位置
	 * @param y1
	 * @param x2
	 *            下个方向
	 * @param y2
	 * @return
	 */
	private static boolean canWalk(char[][] newArr, int x1, int y1, int x2, int y2) {
		return (newArr[x1][y1] != newArr[x2][y2]) && (newArr[x2][y2] != '0');

	}
}

// 标题：穿越雷区
//
// X星的坦克战车很奇怪，它必须交替地穿越正能量辐射区和负能量辐射区才能保持正常运转，否则将报废。
// 某坦克需要从A区到B区去（A，B区本身是安全区，没有正能量或负能量特征），怎样走才能路径最短？
//
// 已知的地图是一个方阵，上面用字母标出了A，B区，其它区都标了正号或负号分别表示正负能量辐射区。
// 例如：
// A + - + -
// - + - - +
// - + + + -
// + - + - +
// B + - + -
//
// 坦克车只能水平或垂直方向上移动到相邻的区。
//
// 数据格式要求：
//
// 输入第一行是一个整数n，表示方阵的大小， 4<=n<100
// 接下来是n行，每行有n个数据，可能是A，B，+，-中的某一个，中间用空格分开。
// A，B都只出现一次。
//
// 要求输出一个整数，表示坦克从A区到B区的最少移动步数。
// 如果没有方案，则输出-1
//
// 例如：
// 用户输入：
// 5
/*
 * A + - + - 
 * - + - - + 
 * - + + + - 
 * + - + - + 
 * B + - + -
 */
//
// 则程序应该输出：
// 10
//
// 资源约定：
// 峰值内存消耗（含虚拟机） < 512M
// CPU消耗 < 2000ms
