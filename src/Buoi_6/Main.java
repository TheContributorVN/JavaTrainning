package Buoi_6;

public class Main {
    public static void main(String[] args) {
        // Tạo thư mục mkdir Tên thư mục
        // Đi vào trong thư mục vừa tạo bằng lệnh cd Tên thư mục
        // Tạo file Main bằng lệnh touch Main.java
        // Toán tử số học
        // +, - , *, /
        // Thì tương tự như lúc làm việc với số ở thế giới thực
        System.out.println(10 + 2);
        System.out.println(10 - 2);
        System.out.println(10 * 2);
        System.out.println(10 / 2);
        System.out.println(9 % 2); // 1 số  dư
        String stringA = "ABC";
        String stringB = "DEF";
        // Toán tử cộng chuỗi trong String thì sẽ nối 2 chuỗi lại với nhau
        System.out.println(stringA + stringB);
        // Toán tử gán
        // =, +=, -=, *=, /=, %=
        // Toán tử =
        // Cách hoạt động là gán giá trị phía bên phải dấu bằng cho giá trị/biến ở phái bên trái
        // Đối với các toán tử +=, -=, *=, /=, %=
        // Khi sử dụng ta thay đôi giá trị dựa theo dấu cảu toán tử với khoảng thay đổi là giá trị bên phải của toán tử
        // Ví dụ: 2 += 3 => 5
        int number = 100;
        // number = number + 100;
        number += 100; // 200
        System.out.println(number); // 200
        number -= 50;
        System.out.println(number); // 150
        number *= 2;
        System.out.println(number); // 300
        number /= 3;
        System.out.println(number); // 100
        number %= 3;
        System.out.println(number); // 1
        // Toán tử so sánh
        // Dùng để so sánh 2 giá trị với nhau
        // Các toán tử thuộc loại này là :
        // ==, != , >, < , >=, <=
        System.out.println(100 == 100); // true
        System.out.println(100 != 200); // true
        System.out.println(100 > 101); // false
        System.out.println(100 < 99); // false
        System.out.println(101 >= 100); // true
        System.out.println(99 <= 99); // true
        // Toán tử logic
        // Để có học bổng thì gpa kỳ trên 8.5
        // Điểm hoat động tốt > 90
        double gpa = 9.0;
        int diemChuyenCan = 95;
        System.out.print("Được phát học bổng : " );
        System.out.println(gpa >= 8.5 && diemChuyenCan >= 90);
        // Toán tử ||
        // Để tốt nghiệp thì phải làm đồ án hoặc
        // học môn thay thế đồ án
        boolean lamDoAn = true;
        boolean hocMonThayThe = false;
        System.out.println("Được tốt nghiệp : ");
        System.out.println(lamDoAn || hocMonThayThe);
        // Giả sử 2 bạn bạn đi chơi và uống nước
        // Long bảo nước ngon
        // Huy phủ định là nước không ngon
        boolean yKienCuaLong = true; // true là nước ngon
        System.out.println("Ý kiến của Huy : "); // false -> Nước không ngon
        System.out.println(!yKienCuaLong);
        ///
        // true && false && true
        // -> falseq;

    }
}