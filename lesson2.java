import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * lesson2
 */
public class lesson2 {

    public static void main(String[] args) throws IOException {
        String path = "Input.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        // String line = scanner.nextLine();
        // String[] words = line.split(" ");

        ArrayList<String> data = new ArrayList<String>() ;
        while (scanner.hasNextLine()){
            data.add(scanner.nextLine());
        }

        System.out.println(data);
        String[] simpleArray = data.toArray(new String[]{});
        System.out.println(Arrays.toString(simpleArray));
        scanner.close();

        String str1 = simpleArray[0];
        String [] arrtemp1 = str1.split(" = ");
        for (String ss1: arrtemp1 ){
            System.out.println(ss1);
        }
        System.out.println(Arrays.toString(arrtemp1));

        String str2 = simpleArray[1];
        String [] arrtemp2 = str2.split(" = ");
        for (String ss2: arrtemp2 ){
            System.out.println(ss2);
        }
        System.out.println(Arrays.toString(arrtemp1));
        System.out.println(Arrays.toString(arrtemp2));


        // String path = "Input.txt";
        // File file = new File(path);
        // Scanner scanner = new Scanner(file);
        // while (scanner.hasNextLine()){
        //     System.out.println(scanner.nextLine());
        // }
        // scanner.close();




        double a = 2;
        double b = 3;
        System.out.println(calc(a, b));
        double c = calc(a, b);
        // System.out.println(c);

        try (final FileWriter writer = new FileWriter("file.txt", false)) {
            final String s = Double.toString(c);
            writer.write(s);
            writer.write(System.lineSeparator());
            // System.out.println(s);
        }
        catch(IOException e) {
            System.out.println(e.getMessage());        
        }
    }

    public static double calc(Double a, Double b) {
        double result = Math.pow(a, b);
        return result;

    }

    

}