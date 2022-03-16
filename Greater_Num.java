package math;

import java.util.Scanner;

public class Greater_Num {
	
	public static void main(String[] args) {
		int a,b;
		
		Scanner c=new Scanner(System.in);
		
		System.out.print("Enter a number 1 = ");
		a = c.nextInt();
		System.out.print("Enter a number 2 = ");
		b= c.nextInt();
		
		if (a>b) {
			
			System.out.print("A is greater than B");
		}
		else {
			
			System.out.print("A is less than B");
			
		}
		
	}
}