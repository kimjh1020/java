package section1;

import java.util.*;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		String name; //변수선언
		//오늘의 날짜를 보이고 싶어요
		Date day =new Date();
		System.out.println("today:"+day); 
		name ="한재희";
		System.out.print("name>>");
		Scanner scan =new Scanner(System.in);
		name =scan.next();
		System.out.println("name:"+name);
        //주소를 입력받아 출력하는 명령문을 완성하시오.
		System.out.print("juso>>");
		String juso =scan.next();
		System.out.println("juso:"+juso);
	}

}
