// calling the static variables and methods from outside the class

class StaticDemo {
	static int a = 49;
	static int b = 99;
	
	static void callMe() {
		System.out.println("a = "+a);
	}
}
public class StaticByNames {
	public static void main(String[] args) {
		StaticDemo.callMe();
		
		System.out.println("b = "+StaticDemo.b);
	}
}
