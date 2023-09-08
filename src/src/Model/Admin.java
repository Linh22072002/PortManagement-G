package Model;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Admin {
    private static final String USER_FILE = "src/src/Model/Admin.txt";
    private static Map<String, String> users = new HashMap<>();
    public static final String CONTAINERS_FILE = "src/src/Model/container.txt";



    public static void loadAdmins() {
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    users.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            // Không làm gì cả nếu không tải được dữ liệu người dùng
        }
    }

    public static void saveAdmins() {
        try (FileWriter writer = new FileWriter(USER_FILE)) {
            for (Map.Entry<String, String> entry : users.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void login(Scanner scanner) {
        System.out.print("Nhập tên người dùng: ");
        String username = scanner.nextLine();
        System.out.print("Nhập mật khẩu: ");
        String password = scanner.nextLine();

        String storedPassword = users.get(username);
        if (storedPassword != null && storedPassword.equals(password)) {
            System.out.println("Đăng nhập thành công!");
        } else {
            System.out.println("Tên người dùng hoặc mật khẩu không đúng.");
        }
    }

    public static void register(Scanner scanner) {
        System.out.print("Nhập tên người dùng mới: ");
        String username = scanner.nextLine();
        if (users.containsKey(username)) {
            System.out.println("Tên người dùng đã tồn tại. Vui lòng chọn tên khác.");
            return;
        }
        System.out.print("Nhập mật khẩu mới: ");
        String password = scanner.nextLine();
        users.put(username, password);
        System.out.println("Đăng ký thành công!");
    }

    public static void addContainer(String containerID, String contents, String destination) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CONTAINERS_FILE, true))) {
            writer.write(containerID + "," + contents + "," + destination + "\n");
            System.out.println("Container đã được thêm vào tệp.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void viewAllContainers() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CONTAINERS_FILE))) {
            String line;
            int containerNumber = 1;

            System.out.println("Thông tin các containers:");
            while ((line = reader.readLine()) != null) {
                String[] containerInfo = line.split(",");
                if (containerInfo.length >= 3) {
                    String containerID = containerInfo[0];
                    String contents = containerInfo[1];
                    String destination = containerInfo[2];

                    System.out.println("Container " + containerNumber);
                    System.out.println("ID: " + containerID);
                    System.out.println("Nội dung: " + contents);
                    System.out.println("Đích đến: " + destination);
                    System.out.println();

                    containerNumber++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


