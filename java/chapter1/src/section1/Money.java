package section1;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
		System.out.println("용돈입력>>");
		int money=scan.nextInt();
		int trafix; //교통비
		System.out.print("교통비>>");
		trafix =scan.nextInt();
		int lunch; //점심
		System.out.print("점심값>>");
		lunch =scan.nextInt();
		money=money-trafix-lunch;
		System.out.println("남은 잔액:"+money+"원");
		//돈쓰는 항목을 만들어서 입력받아 남은 용돈을 계산 프로그램을 완성하시오.
		
		
		
		
		

	}

}
