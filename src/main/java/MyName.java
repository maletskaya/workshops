import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.util.Scanner;

public class MyName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



    }

    private static int getAge(Scanner scanner) {
        try {
            System.out.println("Put your age");
            String age = scanner.nextLine();
            return Integer.parseInt(age);
        } catch (Exception e) {
            return getAge(scanner);

        }
    }


}