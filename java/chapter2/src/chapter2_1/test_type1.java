package chapter2_1;// 반드시 첫줄에 위치

public class test_type1 { //public class 는 한파일에 한번만 써야함
	//맴버변수
      public static void main(String[] args) {
    	  Student s1 =new Student(); //default생성자 내맴버변수를 초기값할당을 위해 만든 메소드
    	  System.out.println("초기값은"+s1.toString());
    	  s1.name ="남기욱";
    	  s1.no =2024143005;
    	  s1.dept="AI2";
    	  System.out.println("할당후"+s1.toString());
    	  
    	  
      }//main
      
}//class 
class Student{//public class 쓸수없다. public접근자 삭제해야 함 
	int no;
	String name;
	String dept;
	@Override //아들이 자기식대로 만들떄 
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", dept=" + dept + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}