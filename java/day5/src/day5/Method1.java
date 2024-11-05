package day5;//공동프로젝트 하면서 클래스 이름, 공유변수등의 이름 충돌을 막기 위해
 
public class Method1 {//부모

	public static void main(String[] args) {//자식1
		int result=square(4);  
		System.out.println("sqaure(4) ="+result);
		System.out.println("sqaure(4) ="+square(4));
		System.out.println("Math.abs(-100)="+Math.abs(-100));
		result=Math.max(2, 7);
		System.out.println("Math.max(2,7):"+result);
		result=Math.min(2, 7);
		System.out.println("Math.min(2,7):"+result);  //매개변수
		System.out.println("-----------------------------");
		 result =area(5,120);
		 System.out.println("area(5,120):"+ result);
		 
		 result =add(4,5);
		 
		 result =sub(50,3);
		 

	}//main
	private static int sub(int i, int j) {
	 
	return i-j;
     }
	private static int add(int i, int j) {
	
	return i+j;
      }
	public static int area(int w, int h) {
		int square =w*h;
		
		return square;
		
		
	}
	
	
   public static int square(int n) {//자식2 n은 파라미터
	   
	   return n*n;
   }//square
}//class
