public class Fifo {
    int [] Stack;
    int Input;
    int Output;

    Fifo (int n ){
        Stack = new int[n];
        Input = -1;
        Output = -1;

    }
    void addItem (int item){
        if (Input == Stack.length - 1) {
            System.out.println("Stack is full");
        }else {
            Stack[++Input] = item;
        }
    }
    int getItem(){
        if (Output == Input){
            System.out.println("Stack is empty");
            return 0;
        }
        return Stack[++Output];
    }
}
class Fifo1{
    public static void main(String[] args) {
        Fifo Object =  new Fifo(6);

        Object.addItem(1);
        Object.addItem(2);
        Object.addItem(3);
        Object.addItem(4);
        Object.addItem(5);
        Object.addItem(6);


        System.out.println(Object.getItem());
        System.out.println(Object.getItem());
        System.out.println(Object.getItem());
        System.out.println(Object.getItem());
        System.out.println(Object.getItem());
        System.out.println(Object.getItem());
    }
}
