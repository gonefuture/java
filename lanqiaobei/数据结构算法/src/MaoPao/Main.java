package MaoPao;

public class Main
{
	public static void main(String[] args)
	{
		int arr[]={12,11,10,9,8,7,6};
		int t=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
					
				}
			}
			System.out.print((i+1)+"->");
			for(int k=0;k<arr.length;k++)
			{
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
		
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
	}
}
