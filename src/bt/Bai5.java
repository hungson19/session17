package bt;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập dữ liệu và khai báo biến
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập giá trị cần tìm: ");
        int target = scanner.nextInt();

        // Bước 2: Sắp xếp mảng
        Arrays.sort(arr);

        // Bước 3: Thực hiện tìm kiếm nhị phân
        int result = binarySearch(arr, target);

        // Bước 4: Xử lý kết quả
        if (result == -1) {
            System.out.println("Không tìm thấy " + target + " trong mảng.");
        } else {
            System.out.println(target + " được tìm thấy tại vị trí " + result);
        }

        // Bước 5: Kết thúc chương trình
        scanner.close();
    }

    // Phương thức thực hiện tìm kiếm nhị phân
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Trả về vị trí nếu tìm thấy
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Trả về -1 nếu không tìm thấy
    }
}

