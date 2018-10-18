import java.util.Scanner;

class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo1 {
    public static void main(String[] args) {
        int age;
        System.out.println("\nEnter your age: ");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        try {
            CustomExceptionDemo1 obj = new CustomExceptionDemo1();
            obj.validateAge(age);
        } catch(NegativeAgeException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("\nfinally block is always executed");
        }
    }

    public void validateAge(int age) throws NegativeAgeException {
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative " + age);
        } else {
            System.out.println("\nYou have entered valid age.");
        }
    }
}