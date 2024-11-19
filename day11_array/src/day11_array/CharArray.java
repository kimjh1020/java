package day11_array;

public class CharArray {

	public static void main(String[] args) {
      String name ="Kimjihun";
      System.out.println("name:"+name);
      //자신의 이름을 문자배열을 만들어 넣으시오.
      //char[] nameArr= {'a','b'};//'a' /"a" -->"a\0"
      char[] nameArr= name.toCharArray();
    for(int i=0;i<nameArr.length; i++) {
    	  System.out.println(nameArr[i]);
      }
      
		

	}//main

}//class
