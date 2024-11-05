package day8_array;

public class starbucks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] coffee =new int[7]
		//coffee[0] =12;
		int[] coffee = {12,33,44,55,66,77,55};
		
		//총판매잔을 출력하시오
		int sum =coffee[0]+coffee[1]+coffee[2]+coffee[3]+coffee[4]+coffee[5]+coffee[6];
		System.out.println("총 잔수:"+sum);
		
		//판매금액을 출력하시오. 한잔당 2000원
		sum =sum*2000;
		System.out.println("총 매출:"+sum+"원");
		

	}

}
