package abstractClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length and breadth of Rectangle : ");
        int length = scanner.nextInt();
        scanner.nextLine();
        int breadth = scanner.nextInt();
        Rectangle rectangle = new Rectangle(length,breadth);
        System.out.print(rectangle);
    }
}
