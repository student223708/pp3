public class Main {
    public static void main(String[] args)
    {
        Rectangle rec = new Rectangle(2,5);
        Triangle tri = new Triangle(3,5);
        Circle cir = new Circle(4);

        System.out.println(rec.area());
        System.out.println(tri.area());
        System.out.println(cir.area());
    }
}
