package day2;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
//        [Bài tập] Hiển thị ra những số chia hết cho cả 3 và 5 trong khoảng từ 1 đến 100
//        Luyện tập vòng lặp cùng cấu trúc câu lệnh điều kiện if else
//        Hệ thống sử dụng vòng lặp chạy từ 1 đến 100
//        Sẽ sử dụng câu lệnh điều kiện để hiển thị
//        Nếu có thì hiển thị ra số đó
//        Nếu không tì không hiển thị ra gì cả
        System.out.println("Các số chia hết cho 3 và 5 là: ");
      for (int i=1; i<=100; i++){
          if (i % 3 == 0 && i % 5 == 0 )
              System.out.printf( "%d\t", i);
      }
    }
}
