import java.util.Scanner;

/**
 * Created by Oleg on 12.04.2016.
 */
public class InterractRunner {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calculator = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter first arg: ");
                String first = reader.next();
                System.out.println("Enter first arg: ");
                String second = reader.next();

                calculator.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Result : " + calculator.getResult());
                calculator.cleanResult();
                System.out.println("Exit yes/no");
                exit = reader.next();

            }
        } finally {
            reader.close();
        }
    }

}
