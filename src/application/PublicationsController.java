package application;

import library.Publication;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class PublicationsController {

   @FXML
   private TableColumn<Publication, String> title, category, publisher;

   @FXML
   private TableColumn<Publication, String[]> authors;

   @FXML
   private TableColumn<Publication, Integer> publishYear;

   @FXML
   private TableColumn<Publication, Boolean> isJournal;

}
