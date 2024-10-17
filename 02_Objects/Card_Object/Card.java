/**
 * An example of writing an object
 */

public class Card
{
    //declare instance variables
    private char suit;
    private int rank;   //2-10, J (11), Q (12), K (13), A (14)
    private boolean isFlipped = false;  //flipped up or not

    //constructor - special  method that instantiates
    //the instance (initializes all instance variables)
    public Card(char suit, int rank)
    {
        this.suit = suit;
        this.rank = rank;

        isFlipped = false;  //always set to  be flipped down
    }

    //default constructor - no parameters
    public Card()
    {
        //random suit and a random rank
        suit = 'C';
        rank = 2;
    }

    /**
     * mutator for the isFlipped instance variables. Flips the card
     * up or down
     */
    public void flip()
    {
        isFlipped = !isFlipped;
    }

    /**
     * Mutator for suit
     * @return 'C', 'D', 'H', 'S'
     */
    public char getSuit()
    {
        return suit;
    }

    /**
     * Accessor for rank
     * @return values 2-14 (J - 11, Q - 12, K - 13, A - 14)
     */
    public int getRank()
    {
        return rank;
    }

    private String convertRank()
    {
        String strRank = "";
        if(rank >= 2 && rank <= 10) //numbers 2 - 10 are just the numbers
        {
            strRank = "" + rank;
        }
        else if(rank == 11) //Jack, Q, K, A
        {
            strRank = "J";
        }
        else if(rank == 12)
        {
            strRank = "Q";
        }
        else if(rank == 13)
        {
            strRank = "K";
        }
        else if(rank == 14)
        {
            strRank = "A";
        }
        else    //default condition
        {
            strRank = "";
        }

        return strRank;
    }

    /**
     * Compares two cards together using solely their rank
     * 
     * @param other the other Card
     * @return a number < 0 if other's rank is > this rank
     *         a number > 0 if other's rank is < this rank
     *         0 if this rank = other rank
     */
    public int compareTo(Card other)
    {
        return this.rank - other.rank;
    }
    
    /**
     * Returns the displayed card (SR or -- if flipped down)
     */
    public String toString()
    {
        if(!isFlipped)   //flipped up - face showing
        {
            return "--";
        }
        else
        {
            return "" + suit + convertRank();
        }
    }  
}
