package 初赛2014.猜字母;


/*标题：猜字母

    把abcd...s共19个字母组成的序列重复拼接106次，得到长度为2014的串。

    接下来删除第1个字母（即开头的字母a），以及第3个，第5个等所有奇数位置的字母。

    得到的新串再进行删除奇数位置字母的动作。如此下去，最后只剩下一个字母，请写出该字母。

答案是一个小写字母，请通过浏览器提交答案。不要填写任何多余的内容。*/

public class Main {
	public static void main(String[] args){
		 StringBuffer str = new StringBuffer("abcdefghijklmnopqrs");  
	     StringBuffer str1 = new StringBuffer("");  
	      
	  
	        for (int i = 0; i < 106; i++) {  
	            str1.append(str);  
	        }  
	        System.out.println("原始字符串为："+str1);
	  
	        while (str1.length() != 1) {  
	  
	            for (int i = 0; i < str1.length(); i += 2) {  
	                str1.setCharAt(i, '\0');  
	  
	            }  
	        
	            for (int i = 0; i < str1.length(); i++) {  
	                  
	                if (str1.charAt(i) == '\0') {  
	                  
	                    str1.deleteCharAt(i);  
	  
	                }                 
	            }  
	            
	        
	              
	            System.out.println("剩余字符串长度："+str1.length());  
	            System.out.println("剩余字符串为："+str1);  
	          
	    }  
	}    
}
