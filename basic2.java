package JavaScaler;
import java.util.Scanner;
public class Basics102 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);

		// 0-100 5rs
		// 202-200 7rs
		// 201-300 10rs
		// 301-   15rs
		
		int bill = 280;
		int amount;		
		if(bill <= 100) {
			amount = bill * 5;
		}
		else if(bill <= 200) {
			amount = (100 * 5) + ((bill - 100) * 7);
		}
		else if(bill <= 300) {
			amount = (100 * 5) + (100 * 7)+ ((bill - 200) * 10);
		}
		else {
			amount = (100 * 5) + (100 * 7) + (100 * 10) + ((bill - 300) * 15);
		}
		
		System.out.println("The total money has to be paid is "+ amount);
		
		
		
		
		
		
		
	}
		
}
