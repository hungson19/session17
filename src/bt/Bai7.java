package bt;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo biến
        int number1, number2;

        // Bước 2: Nhập dữ liệu
        while (true) {
            try {
                System.out.print("Nhập số nguyên thứ nhất: ");
                number1 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Hãy nhập một số nguyên.");
            }
        }

        while (true) {
            try {
                System.out.print("Nhập số nguyên thứ hai: ");
                number2 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Hãy nhập một số nguyên.");
            }
        }

        // Bước 4: So sánh và tìm số lớn nhất
        int max = Math.max(number1, number2);

        // Bước 5: Hiển thị kết quả
        System.out.println("Số lớn nhất là: " + max);

        // Kết thúc chương trình
        scanner.close();
    }
}

