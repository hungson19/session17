package bt;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        // Khởi tạo mảng
        int[] arr = new int[n];

        // Nhập các phần tử của mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            try {
                arr[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage() + ". Bỏ qua phần tử này.");
                // Bỏ qua phần tử không phải số nguyên
                scanner.nextLine(); // Đọc và loại bỏ dữ liệu không hợp lệ
            }
        }

        // Tính tổng của các phần tử hợp lệ
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Hiển thị tổng
        System.out.println("Tổng của các phần tử là: " + sum);

        // Đóng Scanner
        scanner.close();
    }
}

