package 动态规划.非降子串;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={5,3,4,8,6,7};
		dp(arr);
	}

	private static void dp(int[] arr) {
		// TODO Auto-generated method stub
		int min[]=new int[arr.length+1];
		min[0]=1;
		for(int i=1;i<=arr.length;i++)
		{
			min[i]=i;
			for(int j=0;j<i;j++)
			{
				if(arr[i]>min[i])
				{
					
				}
			}
		}
	}
}
