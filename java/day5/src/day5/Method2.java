package day5;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("반지름>>");
		double r=scan.nextDouble();
		System.out.print("높이>>");
		double h =scan.nextDouble();
		double v =volume(r, h);
		System.out.println("원기둥의 부피:"+v);
		//System.out.printf("원기둥의 부피:%.3f"+v);

	}

	public static double volume(double r, double h) {
		double areav=Math.PI*r*r*h;
		return areav;
	}

}
