package day4_1;

public class Casting {

	public static void main(String[] args) {
		//2-10
		String title ="로미오와 줄리엣";
		String author ="셰익스피어";
		int price =(int)5.94;//큰놈이 작은놈의 범위로 들어갈려면 강제 형변환 해야 함 (downcasting)
		double d=7;//작은놈은 큰 범위로 대입될떄 자동 형변환됨 (upcasting)
		System.out.println("d:"+d);
		
		//1
		int a = 5/2;
		System.out.println("a=5/2\n"+a); //몫
		double b =5/2;
		System.out.printf("double b:%.4f", b);

	}

}
