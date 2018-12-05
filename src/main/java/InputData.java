import java.util.Scanner;

public class InputData {


    public int getAge(Scanner scanner) {
        try {
            System.out.println("Enter your age");
            String age = scanner.nextLine();
            return Integer.parseInt(age);
        } catch (Exception e) {
            return getAge(scanner);
        }
    }

    public String getName(Scanner scanner) {
        try {
            System.out.println("Enter your name");
            String name = scanner.nextLine();
            if (!name.matches("[a-zA-Z]+")) {
                throw new Exception("Name contains not only letters");
            }
            return name;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return getName(scanner);

        }
    }
}
