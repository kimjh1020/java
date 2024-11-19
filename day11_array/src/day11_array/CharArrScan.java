package day11_array;

import java.util.Scanner;

public class CharArrScan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 1. 배열에 키보드로 받은 문자를 입력하시오.
       
        char[] charArr = new char[10]; //11-1배열선언
        
        
        // 2. while문으로 받아오되 'r' or 'R'이면 빠져나오시오.
        int i =0;
        while (true) {
            System.out.print("문자를 입력하세요: ");
            String str = scan.next();
            charArr[i] =str.charAt(0);
            System.out.print(charArr[i]+" ");
            
            
            if (charArr[i] == 'r' || charArr[i] == 'R') {
            	System.out.println("종료");
                break;
            }
            
        }
            
        
       
    }
}

