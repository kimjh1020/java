package day12;

public class CarTest {

	public static void main(String[] args) {
		//객체를 생성하시오.
		Car kia5 =new Car("1234","현대","현대X",10000);
		kia5.run(30);
		String result =kia5.toString();
		System.out.println();
		
		
		result =kia5.toString();
		System.out.println(result);

	}

}
class Car {
	//맴버변수
	 String no;
	 String company;
	 String color;
	 int mile;
	
	//생성자
	public Car() {no ="0000";company="korea";color="white";}
	public Car(String no) {this.no=no;}
	public Car(String no, String company) 
	{this.no=no;this.company=company;this.color="black";}
	public Car(String no, String company, String color) 
	{this.no=no;this.company=company;this.color=color;}
	public Car(String no, String company, String color, int mile) 
	{this.no=no;this.company=company;this.color=color;this.mile=mile;}
	//파라미터가 4개인 생성자를 만드시오.
	//파라미터가 4개인 생성자가 파라미터 3개인 생성자를 호출하여 파라미터 4개인 생성자를 만드시오.
	
	//메소드
	public void run(int speed) {
		System.out.println(speed+"속도로 달린다");
	}
}

