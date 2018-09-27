package Assignment3;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
       Scanner a=new Scanner(System.in);
       String target=a.nextLine();
       String words[]=target.trim().split("\\s++");
       for(int i=words.length-1;i>0;i--) {
    	   
    	   System.out.print(words[i]+" ");
       }
       System.out.print(words[0]);
	}
	}

}
