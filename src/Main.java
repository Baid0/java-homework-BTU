import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {


    public static void main(String[] args) {
        try {
            int[] arr = ConstructorStatic.readIntegersFromFile("numbers.txt");
            int sum = ConstructorStatic.sumArray(arr);
            System.out.println("მასივის ჯამი: " + sum);
        } catch (InvalidNumberException e) {
            System.err.println("არასწორი რიცხვი ფაილში: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("წაკითხვის შეცდომა: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("ჯამის დათვლის შეცდომა: " + e.getMessage());
        }
    }
}