package 填数字题;

public class Main
{
	public static void main(String[] args)
	{
		int arr[]=new int[6];
		for(int i1=1;i1<=12;i1++)
		{
			if(i1==1)continue;
			for(int i2=1;i2<=12;i2++)
			{
				if(i2==1||i2==8)continue;
				for(int i3=1;i3<=12;i3++)
				{
					if(i3==8)continue;
					for(int i4=1;i4<=12;i4++)
					{
						if(i4==8||i4==3)continue;
						for(int i5=1;i5<=12;i5++)
						{
							if(i5==1||i5==3)continue;
							for(int i6=1;i6<=12;i6++)
							{
								if(i6==1)continue;
								for(int i7=1;i7<=12;i7++)
								{
									if(i7==8||i7==3)continue;
									for(int i8=1;i8<=12;i8++)
									{
										if(i8==3)continue;
										for(int i9=1;i9<=12;i9++)
										{
											if(i9==1)continue;
											
											arr[0]=1+i1+i4+i6;
											arr[1]=1+i2+i5+i9;
											arr[2]=i6+i7+i8+i9;
											arr[3]=8+i1+i2+i3;
											arr[4]=8+3+i4+i7;
											arr[5]=3+i3+i5+i8;
											if(arr[0]==arr[1]
											&&arr[0]==arr[2]
											&&arr[0]==arr[3]
											&&arr[0]==arr[4]
											&&arr[0]==arr[5])
											{
												System.out.println(i4);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
