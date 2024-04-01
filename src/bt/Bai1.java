package bt;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo biến
        int num1, num2;

        // Bước 2: Lặp cho đến khi nhập đúng
        while (true) {
            try {
                // Nhập số thứ nhất
                System.out.print("Nhập số thứ nhất: ");
                num1 = Integer.parseInt(scanner.nextLine());

                // Nhập số thứ hai
                System.out.print("Nhập số thứ hai: ");
                num2 = Integer.parseInt(scanner.nextLine());

                // Nếu không có lỗi, thoát khỏi vòng lặp
                break;
            } catch (NumberFormatException e) {
                // Hiển thị thông báo lỗi nếu người dùng nhập không phải số nguyên
                System.out.println("Vui lòng nhập số nguyên.");
            }
        }

        // Bước 3: Tính tổng và hiển thị kết quả
        int sum = num1 + num2;
        System.out.println("Tổng hai số là: " + sum);

        // Bước 4: Kết thúc chương trình
        scanner.close();
    }
}
