import java.util.Scanner;

public class MyName {

    private static String name;
    private static String age;

    private static int getAge(Scanner scanner) {
        try {
            System.out.println("Enter your age");
            age = scanner.nextLine();
            return Integer.parseInt(age);
        } catch (Exception e) {
            return getAge(scanner);
        }
    }

    private static String getName(Scanner scanner) {
//        try {
            System.out.println("Enter your name");
            name = scanner.nextLine();
            if (name.matches("[A-Za-Z]")) {
                return name;
            } else {
                System.out.println("It's not a character");
            }

//        } catch (Exception e) {
//            return getName(scanner);
        return name;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = getAge(scanner);
        name = getName(scanner);

        System.out.println("My name is" + " " + name + " " + "and I amd " + age + " " + "years old");

    }
}