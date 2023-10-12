package JavaScaler;

public class Basics105 {
	public static void main(String[] args) {
		
		// P1 
		// Given two numbers a and n find a^n
		
		int a1  = 19;
		int n1 = 6;
		int res1 = 1;
		while (n1 > 0) {
			res1 = res1 * a1;
			n1 = n1 - 1;
		}
		
		System.out.println(res1);
		System.out.println();
		System.out.println();
		System.out.println();

		
		// p2
		//Given a number print divisors of the number
		
		int a = 15;
		
		for(int i2 = 1; i2 <= 15; i2 = i2 + 1) {
			
			if(a % i2 == 0) {
				System.out.print(i2+", ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		//p3
		// Find GCD of two numbers
		
		int n31 = 34;
		int n32 = 18;
		int small3 ;
		if(n31 > n32) {
			small3 = n32;
		}
		else {
			small3 = n31;
		}
		int i3;
		int gcd = 0;
		for (i3 = 1; i3 <= small3; i3++) {
			if ((n31 % i3 == 0) && (n32 % i3 == 0)) {
				gcd = i3;
			}
		}
		System.out.println("GCD = "+ gcd);
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		
	}

}
