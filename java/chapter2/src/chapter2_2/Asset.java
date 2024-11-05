package chapter2_2;

import java.util.Scanner;

public class Asset {

	public static void main(String[] args) {//변수선언시 소문자를 권장
		System.out.println("나의 총 자산금은?");
		Scanner scan =new Scanner(System.in);
	    System.out.print("일하는 시작나이를 입력하시오>>");
		int age=scan.nextInt();  //변수선언 한번만
		System.out.print("연봉을 입력하시오>>");
		int pay =scan.nextInt();
		int year=65-age;
		long asset=year*(pay);
		//asset =asset*5;
		System.out.println("당신의 총자산은 (66세 기준):"+asset+"금액");
	}

}
