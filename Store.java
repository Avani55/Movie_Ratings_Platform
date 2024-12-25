class Store {

  ArrayList<Movies> movies; // we have set the fields private, so that nobody can not access the objects field directly.

  // constructor with no parameters, here constructor is being used.

  public Store() {
    movies = new ArrayList<>(); // shows the new refernce to the object.
  }

  // retrieve the movis based on the index of the list.
  public Movies getMovies(int index) {
    if (index >= 0 && index <= movies.size()) {
      return movies.get(index);
    }
    return null;
  }

  // update a movie in the particular index.
  public void setMovies(int index, Movies movie) {
    if (index >= 0 && index <= movies.size()) {
      movies.set(index, movie);
    }
  }

  // add a new movie to the list.
  public void addMovie(Movies movie) {
    movies.add(movie);
  }

  // a function that prints all the movies in the store

  public void printMovies() {
    System.out.println(
      "******************************MOVIE STORE*****************************"
    );

    for (int i = 0; i < movies.size(); i++) {
      Movies movie = movies.get(i);
      System.out.printf(
        "%.1f\t%-12s\t%s\n",
        movie.getRatings(),
        movie.getFormat(),
        movie.getTitle()
      );
    }
  }
}
