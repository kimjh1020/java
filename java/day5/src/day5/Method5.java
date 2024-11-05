package day5;

import java.util.Scanner;

public class Method5 {
        
         
	public static void main(String[] args) {
		 
		Noodle noodle = new Noodle();
		 noodle.menu();
		 noodle.buy();
		 noodle.boil();
		 noodle.put();
		 noodle.sput();
		 noodle.egg();
		 noodle.eat();

	}
 
}
class Noodle{
	Scanner scan = new Scanner(System.in);
	public void menu() { 
		System.out.print("1.사온다\n2.물끓인다\n3.라면을 넣는다>>");
		int choice = scan.nextInt();
		if (choice ==1)
			buy();
		else if (choice ==2)
			boil();
		else if (choice ==3)
			put();
    System.out.println("-------------------");
	}
	public  void buy() {
		System.out.println("라면사오기");
	}
	public  void boil() {
		System.out.println("물을 끓인다");
	}
	public  void put() {
		System.out.println("면을 넣는다");
	}
	public  void sput() {
		System.out.println("스프를 넣는다");
	}
	public  void egg() {
		System.out.println("계란을 넣는다");
	}
	public  void eat() {
		System.out.println("맛있게 먹는다");
	}
}