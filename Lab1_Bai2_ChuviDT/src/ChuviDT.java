import java.util.Scanner;

public class ChuviDT {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập chiều dài và chiều rộng của hình chữ nhật
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double chieuDai = scanner.nextDouble();
        
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double chieuRong = scanner.nextDouble();
        
        // Tính chu vi và diện tích
        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;
        
        // Xác định cạnh nhỏ hơn
        double canhNho = Math.min(chieuDai, chieuRong);
        
        // Xuất kết quả ra màn hình
        System.out.println("\nThông tin hình chữ nhật:");
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Cạnh nhỏ: " + canhNho);
        
        // Đóng Scanner
        scanner.close();
    }
}
