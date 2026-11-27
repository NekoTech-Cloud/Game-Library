
/**
 * Write a description of class Session here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameSession
{
    private Game game;
    private String player;
    private long startTime;
    private long endTime;
    private boolean isActive;

    /**
     * Constructor for objects of class GameSession
     */
    public GameSession(Game game, String player)
    {
        this.game = game;
        this.player = player;
        isActive = false;
    }

    public void start(){
        startTime = System.currentTimeMillis();
        isActive = true;
    }

    public void stop(){
        endTime = System.currentTimeMillis();
        isActive = false;
    }

    public long getDurationSeconds(){
        return (endTime - startTime) / 1000;
    }

    public Game getGame(){
        return game;
    }

    public String getPlayer(){
        return player;
    }

    public boolean isActive(){
        return isActive;
    }
}