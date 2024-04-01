package bt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        // Bước 2: Tạo một danh sách số nguyên
        List<Integer> numbers = new ArrayList<>();

        // Bước 3: Duyệt chuỗi và chuyển đổi thành số nguyên, xử lý ngoại lệ
        for (int i = 0; i < input.length(); i++) {
            try {
                int number = Integer.parseInt(String.valueOf(input.charAt(i)));
                numbers.add(number);
            } catch (NumberFormatException e) {
                // Xử lý ngoại lệ: Thay thế ký tự không phải số thành 0 và thông báo
                System.out.println("Ký tự không phải số được thay thế bởi 0.");
                numbers.add(0);
            }
        }

        // Hiển thị danh sách số nguyên đã xử lý
        System.out.println("Danh sách số nguyên sau khi xử lý ngoại lệ:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Đóng Scanner
        scanner.close();
    }
}

