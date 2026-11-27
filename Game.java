import java.util.ArrayList;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    String title;
    AgeRating ageRating;
    Platform platforms;
    Genre genres;
    
    ArrayList<Integer> ratings;
    
    
    /**
     * Constructor for objects of class Game
     */
    public Game(String title, AgeRating ageRating, Platform platforms, Genre genres) {
        this.title = title;
        this.ageRating = ageRating;
        this.platforms = platforms;
        this.genres = genres;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     */
    public String getTitle() {
        return title;
    }
    
    public AgeRating getAgeRating() {
        return ageRating;
    }
    
    public Platform getPlatforms() {
        return platforms;
    }
    
    public Genre getGenre() {
        return genres;
    }
    
    public void addRating(int rating) {
        ratings.add(rating);
    }
}