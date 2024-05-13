package day2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
//        Xây dựng một ứng dụng cho phép người dùng nhập vào 1 số tự nhiên
//        và kiểm tra xem số đó có chia hết cho 3 và 5 hay không
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập vào 1 số bất kỳ");
        int number = Integer.parseInt(sc.nextLine());
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.printf("Số bạn nhập %d là số chia hết cho 3 và 5", number);
        } else {
            System.out.printf("Số bạn nhập %d là số không chia hết cho 3 và 5", number);
        }
    }
}

