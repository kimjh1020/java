package chapter2_1;

public class Classmade {

	public static void main(String[] args) {
		//1.클래스 Friend 객체의 생성문을 쓰시오.
		Friend f1 =new Friend();
		//2.1번에서 만든 객체정보를 출력하시오.
		System.out.println("1:"+f1.toString());
		//3. 객체에 각 변수에 맞는 값을 할당하시오.
		f1.no =1; //값을 대입 = 연산자
		f1.name="kimmaldong";
		f1.when ="동네친구";
	    f1.story="동화유치원 6살때 동기";
	    System.out.println("2:"+f1.toString());
	}//main

	
	}

//class
class Friend{ //자바가상머신 Friend()만들어줌 
	int no;//no  맴버변수
	String name;//name
	String when;//when
	String story;//story
	@Override
	public String toString() {
		return "Friend [no=" + no + ", name=" + name + ", when=" + when + ", story=" + story + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}


