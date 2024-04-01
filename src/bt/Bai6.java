package bt;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập dữ liệu và khai báo biến
        System.out.print("Nhập số bị chia: ");
        int dividend = scanner.nextInt();

        int divisor;
        while (true) {
            System.out.print("Nhập số chia: ");
            divisor = scanner.nextInt();
            if (divisor != 0) {
                break;
            }
            System.out.println("Số chia không được bằng 0. Vui lòng nhập lại.");
        }

        // Bước 2: Xử lý ngoại lệ và thực hiện phép chia
        try {
            int result = dividend / divisor;
            System.out.println("Kết quả của phép chia là: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: Số chia không thể bằng 0.");
        }

        // Bước 5: Kết thúc chương trình
        scanner.close();
    }
}

