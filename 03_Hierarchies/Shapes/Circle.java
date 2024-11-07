/**
 * A subclass of the Shape hierarchy. A circle not only has a starting
 * point and a colour but a radius as well.
 */

public class Circle extends Shape
{
    private double radius;   //the radius of the Circle

    public Circle(int x, int y, double radius, String colour)
    {
        super(x, y, colour);
        this.radius = radius;
    }

    /**
     * accessor for the radius
     * @return the radius of the circle
     */
    public double getRadius()
    {
        return radius;
    }

    /**
     * The circle's toString will give exactly what the Shape's toString
     * is except with the radius at the end
     */
    public String toString()
    {
        String message = super.toString() + " R: " + radius;
        return message;
    }

    /**
     * determines whether two circles are equal 
     */
    public boolean equals(Object other)
    {
        Circle otherCircle = (Circle)other;
        boolean result = false;
        if(other != null)
        {
            if(this == other)
            {
                result = true;
            }
            else
            {
                result = this.radius == otherCircle.radius;
            }
        }
        return result;
    }
    
}
