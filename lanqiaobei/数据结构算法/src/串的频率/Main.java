package 串的频率;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chs="abcabcabc".toCharArray();
		for (int i = 1; i <= chs.length; i++) {
			if(chs.length%i==0)
			{
				for (int j = i; j < chs.length; j++) {
					boolean isOk=true;
					if(chs[j]!=chs[j%i])
					{
						isOk=false;
						break;
					}
					if(isOk)
					{
						System.out.println(i);
						break;
					}
				}
			}
		}
	}

}
