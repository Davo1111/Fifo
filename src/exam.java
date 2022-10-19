import javax.naming.PartialResultException;

public class exam {
    public static int minValueArray(int [] array){
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }

}class examDemo{
    public static void main(String[] args) {
        int [] arr = {5,6,9,8,2,};
        System.out.println(exam.minValueArray(arr));

    }
}
