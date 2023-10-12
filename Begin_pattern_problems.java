package JavaScaler;

public class Begin_pattern_problems {
	
	public static void main(String[] args) {
		
		//p1
		// Square of N size
		// *
		int N = 5;
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//p2
		// right angle triangle with base down and left side
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//p3
		// right angle triangle with base up and left side
		
		for(int i = 0; i < N; i++) {
			for(int j = N-i; j >= 1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		//p4
	    // right angle triangle with base down and right side
		for(int i = 0; i < N; i++) {
			for(int j = N; j >= i; j--) {
				if(j < (N-(i+1))){
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		
	}

}
