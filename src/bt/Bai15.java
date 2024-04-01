package bt;

import java.util.Scanner;

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}

public class Bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập vào độ dài 3 cạnh của tam giác
            System.out.println("Nhập vào độ dài 3 cạnh của tam giác:");
            System.out.print("Cạnh 1: ");
            double side1 = scanner.nextDouble();
            System.out.print("Cạnh 2: ");
            double side2 = scanner.nextDouble();
            System.out.print("Cạnh 3: ");
            double side3 = scanner.nextDouble();

            // Kiểm tra điều kiện tam giác
            if (side1 <= 0 || side2 <= 0 || side3 <= 0 || side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
                throw new IllegalTriangleException("Độ dài cạnh không hợp lệ. Vui lòng kiểm tra lại.");
            }

            System.out.println("Tam giác có các cạnh là " + side1 + ", " + side2 + ", " + side3 + " hợp lệ.");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

