package human.buoi5;

public class Main {
    public static void main(String[] args) {
        // Biến và Kiểu dữ liệu trong Java
        // Gía trị có thể số hoặc ký tự chuỗi
        // Có sự bất tiện khi mà sử dụng giá trị đó không tái sử dụng được
        // Khi mà muốn thao tác trên giá trị thì cũng gặp bất tiện là cũng phải lặp gía trị cần thay
        // đôi
        // Trong mọi ngôn ngữ lập trình người ta định nghĩa một khái niệm gọi là biến
        // Biến giúp lưu trữ một giá trị
        // Gía trị có thẻ là số, hoặc địa chỉ, hoặc ký tự, chuỗi, ...
        // Để khai báo một biến thì ta sử dụng cú pháp
        // Tức la định ra nghĩa ra một biến nhưng chưa gán giá trị cho biến
        // <Kiểu dữ liệu> <Tên biến>;
        // Để khỏi tạo một biến thì dùng cú pháp
        // <Kiểu dữ liệu> <Tên biến> = <Giá trị khởi tạo>;
        // Gía trị khởi tạo là giá trị mà ta mong muốn biến đại diện
        // Kiểu số nguyên là int trong java
        // Khai báo một biến số nguyên
        int age;
        // Khởi tạo một biến kiểu chuỗi
        String country = "Việt Nam";
        // System.out.println(5);
        // System.out.println(5);
        // Khi gán gía trị cho biến thì ta có thể dùng tên biến xem như đại diện cho gía trị
        // Ở đây giá trị biến country là "Việt Nam"
        // Khi khỏi tạo biến
        // Thì máy tính sẽ cấp phát cho biến một vùng nhớ lúc chương trình được thực thi.
        // Vùng nhớ này được cấp phát trên ram
        System.out.println(country);
        // Quy tắc đặt tên biến
        // Mọi ngôn ngữ lập trình đều có quy tắc viết mã được chuẩn hóa cho ngôn ngữ lập trình đó
        // được gọi là
        // coding convention
        // Thì quy tắc đặt tên biến cũng thuộc coding convention
        // Java sử dụng quy tắc đặt tên biến theo quy tắc lowerCamelCase
        // Nếu biến có nhiều từ thì từ đàu tiên luôn viết thường, từ từ thứ 2 trở đi viết hoa chữ
        // cái đầu tiên
        // Nếu biến chỉ có một từ thì viết thường từ đó
        String myCity = "Hue City";
        System.out.println(myCity);
        // Tên biến có thể chứa số , ký tự, $, _ và không được chứa các ký tự đặt biệt khác
        // Tên biên không được bắt đầu bằng số
        // Tên biến không được có khoảng trắng giữa các từ trong tên biên
        // Tên của 2 biến trong một phạm vi chương trình (scope) không được giông nhau
        // Tên biến phân biệt chữ hoa và thường
        // Tên biến không được dùng các từ khóa trong Java
        // Từ khóa là các từ được ngôn ngữ lập trình quy định sẵn nhằm phục vụ một mục đính nào đó
        // nên không được sử dụng
        // từ khóa để đặt tên cho biến hoặc method(hàm)
        // Đây là 3 tên biến sai
        // int age 123 = 100;
        // int age*212 = 100;
        // int 2abc = 100;
        // Tên biến này đã tồn tại trong phạm vi
        // char myCity = 'a';
        // Lỗi : Tên biến dùng từ khóa
        // int float = 100;
        // Tên biến phân biệt chữ hoa và chữ thường
        int myAge = 100;
        int myAGE = 100;
        // Kiểu dữ liệu
        // Trong Java chia thành 2 lọai kiểu dữ liệu
        // Là kiểu dữ liệu nguyên thủy : Là kiểu dữ liệu chưa giá trị cụ thể như số, ký tự, Giá trị
        // đúng sai
        // Kiểu đối tượng: Thì kiểu đối tượng là kiểu mà chứa giá trị một đối tượng
        // Biến thuộc kiểu nguyên thủy thì chưa giá trị cụ thể
        // Biến thuộc kiểu đối tượng thì chứa địa trị của đối tượng trong vùng nhớ heap cà JVM
        // Kiểu dữ liệu nguyên thủy gồm 8 kiểu:
        /*
         * + byte: số nguyên + short: số ngyên + int: số nguyên + long: só nguyên + float: số thực +
         * double: số thực + char: Ký tự + boolean: Kiểu giá trị đúng sai ( Chỉ có 2 giá trị là
         * true/false)
         *
         *
         */
    }
}

