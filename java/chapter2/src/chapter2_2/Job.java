package chapter2_2;

import java.util.Scanner;

public class Job {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		//원하는 월급은 
		System.out.print("원하는 월급을 입력하시오>>");
		int money=Scan.nextInt();
		//원하는 거리
		System.out.print("원하는 거리를 입력하시오>>");
		int distance=Scan.nextInt();
		if(money>=300 && distance<=15)
		System.out.println("입사");
		else
		System.out.println("입사보류"); 

	}

}
