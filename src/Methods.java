public class Methods {
    boolean isFirstMax (int a , int b) {
        return (a > b );
    }
    }
    class object{
        public static void main(String[] args) {
            Methods myObject = new Methods();
            boolean answer = myObject.isFirstMax(44,10);
            System.out.println("Answer is " + answer);
        }
    }

