package day2;

import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int busCoats = 7000;
        float pay;
        System.out.print("Bạn hãy nhập tuổi của bạn, tôi sẽ tính số tiền bạn phải trả: ");
        int age = sc.nextInt();

        if (age < 6 || age > 60) {
            System.out.println("Vé bạn được miễn phí");
        } else if (age <= 18) {
            pay = busCoats / 2;
            System.out.println("Vé bạn được giảm 50%, bạn phải trả " + pay);
        } else {
            pay = busCoats;
            System.out.println("Vé bạn được miễn phí" + pay);
        }
    }
}
