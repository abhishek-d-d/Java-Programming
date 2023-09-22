package JavaScaler;

import java.util.Scanner;


public class Basics103 {
	public static void main(String[] args) {
		
		// Create Scanner
		Scanner sc = new Scanner(System.in);
		
		// code
		String fname = sc.next();
		String lname = sc.next();
		
		System.out.println(fname+", "+lname);
		
		float ab = sc.nextFloat();
		float a = 1.3f;
		System.out.println(String.format("%.3f", a));
		System.out.println();
		System.out.printf("%.3f",a);
		
		
		// Largest of A & B
		
		int A = 14;
		int B = 18;
		
		if(A > B) {
			System.out.println(A+" is larger.");
		}
		else {
			System.out.println(B+" is larger.");
		}
			
		// Even or not
		
		if(A % 2 == 0) {
			System.out.println(A+" is even.");
		}
		else {
			System.out.println(A+" is odd.");
		}
		
		// is divisible by 7
		
		if(A % 7 == 0) {
			System.out.println(A+" is divisible by 7.");
		}
		else {
			System.out.println(A+" is not divisible by 7.");
		}
		
		// last digit is 4 or not
		
		if(A % 10 == 4) {
			System.out.println(A+" has last digit as 4.");
		}
		else {
			System.out.println(A+" do not has last digit as 4.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
