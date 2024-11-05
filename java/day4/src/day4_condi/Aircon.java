package day4_condi;

public class Aircon {

	public static void main(String[] args) { //시작메소드
		//리턴타입 
		//함수호출(메소드호출)
        int temp =23;
        turnOn(temp); 
        
        buybeer(19);
	}
    public static void turnOn(int temp) {
    	if(temp>25) {
    		System.out.println("현재온도:"+temp+"애어컨동작중");	
    	}//if
    	else System.out.println("가을온도여서 에어컨 동작안함");
    }//turnOn
   public static void buybeer(int age) {
	   if(age>=19)
		   System.out.println("맥주구매가능");
	   else
		   System.out.println("맥주구매불가");
   }
}//class
