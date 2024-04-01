package bt;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập vào chuỗi từ người dùng
        System.out.print("Nhập chuỗi: ");
        String originalString = scanner.nextLine();

        try {
            // Bước 2: Kiểm tra nếu chuỗi rỗng hoặc null
            if (originalString == null || originalString.isEmpty()) {
                throw new IllegalArgumentException("Chuỗi không hợp lệ.");
            }

            // Bước 3: Đảo ngược chuỗi
            String reversedString = reverse(originalString);

            // Bước 4: Hiển thị kết quả
            System.out.println("Chuỗi đảo ngược: " + reversedString);
        } catch (IllegalArgumentException e) {
            // Bước 5: Xử lý ngoại lệ
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            // Đóng Scanner
            scanner.close();
        }
    }

    // Phương thức để đảo ngược chuỗi
    private static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}

