package day7_Array;

public class Hap {

	public static void main(String[] args) {//횟수 알때
		int sum =0;
		for(int i =1; i<=10;i++) {
			sum = sum+i;
		}
        System.out.println("sum(1~10)="+sum);
      //위의 for문으로 while문으로
        sum=0;
        int i = 1;
        while (i <= 10) {// 횟수를 알거나 모를떄
            sum = sum + i;
            i++;
        }
        System.out.println("sum(1~10)="+sum);
	}

}
