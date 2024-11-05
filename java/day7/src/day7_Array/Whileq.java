package day7_Array;

import java.util.Scanner;

public class Whileq {

	public static void main(String[] args) {
	  //1. 키보드로 입력값을 받아옴
      Scanner scan =new Scanner(System.in);
      //2. data라는 변수에 키보드로 받아온 변수를 넣으시오.
      
      while(true) {
    	  System.out.print("data>>");
    	  String data =scan.next();
      if(data.equals("q")) {
    	  break;
      }else {
    	  System.out.print(data);
      }
      }
    int n =1;
    while (n>4) {
    System.out.println(n);
    n++;
    }
    System.out.println(n);
      
	}

}
