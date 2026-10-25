package human.buoi10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Hàm là gì ?
        // Chương trình chính là chương trình chứa hàm main
        // Cấu trúc định nghĩa hàm
        /* // Tạm thời là
            // luôn dùng public
            <Access modifier> <static> <Kiểu trả về> <Tên hàm> (<Kiểu của tham số>){
                // Khối lệnh thực thi chức năng của hàm
                // return <Giá trị trả về>;
             }
         */
        // Cách để gọi hàm
        // <Tên hàm> (<Đối số>);
        hello();
        // Bản chất của Java là muốn sử dụng một method hay hàm được định nghĩa
        // bên trong class thì ta phải tạo đối tượng thuộc về lớp đó
        // Main main = new Main();
        // main.hello();
        // Trong java thì có 2 loại hàm
        // Hàm không trả gía trị là có kiểu trả về void
        // public static void <Tên hàm>(<Tham số>) {
        // Khối lệnh
        // }
        inSoChanLe(99);
        // Giá trị truyền vào lời gọi hàm được gọi là arguments ( đối số)
        // Gại trị định nghĩa khi định nghĩa hàm được gọi là parameter (tham số)
        // Hàm có gái trị trả về
        // Cách khai báo hàm trả về giá trị
        // public static <Kiểu trả về> <Tên hàm>(<Tham số>) {
        //      Khối lệnh
        //      return <Giá trị trả về>;
        // }
        // Từ khóa return là từ khóa dùng để trả về giá trị cho hàmư
        System.out.println(dienTichHinhTron(5));
        double dienTich = dienTichHinhTron(100);
        System.out.println(dienTich);
        tongHaiSo(10, 2);
        // Nhập một giá trị từ màn hình console
        // Trong java
        // Ta dùng lớp tên là Scanner
        // Bước 1
        // Tạo một đối tượng của lớp Scanner : Lớp nhận input từ console
        Scanner scanner = new Scanner(System.in);
        // có hàm để sử dụng trên lớp Scanner là tương ứng với từng giá trị mà muốn nhập từ console
        // string -> nextLine();
        // int => nextInt();
        // double => nextDouble();\
        int soNguyenNhapTuBanPhim = scanner.nextInt();
    }
    // Example
    public static void hello() {
        System.out.println("Hello Java");
    }
    public static void inSoChanLe(int number) {
        if (number % 2 == 0) {
            System.out.println("Số chẵn");
        } else {
            System.out.println("Số lẻ");
        }
    }
    // Đi học và lười tính diện tích hình tròn
    // Nên viết một hàm tính diện tích hình tròn
    public static double dienTichHinhTron(double r) {
        double dienTich = r * r * Math.PI;
        return dienTich;
    }
    public static int tongHaiSo(int a, int b) {
        return a + b;
    }
}
