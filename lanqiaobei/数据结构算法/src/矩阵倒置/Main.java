package 矩阵倒置;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
				
		};
		matrixTranspose(arr);
	}

	private static void matrixTranspose(int arr[][]) {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
		System.out.println();
		}
	}

	
}
