import java.util.*;

public class MovieStoreApp {

  public static void main(String[] args) {
    // here we have created the arrays of the movies to intialize the store
    Movies[] moviesArray = new Movies[] {
      new Movies("The Shawshank Redemption", "BlueRay", 9.2), // Create Movie object with title, format, and rating
      new Movies("The Godfather", "BlueRay", 9.1),
      new Movies("The Godfather: Part II", "DVD", 9.0),
      new Movies("12 Angry Men", "DVD", 8.9),
      new Movies("The Dark Knight", "BlueRay", 9.0),
      new Movies("Schindlers List", "DVD", 8.9),
      new Movies(
        "The Lord of the Rings: The Return of the King",
        "BlueRay",
        8.9
      ),
      new Movies("Pulp Fiction", "DVD", 8.8),
      new Movies("The Good, the Bad and the Ugly", "DVD", 8.8),
      new Movies(
        "The Lord of the Rings: The Fellowship of the Ring",
        "DVD",
        8.8
      ),
    };

    // created the new Store object.
    Store store = new Store();
    Scanner scanner = new Scanner(System.in);
    String userChoice;

    // putting all the arrays of movies using for loop and fill the store.

    for (int i = 0; i < moviesArray.length; i++) {
      store.addMovie(moviesArray[i]);
    }

    do {
      // Display all movies in the store
      store.printMovies();

      // Prompt user to select a movie by index
      System.out.print("\nPlease choose an integer between 0 - 9: ");
      int index = scanner.nextInt(); // Read the user-selected index

      // Check if the index is valid
      if (index >= 0 && index < store.movies.size()) {
                    // Retrieve the selected movie
                    Movies selectedMovie = store.getMovies(index);
                    // Prompt the user to set a new rating for the selected movie
                    System.out.printf(
                      "Set a new rating for %s: ",
                      selectedMovie.getTitle()
                    );
                    double newRating = scanner.nextDouble(); // Read the new rating from the user
                    // Update the movie's rating
                    selectedMovie.setRatings(newRating);
            
                    // Display the updated movie store
                    System.out.println(
                      "\n********************************MOVIE STORE*******************************"
                    );
                    store.printMovies();
                  } else {
                    // Handle invalid index input
                    System.out.println("Invalid index. Try again.");
                  }
            
                  // Ask the user if they want to edit another rating
                  System.out.print("\nTo edit another rating, type: 'continue': ");
                  userChoice = scanner.next(); // Read the user's choice
                } while (userChoice.equalsIgnoreCase("continue")); // Repeat if user types 'continue'
                scanner.close();
              }
            
            }
