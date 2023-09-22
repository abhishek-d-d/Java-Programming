package JavaScaler;

public class Basics104 {
	public static void main(String[] args) {
		
		
		// WHILE - LOOP
		
		int cal = 0;
		while(cal < 50) {
			System.out.println("one cal");
			cal = cal + 1;
		}
		
		int n = 5;
		// Factorial
		
		int fact = 1;
		int i = 1;
		
		while(i <= n) {
			fact = fact * i;
			i = i + 1;
		}
		System.out.println(fact+" is the factorial.");
		
		// given 3i + 2 
		// give first 5 numbers
		
		int num = 0;
		int i = 1;
		
		while(i <= 5) {
			System.out.println((3 * i) + 2);
			i = i + 1;
		}
		
		// given 3i + 2 
		// give first n terms not multiple of 5
		
		int num = 0;
		int i = 1;
		
		while(i <= n) {
			num = 3*i + 2;
			if(num % 5 != 0) {
				System.out.println(num);
			}
			i = i+1;
		}		
		
		// 5 multiple of 5 which are not divisible by 3
		
		int i = 1;
		int num;
		int count = 0;
		while(count < 5) {
			num = i * 5;
			if(num % 3 != 0) {
				System.out.println(num);
				count = count + 1;
			}
			i = i+1;
		}
		
		
		
		
		
		
	}
}
