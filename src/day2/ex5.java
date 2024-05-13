package day2;

public class ex5 {
    //[Bài tập] Hiển thị các số nguyên tố nhỏ hơn 100
    //1. Mục tiêu:
    //
    //Luyện tập sử dụng cấu trúc lặp
    //2. Mô tả:
    //
    //Trong phần này chúng ta sẽ phát triển một ứng dụng cho phép hiển thị các số nguyên tố nhỏ hơn 100
    //
    //Số nguyên tố là một số nguyên dương chỉ chia hết cho 1 và chính nó

    //        Phân tích:
//        Số nguyên tố là tập hợp các số tự nhiên >1, chia hết cho 1 và chính nó.
//        Viết 1 hàm:
//            dùng if elese, nếu mà nỏ nhỏ hơn 1 thì loại luôn
//            cho 1 vòng vòng lặp chạy từ 2 đến căn bậc 2 của số num, nếu mà nó chia hết cho các số từ 2 đến
//            căn bậc đó thì false luôn
//            không chia hết cho 2 đến căn bậc 2 nó là nguyên tố
//
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");
        for (int num = 2; num < 100; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }


//        ex6: hiển thị 20 số nguyên tố đầu tiên
//        Tạo biến đếm count, dùng vòng lặp while cho nó đếm 20 lần
        int count = 0;
        int num = 2;
        System.out.println("\n20 số nguyên tố đầu tiên là:");
        while (count < 20) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}