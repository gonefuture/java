package 动态规划.找零钱;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dp(100);
	}

	private static void dp(int num) {
		int valuesKinds[]={1,2,5,10};
		int min[]=new int[num+1];
		for(int i=1;i<=num;++i)
		{
			min[i]=i;
			for(int kind=0;kind<valuesKinds.length;++kind)
			{
				if(valuesKinds[kind]<=i)
				{
					int temp=min[i-valuesKinds[kind]]+1;
					if(temp<min[i])
					{
						min[i]=temp;
					}
				}
			}
		}

		System.out.println(min[num]);
	}
}
