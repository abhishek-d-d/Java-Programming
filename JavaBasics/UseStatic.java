// Demonstrate static variables , method and block
public class UseStatic {
	static int a = 3;
	static int b;
	
	static void meth(int x) {
		System.out.println("X = "+x);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	
	static {
		System.out.println("Staticc block initialized");
		b = a * 4;
	}
	
	public static void main(String[] args) {
		meth(42);
	}
}
