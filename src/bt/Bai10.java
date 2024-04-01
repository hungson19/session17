package bt;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo biến và nhập dữ liệu
        double radius;
        double area;
        while (true) {
            try {
                System.out.print("Nhập bán kính của hình tròn: ");
                radius = Double.parseDouble(scanner.nextLine());
                if (radius < 0) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Hãy nhập một số không âm.");
            }
        }

        // Bước 3: Tính diện tích hình tròn
        area = Math.PI * radius * radius;

        // Bước 4: Hiển thị kết quả
        System.out.println("Diện tích của hình tròn là: " + area);

        // Bước 5: Kết thúc chương trình
        scanner.close();
    }
}

