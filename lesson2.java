import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму
 */
public class lesson2 {

    public static void main(String[] args) throws IOException {
       
        int [] getDataArr = getData(args);
        if (getDataArr[0] == 0 && getDataArr[1] == 0){
            System.out.println("Не определено");
        } else{
            System.out.println(getDataArr[0] + " в степени " + getDataArr[1] + " равен = " + calc(getDataArr));
        }
        double result = calc(getDataArr);
        writeData(result,getDataArr);

    }

    public static int [] getData (String[] args) throws FileNotFoundException {
        int [] finalarr = new int[2];
        String path = "Input.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        ArrayList<String> data = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            data.add(scanner.nextLine());
        }
        String[] simpleArray = data.toArray(new String[] {});
        scanner.close();

        String str1 = simpleArray[0];
        String[] arrtemp1 = str1.split(" = ");

        String str2 = simpleArray[1];
        String[] arrtemp2 = str2.split(" = ");

        String atemp = null;
        String btemp = null;

        
        boolean express = Arrays.asList(arrtemp1).contains("a");
        if (express == true) {
            atemp = arrtemp1[1];
            btemp = arrtemp2[1];
        } else {
            btemp = arrtemp1[1];
            atemp = arrtemp2[1];
        }

        System.out.println("a = " + atemp);
        System.out.println("b = " + btemp);

        int a = Integer.parseInt(atemp);
        int b = Integer.parseInt(btemp);
        finalarr[0] = a;
        finalarr[1] = b;

        return finalarr;
    }

    public static double calc(int [] arr) {
        double result = Math.pow(arr[0], arr[1]);
        return result;

    }

    public static void writeData(double data, int []arr) throws IOException {
        
        try (final FileWriter writer = new FileWriter("file.txt", false)) {
            final String s = Double.toString(data);
            if (arr[0] == 0 && arr[1] == 0){
                writer.write("Не определено");
                writer.write(System.lineSeparator());
            }else{
                writer.write(arr[0] + " в степени " + arr[1] + " равен = " + s);
                writer.write(System.lineSeparator());
            }
;

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}