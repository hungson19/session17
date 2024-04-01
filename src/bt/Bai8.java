package bt;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo biến và nhập dữ liệu
        int number;
        while (true) {
            try {
                System.out.print("Nhập số cần kiểm tra: ");
                number = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Hãy nhập một số nguyên.");
            }
        }

        // Bước 2: Kiểm tra điều kiện số không phải số nguyên tố
        if (number < 2) {
            System.out.println("Lỗi: Số cần kiểm tra phải lớn hơn hoặc bằng 2.");
            scanner.close();
            return;
        }

        // Bước 3: Kiểm tra tính số nguyên tố
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Bước 4: Hiển thị kết quả
        if (isPrime) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + " không phải là số nguyên tố.");
        }

        // Bước 5: Kết thúc chương trình
        scanner.close();
    }
}

