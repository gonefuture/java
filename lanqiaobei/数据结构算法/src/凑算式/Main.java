package 凑算式;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int a=1;a<=9;a++)//a
		{
			for(int b=1;b<=9;b++)//b
			{
				if(b==a)
					continue;
				for(int c=1;c<=9;c++)//c
				{
					if(c==a||c==b)
						continue;
					for(int d=1;d<=9;d++)//d
					{
						if(d==a||d==b||d==c)
							continue;
						for(int e=1;e<=9;e++)//e
						{
							if(e==a||e==b||e==c||e==d)
								continue;
							for(int f=1;f<=9;f++)//f
							{
								if(f==a||f==b||f==c||f==d||f==e)
									continue;
								for(int g=1;g<=9;g++)//g
								{
									if(g==a||g==b||g==c||g==d||g==e||g==f)
										continue;
									for(int h=1;h<=9;h++)//h
									{
										if(h==a||h==b||h==c||h==d||h==e||h==f||h==g)
											continue;
										for(int i=1;i<=9;i++)//i
										{
											if(i==a||i==b||i==c||i==d||i==e||i==f||i==g||i==h)
												continue;
											if ((a+((double)b/c)+((double)(d*100+e*10+f)/(g*100+h*10*i)))==10) {
												count++;
												//System.out.printf("a=%d,b=%d,c=%d,d=%d,e=%d,f=%d,g=%d,h=%d,i=%d\n",a,b,c,d,e,f,g,h,i);
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
		System.out.println(count);
	}

}
