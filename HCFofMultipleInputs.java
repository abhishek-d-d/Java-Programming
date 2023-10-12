package JavaScaler;
import java.util.Scanner;

public class HCFofMultipleInputs {
	
	//Write a program to input an integer T and then T lines each containing two
	//integers A & B from user and print T lines conatining HCF of two given 2
	//numbers A and B
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of HCF you want to calculate : ");
		int T;
		T = sc.nextInt();
		System.out.println(" Enter A and B to find their HCF");
		for (int i = 1; i <= T; i++) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			int hcf = 1;
			
			int sm;
			if(A > B) {
				sm = B;
			}
			else {
				sm = A;
			}
			for(int i1 = 1; i1 <= sm; i1++) {
				if((A % i1 == 0) && (B % i1 == 0)) {
					hcf = i1;
				}
			}
			System.out.println("The HCF of \nA : "+ A + " & B : "+ B +"\n : "+ hcf);
			System.out.println();
			
		}
		
		
		
		
		
		
	}

}
