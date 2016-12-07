package 三羊献瑞;

public class Main {
	public static void main(String[] args) {  
        //a在8-9的范围之间  
        for (int a = 8; a <= 9; a++) {  
            for (int b = 0; b <= 9; b++) {  
                for (int c = 0; c <= 9; c++) {  
                    for (int d = 0; d <= 9; d++) {  
                        //e为1  
                        for (int e = 1; e <= 1; e++) {  
                            //f在0-1的范围之间  
                            for (int f = 0; f <= 1; f++) {  
                                for (int g = 0; g <= 9; g++) {  
                                    for (int h = 0; h <= 9; h++) {  
                                        if (a != b && a != c && a != d && a != e && a != f && a != g && a != h && b != c && b != d && b != e  
                                                && b != f && b != g && b != h && c != d && c != e && c != f && c != g && c != h && d != e && d != f  
                                                && d != g && d != h && e != f && e != g && e != h && f != g && f != h && g != h)  
                                            if (((a * 1000 + b * 100 + c * 10 + d) + (e * 1000 + f * 100 + g * 10 + b)) == (e * 10000 + f * 1000 + c  
                                                    * 100 + b * 10 + h)) {  
                                                System.out.println((a * 1000 + b * 100 + c * 10 + d) + "      " + (e * 1000 + f * 100 + g * 10 + b)  
                                                        + "     " + (e * 10000 + f * 1000 + c * 100 + b * 10 + h));  
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
				
								/*
								 * 点评：
				规模小，可以暴力破解。
				未知数比较多，表达式筛选要仔细，条件容易写马虎了。
				如果用技巧，可以先确定几个未知数。
				比如：
				     ABCD
				   + EFGB
				  --------
				    EFCBHg
					
				根据加法的特点，E肯定是1，E与F不同，那F肯定是0。
				F是0，加上B，得C，肯定是接受了进位，并且本列没有向前进位。
				所以，A是9。这样剩下的未知数就没几个了。
								 */
