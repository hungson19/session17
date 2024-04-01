package bt;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo biến và nhập dữ liệu
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        if (n == 0) {
            // Bước 2: Kiểm tra trường hợp mảng rỗng
            try {
                throw new Exception("Mảng không có phần tử nào.");
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
                return;
            }
        }

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Bước 3: Tìm số lớn nhất
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Bước 4: Hiển thị kết quả
        System.out.println("Số lớn nhất trong mảng là: " + max);

        // Đóng Scanner
        scanner.close();
    }
}
