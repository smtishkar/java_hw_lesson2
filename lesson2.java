import java.io.FileWriter;
import java.io.IOException;

/**
 * lesson2
 */
public class lesson2 {

    public static void main(String[] args) throws IOException {
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