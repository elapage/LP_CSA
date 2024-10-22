/**
 * Card class driver
 */

public class CardClassDriver
{
    public static void main(String[] args)
    {
        Card c1 = new Card();   //calls the default
        Card c2 = new Card('H', 11);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        //flip both cards and display
        c1.flip();
        c2.flip();
        System.out.println(c1);
        System.out.println(c2); 
        
        //compares two cards together
        System.out.println(c1.compareTo(c2));
    }
}