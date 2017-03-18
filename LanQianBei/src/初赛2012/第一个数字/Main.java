package 初赛2012.第一个数字;

public class Main {
	public static void main(String[] args) {
		String s = "82445adb5" ;
		
		System.out.println(new Main().getFirstNum(s));
		
	}
	
	public static int getFirstNum(String s)
	{
		if(s==null || s.length()==0) return -1;
		
		char c = s.charAt(0);
		if(c>='0' && c<='9') return c-'0';  //填空
		return getFirstNum(s.substring(1, s.length()-1));  //填空
	}

}
	/*以下的静态方法实现了：把串s中第一个出现的数字的值返回。
如果找不到数字，返回-1

例如：
s = "abc24us43"  则返回2
s = "82445adb5"  则返回8
s = "ab"   则返回-1   

public static int getFirstNum(String s)
{
	if(s==null || s.length()==0) return -1;
	
	char c = s.charAt(0);
	if(c>='0' && c<='9') return _____________;  //填空
	
	return ___________________;  //填空
}

请分析代码逻辑，并推测划线处的代码。*/