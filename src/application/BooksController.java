package application;

import library.Book;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class BooksController {

   @FXML
   private TableColumn<Book, String> title, category, publisher;

   @FXML
   private TableColumn<Book, String[]> authors;

   @FXML
   private TableColumn<Book, Integer> publishYear;

}
