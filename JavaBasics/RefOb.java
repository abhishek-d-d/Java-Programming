class Test1 {
	int a;
	Test1(int i) {
		a = i;
	}
	
	Test1 incrByTen() {
		Test1 temp = new Test1(a+10);
		return temp;
	}
	
	
}
class RefOb {
	public static void main(String args[]) {
		Test1 ob1 = new Test1(3);
		Test1 ob2;
		
		ob2 = ob1.incrByTen();
		System.out.println("ob1.a : "+ob1.a);
		System.out.println("ob2.a : "+ob2.a);
		
		ob2 = ob2.incrByTen();
		System.out.println("After increament the new ob2.a is : "+ob2.a);
		
		
	}
}
