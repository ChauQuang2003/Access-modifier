public class MainCircle {
    public static void main(String[] args) {
        Circle circle1  = new Circle(2.5);
        Circle circle2 = new Circle(3.5);
        Circle circle3 = new Circle(4.5);
        System.out.println("Tổng số hình tròn: " + Circle.TongSoHinhTron());
        System.out.println("Tổng diện tích tất cả hình tròn" + Circle.TongDienTich());

        Circle maxCircle = Circle.HinhTronLonNhat();
        System.out.println("Hình tròn bk lớn nhất: " + maxCircle);
    }
}
