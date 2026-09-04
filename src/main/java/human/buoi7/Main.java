package human.buoi7;

public class Main {
    public static void main(String[] args) {
        // Tiền tố và hậu tố
        // # Tiền tố
        // Cách sử dụng ++/--<Tên biến>
        // Ví dụ
        int a = 10;
        int b = 100;
        int c = ++a + ++b; // 112 = 11 + 101
        System.out.println(a); // 11
        System.out.println(b); // 101
        // System.out.println(c);
        // Hậu tố
        // Hậu tố sử dụng giá trị của biến trong biểu thức trước khi tăng hoặc giảm gía trị đi
        // Cú pháp <Tên biến>++/--
        // Ví dụ
        int d = a-- + b--;
        System.out.println(d); // 11 + 101 = 112;
        System.out.println(a); // 10
        System.out.println(b); // 100

        // Ép kiểu dữ liệu
        // Ép kiểu mở rộng
        // Tức là mở rộng khoản giá trị của một kiểu dữ liệu sang kiểu dữ liệu lớn hơn
        byte number1 = 127; // -128 -> 127
        int number2 = number1;
        System.out.println(number2);
        // Ép kiểu thu hẹp
        // Thu hẹp phạm vi gía trị của giá trị hiện tại về một kiểu dữ liệu nhỏ hơn kiểu hiện tại
        // Cú pháp (<Kiểu muốn ép về>)<Giá trị hiện tại>
        long number3 = 15000000000L;
        int number4 = (int) number3;
        System.out.println(number3);
        System.out.println(number4);
        // Ép kiểu với String
        // Chuyển từ số sang String
        // Thì class String hỗ trợ chuyển đổi các kiểu nguyên thủy sang số
        // bằng phương thức valueOf(<Giá trị>);
        String number6 = String.valueOf(100); // int, long, double, float
        System.out.println(number6);
        String number7 = String.valueOf(111.999); // int, long, double, float
        System.out.println(number7);
        // Chuyển đổi từ String sang số
        // Bắt buộc chuỗi chỉ chứa duy nhất các ký tự là số nếu chứa ký tự khác sô thì gây lỗi
        // Để chuyển từ String sang số thì trong Java người ta xây dựng các Warper Class là các lớp
        // đối tượng
        // cho các kiểu dữ liệu nguyên thủy:
        // int -> Int
        // long -> Long
        // ... -> ...
        // Các lớp wrapper này đều có có dạng parse<Tên class>
        // class Integer -> parseInt
        // class Double -> parseDouble
        String strNum = "999";
        int intNum = Integer.parseInt(strNum);
        System.out.println(intNum + 1);
        // Lỗi khi String chứa ký tự không phải số
        double doubleNum = Double.parseDouble("999.11a");
        System.out.print("fuck");

    }
}

