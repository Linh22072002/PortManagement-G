package Model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Model.Admin.loadAdmins();


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Đăng nhập");
            System.out.println("2. Đăng ký");
            System.out.println("3. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    Model.Admin.login(scanner);
//                    Model.Admin.addContainer("C001", "Electronics", "Port A");
//                    Model.Admin.addContainer("C002", "Clothing", "Port B");
//                    Model.Admin.viewAllContainers();
                    break;
                case 2:
                    Model.Admin.register(scanner);
                    break;
                case 3:
                    Model.Admin.saveAdmins();
                    System.out.println("Tạm biệt!");
                    System.exit(0);
                default:
                    System.out.println("Tùy chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
