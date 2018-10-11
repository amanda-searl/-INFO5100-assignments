package Assignment3;

//score 2/2
import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
       Scanner a=new Scanner(System.in);
       String target=a.nextLine();
       String words[]=target.trim().split("\\s++");
       for(int i=words.length-1;i>0;i--) { // should be i>=0
    	   
    	   System.out.print(words[i]+" ");
       }
       System.out.print(words[0]);
	}
	}

}
