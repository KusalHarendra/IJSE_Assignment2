import java.util.Scanner;

public class Q12 {
    public static void main(String [] args){
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter your age...");
        int age = scanner.nextInt();
        age = age + 3;
        System.out.println("New age = " + age);
    }
}
