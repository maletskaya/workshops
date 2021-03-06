import java.util.Scanner;

public class InputData {


    public static int getAge(Scanner scanner) {
        try {
            System.out.println("Enter your age");
            String age = scanner.nextLine();
            return Integer.parseInt(age);
        } catch (Exception e) {
            return getAge(scanner);
        }
    }

    public static String getName(Scanner scanner) {
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

    public static void getReverseArray(Scanner scanner) {
        System.out.println("Put 10 digits");

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }

    public static void getArrays(Scanner scanner) {
        System.out.println("Put your array: 20 digits");

        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);

            }
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}

