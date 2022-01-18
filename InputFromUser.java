package assignment;

import java.util.Scanner;

public class InputFromUser {
	
	public static void main(String  args[]) {
		int big =0, small =0, receive;
		String s;
		System.out.println("Enter the numbers:");
		
		Scanner scan = new Scanner(System.in);
		
		do {
			receive = scan.nextInt();
			
			if(big < receive) {
				big = receive;
			}
			
			if(receive < small) {
				small = receive;
			}
			//s=scan.next();
			//System.out.println(s);
			//if(s == "nope")
		    // break;
			//else
			 
		}while(!scan.hasNext("n"));
	System.out.println("Biggest number: " + big);
	System.out.println("Smallest number: " + small);
	
	}
	
	
}
