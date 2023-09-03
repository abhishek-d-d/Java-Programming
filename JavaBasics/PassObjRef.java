class Test {
	int a,b;
	
	Test(int i,int j) {
		a = i;
		b = j;
	}
	//Pass an Object
	void meth(Test o) {
		o.a *= 2;
		o.b /= 2;
	}
}

class PassObjRef {
	public static void main(String args[]) {
		Test ob = new Test(12,20);
		
		// before call
		System.out.println("ob.a and ob.b before call : "+ob.a+" , "+ob.b);
		
		//calling the method meth by passing object ob
		ob.meth(ob);
		
		//after call
		System.out.println("ob.a and ob.b after call : "+ob.a+" , "+ob.b);
	}
}
