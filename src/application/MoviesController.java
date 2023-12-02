package application;

import library.Movie;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class MoviesController {

   @FXML
   private TableColumn<Movie, String> title, category;

   @FXML
   private TableColumn<Movie, String[]> directors;

   @FXML
   private TableColumn<Movie, Integer> releaseYear;

}
