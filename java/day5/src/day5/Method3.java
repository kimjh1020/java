package day5;

public class Method3 {//로또번호생성하기

	public static void main(String[] args) {
		int num=0;
	    for(int i=1; i<=6; i++) { 
	    	num=lotto();
	    System.out.print(num+",");	
	    }
		for(int i =0; i<10; i++) {
			int num1=jusawi();
			System.out.print("주사위:"+num1);
		}
		
		}
	public static int lotto() {
		int lottosu =(int) (Math.random()*46);
		return lottosu;
		
	}
	public static int jusawi() {
		int jusu =(int)(Math.random()*6);
		return jusu;
	}

}
