package 三羊献瑞;

public class Main {
	public static void main(String[] args){
		for(int i=1000;i<10000;i++){
			for(int j=1000;j<10000;j++){
				for(int k=0;k<10;k++){
					if(i+j==(j/1000*10000 +j/100%10*1000 +i%100/10*100 +j%10*10 +k)){
						if( j%10==i/100%10 && k!=j/1000 && k!=j/100%10 && k!=i%100/10 && k!= j%10 && k!=j%100/10 && k!=1/1000 && k!=i%10 ){
							System.out.println("i是：");
							System.out.println(i);
							System.out.println("j是：");
							System.out.println(j);
							}
						}
				}
				
			}
		}
	}

}
