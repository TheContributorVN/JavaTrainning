package human.buoi9;

import java.util.Scanner;

public class Buoi9 {
    public static void main(String[] args) {
        // IF - IF-ELSE  - SWITCH
        // 1. IF
        // Cú pháp:
        // if ( <Điều kiện> ) {
        // Khối lệnh
        // }
        // Biểu thức điều kiện chỉ nhận 2 giá trị là đúng hoặc sai
        // Câu lệnh IF chỉ thực thi khi điều kiện đầu vào là true ( Đúng)
        boolean doiBung = true;
        if (doiBung == true ) {
            System.out.println("Cung cấp thức ăn");
        }
        // # Câu lệnh If-else
        // Cú pháp :
        /*
            if ( <Điểu kiện> ) {
                // Khối lệnh thực thi
                // Khi điều kiện đúng
            } else {
                // Khối lệnh thực thi khi điều kiện sai
            }
         */
        // Câu lệnh if-else là câu lệnh mở rộng cho câu lệnh If
        // Khi mà điều kiện đầu vào không phải là giá trị True
        // Thì else nhận nhiệm vụ thực thi các khối lệnh khi khi điều kiện
        // là False
        boolean thuHoach = false;
        // Kiểm tra xem có thu hoạch nông sản không
        if (thuHoach == true) {
            System.out.println("Đi thu hoạch thôi");
        } else {
            System.out.println("Nông sản chưa chín");
        }
        // Trường hợp bổ sung
        // Khi điều kiện đầu vào có giá trị khác true
        // Nhưng ta còn các trường hợp khác để xem xét điều kiện
        // Thì ở khối lệnh else ta có thể tiếp tục sử dụng cấu trúc
        // if-else
        // Ví dụ:
        // Kiểm tra điểm số của sinh viên
        // Sau đó ra xếp loại dựa trên điểm của sinh viên đó

        // Khai báo biến score đại diện cho điểm của sinh viên
        int score = 75;

        // Score trên 90 điểm thì sinh viên đó thuộc loại xuất sắc
        if (score >= 90) {
            System.out.println("Xuất sắc");
        } else {
            if (score >= 80) {
                System.out.println("Giỏi");
            } else if (score >= 65) {
                System.out.println("Khá");
            } else if (score >= 50) {
                System.out.println("Trung bình");
            } else {
                System.out.println("Yếu");
            }
        }
        // Output: Khá
        // Switch case
        //  Syntax :
        /*
            Switch (<Giá trị đầu vào>) {
                case <Gíá trị muốn so sánh>:
                    // Khối lệnh thực thi khi case thỏa mãn
                    // break;
                default:
                    // Khối lệnh thực thi nếu tất cả các case đều sai
         */
        // Số lượng của case trong cáu trúc switch là không có giới hạn
        // Trong mỗi case khi thỏa mãn case đó và thực thi xong khối lệnh
        // Cần dùng lệnh break; để thoát khỏi khối switch
        // Lệnh break có chức năng là thoát khỏi vòng lặp, khối switch
        // Khối switch bắt buộc phải có giá trị default
        int day = 100;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Thứ Hai";
                break;
            case 2:
                dayName = "Thứ Ba";
                break;
            case 3:
                dayName = "Thứ Tư";
                break;
            case 4:
                dayName = "Thứ Năm";
                break;
            case 5:
                dayName = "Thứ Sáu";
                break;
            case 6:
                dayName = "Thứ Bảy";
                break;
            case 7:
                dayName = "Chủ Nhật";
                break;
            default:
                dayName = "Không hợp lệ";
        }

        System.out.println("Hôm nay là: " + dayName);
        //  Output: Hôm nay là: Thứ Tư
        // Lớp Scanner
        // Lớp này giúp người dùng đưa input vào cho chương trình đang thực
        // thi
        // Syntax:
        /*
            Scanner <tên biến> = new Scanner(System.in);
            <tên biến.next<Kiểu>();
        */
        // Các giá trị đầu vào có thể nhập
        // nextInt => nhập nguyên
        // nextLong => //
        // nextDouble => //
        // nextLine => nhập vào một chuỗi
        // Ta có thể lưu gía trị được nhập vào từ console vào biến
        Scanner userInput = new Scanner(System.in);
        System.out.print("Vui lòng nhập vào một chuỗi: ");
        String chuoi = userInput.nextLine();
        System.out.println("Gía trị người dùng nhập " + chuoi);

    }
}