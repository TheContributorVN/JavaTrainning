package human.buoi7;

public class Buoi7_v2 {
    public static void main(String[] args) {
        // Tiền tố , hậu tố
        // # Tiền tố
        // Ký hiệu: ++/--
        // Cách dùng: ++/--<Biến>
        // Cách hoạt động
        // Khi dung với một giá trị (biến)
        // Thì giá trị cuả biến được tăng hoặc giảm đi 1 giá trị lên sau đó mới dùng để gán truy cập
        // (sủ dụng)
        // ví dụ
        int numberOne = 100;
        // Trong phép gán thì luôn thực hiện biểu thức phía bên phải trước
        int numberTwo = ++numberOne; // 100 -> 101
        System.out.println(numberOne);
        System.out.println(numberTwo);
        // Hậu tố
        // Cách sử dụng: <Biến>++/--
        // Nguyên tắc khi sử dụng là sử dụng gía trị sau đó mới tăng
        // hoặc giảm giá trị đi
        // Ví dụ
        int age = 99;
        int newAge = age++; // newAge ? 100
        // Tạo ra một biến giữ giá trị gốc 99, rồi tăng gía trị age -> 100
        // Trả về biến giữ giá trị gốc
        System.out.println(age);
        System.out.println(newAge); // 99
        //
        // <Biên>++/--;
        // Ép kiểu
        // Khi mà xây dụng một hệ thống
        // Thì các nguồn dữ liệu sinh ra trong hệ thống
        // Các thông báo của hệ thống
        // Dữ liệu người dùng cung cấp
        // Dữ liệu lấy từ API (Nguồn dữ liệu từ ứng dụng khác)
        // Không phỉa lúc nào dữ liệu cũng đạt đúng yêu cầu để hệ thống xử
        // lý
        // Mục đích của ép kiểu là đưa dữ liệu về định dạng mong muốn
        // Ép kiểu mở rộng (Từ kiểu dữ liệu có phạm vị nhỏ -> ra kiểu dữ liệu có
        // phạm vi lớn hơn
        // Gỉa sử
        // Cho người dùng nhập số bất kỳ
        // Giả sử mình có cách để kiểm tra số mà khách hàng vừa nhập và quá kiểu
        // int hay chưa . Nếu vượt quá thì tiến ép kiểu sang long
        // Cách sử dụng là khai gán gía trị muốn ép kiểu cho một biến mới
        // với kích thước lớn hơn
        int money = 2000000000; // Kích thước lớn 2
        // money += 10000000000;
        long newMoney = money; // Java tự chuyển đổi biến money sang kiểu Long
        System.out.println(newMoney);
        newMoney += 10000000000L;
        System.out.println(newMoney);
        // Tương tự thì cũng có thể chuyển đổi từ kiểu
        // int -> doule
        // float -> double
        // Ép kiểu thu hẹp
        // Chuyển từ kiểu dữ liệu có phạm vi(kích thước) lớn -> kiểu có kích thước
        // nhỏ hơn
        // Khi dùng ép kiểu thu hẹp thì phải chỉ định kiểu ép về
        // Cách sử dụng: <Kiểu ép> <Tên biến> = (<Kiểu ép>) <Giá trị muốn ép kiểu>;
        // Ví dụ
        long bigMoney = 1000000000L;
        int mMoney = (int) bigMoney;
        System.out.println(mMoney);
        // Ép kiểu với String
        // Chuyển từ số sang String
        // Thì lớp String cung cập một phương thức
        // để chuyển đổi từ số sang String
        // Tuy vào kiểu dữ liệu là gì thì String đều có hàm chuyển đổi
        // Cách dùng: String.valueOf(<Số muốn chuyển thành String>);
        int old = 1000;
        String strNumber = String.valueOf(old);
        System.out.println(strNumber);
        System.out.println(strNumber + "0001");
        // Chuyển đổi từ String sang số
        // Wrapper class là các Class được Java xây dựng cho các kiểu
        // dư liệu nguyên thủy bao gồm
        // int -> Integer
        // long -> Long
        // double -> Double
        // float -> Float
        // char -> Character
        // boolean -> Boolean
        // Mọi wrapper class đều có một phương thức để chyển đổi sang
        // kiểu đó là: parse<Tên kiểu>
        // Integer: Integer.parseInt()
        // Lưu ý là String muốn chuyển thành số chỉ được chưa số
        // Nếu chứa ký tự khác số thì gây ra ngoại lệ (Lỗi)
        String numberStr = "100";
        long numberLong = Long.parseLong(numberStr);
        System.out.println(numberLong + 100);
        String errorStr = "1abc1";
        int numberInt = Integer.parseInt(errorStr);
        System.out.println(numberInt);
        // Xong rồi nha
        // Ông nghỉ được rồi á
        // Nhớ làm bài tập
        // Với tranh thủ ôn bài cũ

    }
}

