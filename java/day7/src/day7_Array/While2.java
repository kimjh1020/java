package day7_Array;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		//1. 원하는 단을 키보드로 부터 입력받기
		Scanner scan =new Scanner(System.in);
	    System.out.println("dan>>");
	    int dan =scan.nextInt();
	    
	    //2. for문을 이용해서 구구단을 출력한다
	    for(int i =1; i<10; i++) {
	    	System.out.println(dan+"*"+i+"="+dan*i);
	    }
	    
		
		
		//countdown(5);

	}
	public static void countdown(int num) {//매개변수파라미터 가인수 형식인자
		System.out.println("countdown start");
		while(num>0) {
			System.out.println(num+"..");
			//빠져나갈조건
			num--;
		}
		System.out.println("발사!!!쓩");
	}

}
