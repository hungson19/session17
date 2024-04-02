package bt;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập dữ liệu
        System.out.print("Nhập số bị chia: ");
        int dividend = scanner.nextInt();
        System.out.print("Nhập số chia: ");
        int divisor = scanner.nextInt();

        try {
            // Bước 2: Xử lý ngoại lệ
            if (divisor == 0) {
                throw new ArithmeticException("Lỗi: Số chia không thể là 0.");
            }

            // Bước 3: Thực hiện phép chia
            int result = dividend / divisor;

            // Bước 4: Hiển thị kết quả
            System.out.println("Kết quả phép chia: " + result);
        } catch (ArithmeticException e) {
            // Xử lý ngoại lệ: Số chia bằng 0
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


