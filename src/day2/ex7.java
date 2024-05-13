package day2;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class ex7 {
//    Luyện tập sử dụng cấu trúc vòng lặp while
//    Trong phần này, chúng ta sẽ phát triển một ứng dụng nhiều chức năng cho phép người
//    dùng chọn chức năng để sử dụn
//    Menu gồm:
//    Kiểm tra tính chẵn lẻ của 1 số
//    Kiểm tra số nguyên tố
//    Kiểm tra một số có chia hết cho 3 không
//            Thoát

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số cần kiểm tra: ");
                    int number = scanner.nextInt();
                    number2check.check(number);
                    break;
                case 2:
                    System.out.print("Nhập số cần kiểm tra: ");
                    int primeNumber = scanner.nextInt();
                    primecheck.check(primeNumber);
                    break;
                case 3:
                    System.out.print("Nhập số cần kiểm tra: ");
                    int numberThree = scanner.nextInt();
                    numberthreecheck.check(numberThree);
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 4);
    }
}
