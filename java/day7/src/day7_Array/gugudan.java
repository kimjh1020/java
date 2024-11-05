package day7_Array;

public class gugudan {

	public static void main(String[] args) {
	    int dan, i;
		System.out.println("단별 묶음으로 출력하기");
		for( i=1;i<10; i++) {
			for(dan =2; dan<10; dan++) {
				System.out.printf("%2d*%1d=%2d ",dan,i,dan*i);
			}
			//i
			System.out.println("");}
		
		System.out.println("단별 한줄로 출력하기");
		for(dan =2; dan<10; dan++) {
			System.out.print("["+dan+"]");
			for(i=1;i<10; i++) {
				System.out.printf("%2d*%1d=%2d",dan,i,dan*i);
			}//i
			System.out.println("");
		}//dan
		
		for(dan =2; dan<10; dan++) {
			System.out.println("----"+dan+"----");
			for(i=1;i<10; i++) {
				System.out.println(dan+"*"+i+"="+dan*i);
			}//i
		}//dan
		

	}//main

	}//class
