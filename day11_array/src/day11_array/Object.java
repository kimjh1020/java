package day11_array;

public class Object { //파일의주인 클래스

	public static void main(String[] args) {
		job samsung=new Job();
		System.out.println(samsung.pay+":"+samsung.distance);
		job lg=new Job();
		System.out.println(lg.pay+":"+lg.distance);

	}
  class Job {
	  int  pay;
	  int distance;
	  public Job() {//맴버변수를 초기화
		  pay =300;
		  distance=30;
		  }
	  
  }
}
