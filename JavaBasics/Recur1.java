class Factorial {
	//This is a recursive method(which can call itself)
	int fact(int n) {
		int result;
		
		if(n==1) return 1;
		result = fact(n-1) * n;
		return result;
	}
}
class Recursion {
	public static void main(String args[]) {
		Factorial f = new Factorial();
		
		System.out.println("Factorial of 8 is : "+f.fact(8));
	}
}
