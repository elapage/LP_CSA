/**
 * A general Shape object. The super class to our Shape hierarchy. All shapes
 * have a colour and a starting point and can calculate an area
 */

 public class Shape
 {
    private int x, y;        //starting location of the shape
    private String colour;  //colour of the shape

    public Shape(int x, int y, String colour)
    {
        this.x = x;
        this.y = y;
        this.colour = colour;
    }

    /**
     * What should be displayed for the Shape
     */
    public String toString()
    {
        String message = "(" + x + ", " + y + "), " + colour;

        return message;
    }
 }