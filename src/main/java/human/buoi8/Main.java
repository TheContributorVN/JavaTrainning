package human.buoi8;

public class Main {
    public static void main(String[] args) {
        // Học class Math và các hàm thường dùng trong class Math
        // Lớp Math cung cấp các hằng số liên quan đến toán như PI, E rồi các
        // hàm tình toán căn bậc 2, làm tròn, random
        // Cách sử dụng: Math.<Tên hàm>
        // Hàm làm tròn trong lớp Math
        // Hàm Math.ceil : Làm tròn kết quả lên giá trị của phần nguyên gần nhất
        // int : Kiểu số nguyên , double/float : kiểu số thực
        // Ví dụ
        double ceilRound = 2.01;
        // Khi phần thập phân > 0 thì làm mới làm tròn phần nguyên lên giá trị
        // nguyên gần nhất. Khi phần thập phân bằng 0 thì không làm tròn lên
        double ceilRound2 = 2.0;
        System.out.println(Math.ceil(ceilRound));
        System.out.println(Math.ceil(ceilRound2));
        // Math.floor : Hàm làm tròn dưới
        // Ngược lại với hàm ceil khi phần thập phân > 0 thì làm tròn
        // phần nguyên xuống giá trị nguyên gần nhất
        // Ví dụ
        double floorRound = 9.0;
        System.out.println(Math.floor(floorRound));
        // Hàm Math.round: Hàm này làm tròn theo công thức toán học
        // Tức là phần thập phân >= 0.5 thì làm tròn phần nguyên lên giá trị nguyên
        // gần nhất và ngược lại <= 0.5 làm tròn phần thập phân về 0
        double round = 25.4;
        // Hàm round trả về giá trị là một số nguyên thuộc kiểu long
        System.out.println(Math.round(round));
        // Hàm toán học
        // Math.abs : Hàm tính giá trị tuyệt đối
        int absNum = -999;
        System.out.println(Math.abs(absNum));
        // Math.sqrt : Hàm tính căn bậc hai
        // Trả về giá trị căn bậc hai của số (double)
        double sqrtNum = 16.0;
        System.out.println(Math.sqrt(sqrtNum));
        // Math.pow : Hàm tính lũy thừa
        // Giá trị đầu tiên là cơ số
        // Giá  trị thứ 2 là số lũy thừa
        int powNum = 8;
        System.out.println(Math.pow(powNum, 2));
        // Math.max : Trả về số lớn nhất trong 2 số
        // Math.min: Trả về số nhỏ nhất trong 2 số
        System.out.println(Math.max(20, 30));
        System.out.println(Math.min(-99, -100));
        // Math.random : Hàm sinh giá trị ngẫu nhiên trong khoảng [0, 1.0)
        System.out.println(Math.random());
        // Gỉả sinh random 1 số trong khoảng từ 0 -> 100
        // Math.random() * 100
        // 99.999
        // -> [ 0, 100) + 1 -> [0, 100....]
        System.out.println((int)Math.floor(Math.random() * 100 + 1));
        //
    }
}
