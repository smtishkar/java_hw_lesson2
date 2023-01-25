import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.element.Element;

/**
 * lesson2
 */
public class lesson2 {

    public static void main(String[] args) throws IOException {
        String path = "Input.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        ArrayList<String> data = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            data.add(scanner.nextLine());
        }

        // System.out.println(data);
        String[] simpleArray = data.toArray(new String[] {});
        // System.out.println(Arrays.toString(simpleArray));
        scanner.close();

        String str1 = simpleArray[0];
        String[] arrtemp1 = str1.split(" = ");
        // for (String ss1 : arrtemp1) {
        // System.out.println(ss1);
        // }

        String str2 = simpleArray[1];
        String[] arrtemp2 = str2.split(" = ");
        // for (String ss2 : arrtemp2) {
        // System.out.println(ss2);
        // }
        System.out.println(Arrays.toString(arrtemp1));
        // System.out.println(Arrays.toString(arrtemp2));

        String a1 = null;
        String b1 = null;

        // for (int i = 0; i < arrtemp1.length; i++) {
        // if (arrtemp1[0] == "b") {
        // a1 = arrtemp1[1];
        // b1 = arrtemp2[1];
        // }
        // else {
        // a1 = arrtemp1[1];
        // b1 = arrtemp2[1];
        // }
        // }


        // for (int i = 0; i < arrtemp2.length; i++) {
        //     System.out.println(arrtemp2[i]);
        // }


        // if (arrtemp1[0] == "a") {
        //     System.out.println("a тута");
        // }

        System.out.println(arrtemp1[0]);
        System.out.println(arrtemp1[1]);

        boolean express = Arrays.asList(arrtemp1).contains("a");
        System.out.println(express);

        if (express == true){
            a1 = arrtemp1[1];
            b1 = arrtemp2[1];
        } else{
            b1 = arrtemp1[1];
            a1 = arrtemp2[1];
        }


        System.out.println(Arrays.asList(arrtemp1).contains("a"));
        // Arrays.asList(arrtemp1).contains("a");



        // for (int i = 0; i < arrtemp1.length; i++) {
        //     if (arrtemp1[0] == "a") {
        //         System.out.println("a тута");
        //     } else {
        //         System.out.println("нет");
        //     }
        // }

        // a1 = arrtemp1[1];
        // b1 = arrtemp2[1];

        System.out.println(a1);
        // System.out.println(b1);

        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);

        // System.out.println("a = " + a);
        // System.out.println("b = " + b);

        System.out.println(a + " в степени " + b + " равен - " + calc(a, b));
        double c = calc(a, b);

        try (final FileWriter writer = new FileWriter("file.txt", false)) {
            final String s = Double.toString(c);
            writer.write(s);
            writer.write(System.lineSeparator());
            // System.out.println(s);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calc(int a, int b) {
        double result = Math.pow(a, b);
        return result;

    }

}