//Demonstrating access control 

class Test {

    int a;
    public int b ;
    private int c ;
    int acc(int i){
        c = i;
        return c;
    }

}
class AccTest {
    public static void main(String[] args) {
        Test obj = new Test();
        int result = obj.acc(36);
        obj.a = 12;
        obj.b = 24;

        System.out.println("a = "+obj.a);
        System.out.println("b = "+obj.b);
        System.out.println("c = "+result);
    }
}
