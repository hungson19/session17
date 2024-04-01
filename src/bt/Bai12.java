package bt;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập vào hai số từ người dùng
        int number1, number2;
        System.out.print("Nhập số thứ nhất: ");
        number1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        number2 = scanner.nextInt();

        try {
            // Bước 2: Kiểm tra nếu cả hai số đều bằng 0
            if (number1 == 0 && number2 == 0) {
                throw new IllegalArgumentException("Cả hai số đều bằng 0.");
            }

            // Bước 3: Tìm ước chung lớn nhất (UCLN)
            int gcd = findGCD(number1, number2);

            // Bước 4: Hiển thị kết quả
            System.out.println("Ước chung lớn nhất của " + number1 + " và " + number2 + " là: " + gcd);
        } catch (IllegalArgumentException e) {
            // Bước 5: Xử lý ngoại lệ nếu cả hai số đều bằng 0
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            // Đóng Scanner
            scanner.close();
        }
    }

    // Phương thức để tìm ước chung lớn nhất của hai số
    private static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}

