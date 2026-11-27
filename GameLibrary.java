import java.util.ArrayList;
/**
 * Write a description of class GameLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameLibrary
{
    private ArrayList<Game> library;
    private ArrayList<GameSession> gameSessions;

    /**
     * Constructor for objects of class GameLibrary
     */
    public GameLibrary()
    {
        library.add(new Game("Minecraft", E10, { PC, Console, Mobile }, Sandbox));
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printLibraryDetails()
    {
        
    }
    
    public void listAllGames() 
    {
        
    }
    
    public ArrayList<Game> listTopRatedGames() 
    {
        
    }
    
    public void addGame(Game game) {
        library.add(game);
    }
}