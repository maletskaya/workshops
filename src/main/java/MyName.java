import java.util.Scanner;

public class MyName {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        InputData data = new InputData();


        int age = data.getAge(scanner);
        String name = data.getName(scanner);

        System.out.println("My name is" + " " + name + " " + "and I amd " + age + " " + "years old");

    }
}