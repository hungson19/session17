import java.util.Scanner;

    // Định nghĩa ngoại lệ InvalidAgeException
    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public class VD1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập tuổi của bạn: ");
            int age = scanner.nextInt();

            try {
                checkVotingAge(age); // Kiểm tra tuổi bầu cử
                System.out.println("Bạn đã đủ tuổi bầu cử.");
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            } finally {
                scanner.close();
            }
        }

        // Phương thức kiểm tra tuổi bầu cử và ném ngoại lệ nếu tuổi không hợp lệ
        public static void checkVotingAge(int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Bạn chưa đủ tuổi bầu cử.");
            }
        }
    }

