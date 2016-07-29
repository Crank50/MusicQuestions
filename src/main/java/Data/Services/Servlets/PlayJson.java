package Data.Services.Servlets;

import java.util.Scanner;

/**
 * Created by Justin on 7/29/16.
 */
public class PlayJson extends  Music{

    private String name;
    private String favoriteBand;
    private String favoriteVenue;

    public void setName() {
        System.out.println("What is your name?");
        name = Json.scanner.nextLine();
        System.out.println("Welcome, " + name);
    }

    public void setfavoriteBand(){
        System.out.println("What is your Favorite band?");
        favoriteBand = Json.scanner.nextLine();
        System.out.println("Your favorite band is: " + favoriteBand);

    }

    public void setfavoriteVenue(){
        System.out.println("What is your favorite Venue?");
        favoriteVenue = Json.scanner.nextLine();
        System.out.println("Your favorite Venue is: " + favoriteVenue);
    }

}
