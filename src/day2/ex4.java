package day2;

import java.util.Scanner;

public class ex4 {
//    [Bài tập] Tính tổng các số chẵn trong khoảng cho trước
//    Luyện tập sử dụng cấu trúc vòng lặp for
//    Trong phần này, chúng ta sẽ phát triển một ứng dụng cho phép người dùng nhập vào 1
//    khoảng số tự nhiên và yêu cầu tính tổng các số chẵn nằm trong khoảng đó

//phân tích:
//    Người dùng nhập 2 số a và b
//    cho vòng lặp for chạy từ a đến b
//    Nếu %2 thi sum += i
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numberStart, numberEnd, sum;
    System.out.println("Mời bạn nhập vào số bắt đầu");
    numberStart=Integer.parseInt(sc.nextLine());
    System.out.println("Mời bạn nhập vào số kết thúc");
    numberEnd=Integer.parseInt(sc.nextLine());
    sum=0;
    for(int i=numberStart; i<=numberEnd; i++){
        if(i%2==0){
            sum+=i;
        }
    }
    System.out.printf("Tổng các số chẵn trong khoảng từ %d đến %d của bạn bằng %d",numberStart,numberEnd,sum );
}
}
