class Stack {
    private int stck[] = new int[50];
    private int top;
    //Initionalize top of stack
    Stack() {
        top = -1 ;
    }
    //Push an element into the stack 
    void push(int item) {
        if (top == 9)
            System.out.println("Stack is full");
        else
            stck[++top] = item;    
    }
    //poping an element out of the stack
    int pop(){
        if(top == -1) {
            System.out.println();
            System.out.println("Stack is empty");
            return 0;  
        }  
        return  stck[top--];    
    }
}
class AccCon {
    public static void main(String[] args) {
        Stack my_stck1 = new Stack();
        Stack my_stck2 = new Stack();

        //Pushing some elements into stacks

        for(int i = 0; i<10; i++) {
            my_stck1.push(i);
        }        
        for(int i = 0; i<30; i+=4) {
            my_stck2.push(i);
        }    
        //pop those numbers out of the stack 

        System.out.print("stack1 = ");
        for(int i=0;i<10;i++) {
            System.out.print(my_stck1.pop()+" , ");
        }
        System.out.println();
        System.out.print("stack2 = ");
        for(int i=0;i<10;i++) {
           System.out.print(my_stck2.pop()+" , ");
        }

    }   
}
