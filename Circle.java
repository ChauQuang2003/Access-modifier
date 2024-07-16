public class Circle {
    private static final double PI = 3.14;
    private static int count = 0;
    private static double totalArea = 0;
    private static double maxRadius = 0;
    private static Circle maxCircle = null;
    private int id;
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
        this.id = ++count;
        totalArea += tinhDienTich();
        if (radius > maxRadius) {
            maxRadius = radius;
            maxCircle = this;
        }
    }
    // tính diện tích
    public double tinhDienTich() {
        return PI * radius * radius;
    }
    //  tính chu vi
    public double tinhChuVi() {
        return 2 * PI * radius;
    }
    //  tổng số hình tròn đã tạo
    public static int TongSoHinhTron() {
        return count;
    }
    // tổng diện tích của tất cả hình tròn
    public static double TongDienTich() {
        return totalArea;
    }
    // hình tròn có bán kính lớn nhất
    public static Circle HinhTronLonNhat() {
        return maxCircle;
    }
    //  hiển thị thông tin hình tròn
    @Override
    public String toString() {
        return "Circle{id=" + id + ", radius=" + radius + "}";
    }
}


