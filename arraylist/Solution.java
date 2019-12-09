package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Faculty> arrayList = new ArrayList<>();
        System.out.println("Enter the details of Faculty accordingly : ");
        for (int i = 0; i < 2; i++) {
            System.out.println("--------------------------------------------------");
            System.out.print("ID : ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name : ");
            String name = scanner.nextLine();
            System.out.print("Email ID : ");
            String email = scanner.nextLine();
            System.out.print("Contact : ");
            long mobile = scanner.nextLong();
            scanner.nextLine();
            System.out.println("--------------------------------------------------");
            System.out.println();
            System.out.println();
            Faculty faculty = new Faculty(id,name,email,mobile);
            arrayList.add(faculty);
        }
        for (Faculty arrayList1 : arrayList) {
            System.out.println(arrayList1);
        }
        scanner.close();
    }
}
