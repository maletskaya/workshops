import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = InputData.getAge(scanner);
        String name = InputData.getName(scanner);

//        System.out.println("My name is" + " " + name + " " + "and I amd " + age + " " + "years old");
//        InputData.getReverseArray(scanner);
        InputData.getArrays(scanner);


    }

}