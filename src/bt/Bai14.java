package bt;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Bước 1: Nhập số lượng phần tử của mảng
            System.out.print("Nhập số lượng phần tử của mảng: ");
            int size = scanner.nextInt();

            // Bước 2: Kiểm tra điều kiện mảng rỗng
            if (size <= 0) {
                throw new IllegalArgumentException("Mảng không có phần tử.");
            }

            // Bước 3: Nhập giá trị cho mảng
            int[] arr = new int[size];
            System.out.println("Nhập giá trị cho từng phần tử của mảng:");
            for (int i = 0; i < size; i++) {
                System.out.print("Phần tử " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

            // Bước 4: Tính giá trị trung bình
            double sum = 0;
            for (int num : arr) {
                sum += num;
            }
            double average = sum / size;

            // Bước 5: Hiển thị kết quả
            System.out.println("Giá trị trung bình của mảng: " + average);
        } catch (IllegalArgumentException e) {
            // Bước 6: Xử lý ngoại lệ
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            // Bước 7: Đóng Scanner và kết thúc chương trình
            scanner.close();
        }
    }
}

