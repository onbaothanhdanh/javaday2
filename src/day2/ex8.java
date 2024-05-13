package day2;

import java.util.Scanner;

public class ex8 {
    //    Xác thực dữ liệu sử dụng vòng lặp
//    Luyện tập sử dụng vòng lặp while
//    Trong phần này, chúng ta sẽ phát triển một ứng dụng cho phép người dùng
//    nhập vào 3 cạnh của một tam giác kiểm tra xem nếu 3 cạnh đấy thỏa mãn điều kiện trở thành
//    1 tam giác thì cho
//    phép tính diện tích và chu vi nếu không thì bắt người dùng nhập lại
//
//    Ba cạnh a, b, c của một tam giác phải thỏa mãn điều kiện là tổng hai cạnh bất kỳ luôn lớn hơn cạnh còn lại.
    static boolean isTriangle(double a, double b, double c) {
        return (a + b > c && a + c > b && b + c > a);
    }
    // Tính chu vi
    static double perimeter(double a, double b, double c) {
        return a + b + c;
    }
    // Tính diện tích
    static double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài các cạnh của tam giác:");
            System.out.print("Cạnh a: ");
            double a = scanner.nextDouble();
            System.out.print("Cạnh b: ");
            double b = scanner.nextDouble();
            System.out.print("Cạnh c: ");
            double c = scanner.nextDouble();

            if (isTriangle(a, b, c)) {
                double perimeter = perimeter(a, b, c);
                double area = area(a, b, c);
                System.out.printf("Tam giác có chu vi là %.2f\nDiện tích hình tam giác là %.2f\n", perimeter, area);
                break;
            } else {
                System.out.println("Ba cạnh này không tạo thành một tam giác. Vui lòng nhập lại.");
            }
        } while (true);
    }
}