package bt;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo biến và nhập dữ liệu
        int n;
        while (true) {
            try {
                System.out.print("Nhập số Fibonacci thứ n: ");
                n = Integer.parseInt(scanner.nextLine());
                if (n <= 0) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Hãy nhập một số nguyên dương.");
            }
        }

        // Bước 3: Tính số Fibonacci thứ n
        int fibonacciN = calculateFibonacci(n);

        // Bước 4: Hiển thị kết quả
        System.out.println("Số Fibonacci thứ " + n + " là: " + fibonacciN);

        // Bước 5: Kết thúc chương trình
        scanner.close();
    }

    // Hàm tính số Fibonacci thứ n
    private static int calculateFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int fibonacciMinusTwo = 1;
        int fibonacciMinusOne = 1;
        int fibonacciN = 0;
        for (int i = 3; i <= n; i++) {
            fibonacciN = fibonacciMinusTwo + fibonacciMinusOne;
            fibonacciMinusTwo = fibonacciMinusOne;
            fibonacciMinusOne = fibonacciN;
        }
        return fibonacciN;
    }
}

