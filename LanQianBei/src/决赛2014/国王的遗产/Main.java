package 决赛2014.国王的遗产;

public class Main {
	public static void main(String[] args){
		 int sum = 4*5*6*7*8*9;  
	        int x = sum/4+sum/5+sum/6+sum/7+sum/8+sum/9;  
	        System.out.println(11*sum/(sum-x));  
	}

}
/***标题：国王的遗产

X国是个小国。国王K有6个儿子。在临终前，K国王立下遗嘱：国王的一批牛作为遗产要分给他的6个儿子。
其中，大儿子分1/4，二儿子1/5，三儿子1/6，....
直到小儿子分1/9。
牛是活的，不能把一头牛切开分。

最后还剩下11头牛，分给管家。

请计算国王这批遗产中一共有多少头牛。
***/