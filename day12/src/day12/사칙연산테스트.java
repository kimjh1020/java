package day12;

public class 사칙연산테스트 {

	public static void main(String[] args) {
		사칙연산 정수 =new 사칙연산(3,4);
		사칙연산 실수 =new 사칙연산(6,7);

	}

}
class 사칙연산{
	int num1;
	int num2;
	public 사칙연산(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
		}
    public int add(int num1, int num2) {
    	return num1+num2;
    	
    
	
}
    
	public int getNum1() {
		return num1+num2;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	@Override //재정의 Object가 있는 메소드 내입맛에 맞게 바꾸는것
	public String toString() {
		return "사직연산 [num1="+num1+", num2="+num2+"]";
	}
}
