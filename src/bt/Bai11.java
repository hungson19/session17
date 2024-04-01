package bt;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập vào ngày, tháng, năm từ người dùng
        int day, month, year;
        System.out.print("Nhập ngày: ");
        day = scanner.nextInt();
        System.out.print("Nhập tháng: ");
        month = scanner.nextInt();
        System.out.print("Nhập năm: ");
        year = scanner.nextInt();

        try {
            // Bước 2: Kiểm tra tính hợp lệ của ngày tháng năm
            if (year <= 0 || month < 1 || month > 12 || day < 1 || day > getDaysInMonth(month, year)) {
                throw new IllegalArgumentException("Ngày tháng năm không hợp lệ.");
            }

            // Bước 3: Hiển thị thông báo nếu ngày tháng năm hợp lệ
            System.out.println("Ngày tháng năm hợp lệ.");
        } catch (IllegalArgumentException e) {
            // Bước 4: Xử lý ngoại lệ nếu ngày tháng năm không hợp lệ
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            // Đóng Scanner
            scanner.close();
        }
    }

    // Phương thức để lấy số ngày trong tháng
    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }

    // Phương thức kiểm tra năm nhuận
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

