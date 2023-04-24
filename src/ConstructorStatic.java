import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConstructorStatic {
    private ConstructorStatic() {

    }

    public static int[] readIntegersFromFile(String filename) throws IOException, InvalidNumberException {
        int[] result = new int[10];
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\lukab\\IdeaProjects\\untitled6\\src\\numbers.txt"));
        int i = 0;
        String line;
        while ((line = reader.readLine()) != null && i < 10) {
            try {
                int number = Integer.parseInt(line);
                if (number < 0) {
                    throw new InvalidNumberException("Number cannot be negative");
                }
                result[i] = number;
                i++;
            } catch (NumberFormatException e) {
                System.out.println("Not Integer");
            }
        }
        reader.close();
        return result;
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum < 0) {
            throw new ArithmeticException("Sum is negative");
        }
        return sum;
    }
}