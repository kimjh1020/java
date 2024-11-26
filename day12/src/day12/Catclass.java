package day12;

import java.util.Scanner;

public class Catclass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//new 객체만드는 명령어
		//class object=new 생성자()( 3)(3,4)
       Cat whiteCat =new Cat();//1
       System.out.println(whiteCat.name);
       whiteCat.claw();
       whiteCat.claw(3);
       Cat blackCat =new Cat("검은 고양이");//2
       System.out.println(blackCat.name);
       blackCat.claw(5);
       Cat yellowCat =new Cat("yellowCat","시베리아종");
       yellowCat.claw(11);
	}//main

}//static class

class Cat{
	//1.맴버 변수
	String name;
	String breeds;
	double weight;
	
	//2.생성자
	public Cat() {name="하얀 고양이";}
	public Cat(String name) {
		this.name =name;
		
	}
	public Cat(String name,String breeds) {
		this.name=name;
		this.breeds =breeds;
	}
	
	//맴버메소드
	public void claw() {
		System.out.println("할퀴기");
	}
    public void claw(int level) {
    	System.out.println(name+"가(이)"+level+"정도로 할퀴기");
	}
}
