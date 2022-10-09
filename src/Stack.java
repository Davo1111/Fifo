public class Stack {
    int stck [];
    int tos;
    Stack (int n){
        tos = -1;
        this.stck = new int[n];
    }
    void push (int item){
        if (tos== stck.length - 1)
            System.out.println("stack is full");
        else
            stck [++tos] = item;

    }
    int pop (){
        if (tos < 0) {
            System.out.println("stack underflow");
            return 0;
        }
        else
            return stck [tos --];
        }

    public static void main(String[] args) {
        Stack stack = new Stack(2);
        stack.push(50);
        stack.push(78);
        stack.push(88);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }


    }


