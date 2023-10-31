public class Main {
    public static void main(String[] args) {

        String s = "Text";
        Point point = new Point(0,4);
        System.out.println(point);
        Point point1 = new Point(3,0);


        System.out.println(point1);
        System.out.println(point.distance(point1));
        Point3D point3D =new Point3D(1,2,3);
        System.out.println(point3D);
        System.out.println("Hello world!");
    }
}