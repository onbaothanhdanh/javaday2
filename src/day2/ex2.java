package day2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
//        Luyện tập sử dụng cú pháp switch cass
//        Xây dựng một ứng dụng cho phép người dùng nhập vào 1 số từ 0 => 9
//        và hiển thị cách đọc của số đó trên màn hình
//        VD: người dùng nhập vào 1 thì hiển thị “Số Một”
        Scanner sc = new Scanner(System.in);
        int number1;
        do {
            System.out.println("Mời bạn nhập 1 số từ 1 đến 9");
            number1 = Integer.parseInt(sc.nextLine());
            switch (number1) {
                case 1:
                    System.out.println("Số bạn nhập vào là số Một");
                    break;
                case 2:
                    System.out.println("Số bạn nhập vào là số Hai");
                    break;
                case 3:
                    System.out.println("Số bạn nhập vào là số Ba");
                    break;
                case 4:
                    System.out.println("Số bạn nhập vào là số Bốn");
                    break;
                case 5:
                    System.out.println("Số bạn nhập vào là số Năm");
                    break;
                case 6:
                    System.out.println("Số bạn nhập vào là số Sáu");
                    break;
                case 7:
                    System.out.println("Số bạn nhập vào là số Bảy");
                    break;
                case 8:
                    System.out.println("Số bạn nhập vào là số Tám");
                    break;
                case 9:
                    System.out.println("Số bạn nhập vào là số Chín");
                    break;
                default:
                    System.out.println("Bạn phải nhập số nguyên từ 1 đến 9, hãy nhập lại");
            }
        } while (number1 < 1 || number1 > 9);

    }
}



