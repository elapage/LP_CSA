/**
 * client class to test Shape hierarchy
 * @version November 5, 2024
 */

public class ShapeDriver
{
    public static void main(String[] args)
    {
        Shape s1 = new Shape(33, 2, "RED");
        Circle c1 = new Circle(45, 22, 8, "PURPLE");
        Shape c2 = new Circle(4, 55, 42, "BLACK");

        System.out.println(s1);
        System.out.println(c1);
        System.out.println(c2);

        //Call the accessors
        System.out.println(c1.getRadius());
        System.out.println(((Circle)c2).getRadius());

        System.out.println(c1.equals(c2));
    }
}