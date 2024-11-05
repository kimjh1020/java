package day4_condi;

import java.util.Scanner;

public class While_if {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("정수만입력su>>");
			int su =scan.nextInt();
			if(su ==0) //조건의 맞으면 실행 (빠져나가기실행)
				break;
		}

	}

}
