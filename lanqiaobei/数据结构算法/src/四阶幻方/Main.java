package 四阶幻方;

import java.util.LinkedList;

public class Main {

	private static final int Element_NUM = 16;
	private static final int ROW = 4;
	private static final int COL = 4;
	private static LinkedList<Integer> set = new LinkedList<Integer>();
	private static int[][] arr = new int[ROW][COL];
	private static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arr[0][0]=1;
		set.add(1);
		dfs(0, 1);
	
		System.out.println(count);
	}

	/**
	 * 往数组放元素，回溯，剪枝
	 * @param row
	 * @param col
	 */
	private static void dfs(int row, int col) {

	
		for (int i = 1; i <= Element_NUM; i++) {

			if (!set.contains(i)) {
				arr[row][col] = i;
				set.add(i);
			} else
				continue;
			//生成元素时判断前3行是否符合条件,不符合重新生成---
			if (row == 0 && col == (COL-1 )) {
				
				if (getRowSum(0) != 34) {
					//print(true);
					arr[row][col]=0;
					set.removeLast();
					if (i==Element_NUM) {
						return;		
					}
					continue;
					
				}
			}
			if (row == 1 && col == (COL - 1)) {
				if (getRowSum(1) != 34) {
					arr[row][col]=0;
					set.removeLast();
					if (i==Element_NUM) {
						return;		
					}
					continue;
				}
			}
			if (row == 2 && col == (COL - 1)) {
				if (getRowSum(2) != 34) {
					arr[row][col]=0;
					set.removeLast();
					if (i==Element_NUM) {
						return;		
					}
					continue;
				}
			}
			//------------------------------
			if (col < COL - 1)
				dfs(row, col + 1);
			else if (row < ROW - 1 && col == COL - 1)
				dfs(row + 1, 0);

			//到达最后一个数
			if (row == ROW - 1 && col == COL - 1) {
				//判断该矩阵是否符合四阶幻方
				if(colIsReasonable()){
					count++;
				}
			}
			set.removeLast();
		}
	}

	/**
	 * 获取某行的所有元素之和
	 * @param row
	 * @return
	 */
	private static int getRowSum(int row) {
		int sum = 0;
		for (int i = 0; i < COL; i++) {
			sum += arr[row][i];
		}
		return sum;
	}

	/**
	 * 判断列和斜列是否合理
	 * @return
	 */
	private static boolean colIsReasonable() {
		int sum=0;
		//列,向下
		for (int i = 0; i < COL; i++) {
			for (int j = 0; j < ROW; j++) {
				sum+=arr[j][i];
			}
			if(sum!=34)
				return false;
			sum=0;
		}
		sum=0;
		//斜列,向右下
		for (int i = 0; i < COL; i++) {
				sum+=arr[i][i];
			
		}
		if(sum!=34)
			return false;
		sum=0;
		//斜列，向右上
		for (int i = COL-1; i >=0; i--) {
				sum+=arr[i][COL-1-i];
					
			}
		if(sum!=34)
			return false;
		
		return true;
	}
	
}
///**
// * 打印所有行，测试用
// * @param isConsole 是否在控制台输出，如果不是就写文件
// */
//private static void print(boolean isConsole){
//	final String FILE_NAME="test.log";
//	if(isConsole){
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//	}
//	else
//	{
//		File f=new File(FILE_NAME);
//		FileWriter fileWriter=null;
//		try {
//			if(f.exists())
//				f.delete();
//			 fileWriter=new FileWriter("test.txt",true);
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				fileWriter.write(arr[i][j] + " ");
//			}
//			fileWriter.write("\n");
//		}
//		fileWriter.write("\n");
//	
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}finally {
//
//		try {
//			fileWriter.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}

//把1~16的数字填入4x4的方格中，使得行、列以及两个对角线的和都相等，满足这样的特征时称为：四阶幻方。
//
//四阶幻方可能有很多方案。如果固定左上角为1，请计算一共有多少种方案。
//比如：
//  1  2 15 16
// 12 14  3  5
// 13  7 10  4
//  8 11  6  9
//
//以及：
//  1 12 13  8
//  2 14  7 11
// 15  3 10  6
// 16  5  4  9
// 
//就可以算为两种不同的方案

//***************************

//参考答案：
//416
//
//---------------------------
//点评：
//暴力破解即可。但是，用15层循环嵌套循环恐怕不可取。
//可以把1~16的数字放入数组中，用生成全排列的办法产生所有排列。
//再把数组中的数字对应到矩阵中，测试是否满足条件。
//
//这个解法如果不加修饰，可能会超时。
//此时需要注意剪枝。
//
//首先应该可以从守恒的角度计算出：行、列、对角线的和为：34
//然后: 
//第一行填完，就要验证此行的和是否为34
//第二行填完，就要验证此行的和是否为34
//...
//...
