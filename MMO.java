
/**
 * Write a description of class MMO here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MMO extends Game
{
    String numOfPlayers;

    /**
     * Constructor for objects of class MMO
     */
    public MMO(String title, AgeRating ageRating, Platform platforms, Genre genres)
    {
        super(title, ageRating, platforms, genres);
        numOfPlayers = "Online";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sampleMethod(int y)
    {
        
    }
}