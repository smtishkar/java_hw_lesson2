import java.util.Arrays;

/**
 * test
 */
public class test {

    public static void main(String[] args) {
        int a = 2;
        int b = -2;
        double result = Math.pow(a, b);
        System.out.println(result);


        String[] arr = {"a", "2"};
        if (arr[0] == "a") 
        {
        System.out.println("Да");    
        }
        else{
        System.out.println("НЕТ");    
        }
        System.out.println(Arrays.toString(arr));

    }
}