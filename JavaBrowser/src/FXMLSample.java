import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * The sample demonstrates how to embed JavaFX BrowserView
 * component into JavaFX app using FXML.
 */
public class FXMLSample extends Application {

    public static void main(String[] args) {
        Application.launch(FXMLSample.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
    	
//    	 AnchorPane root = FXMLLoader.load(
//                 FXMLSample.class.getResource("Test.fxml"));
    	
    	BorderPane root = FXMLLoader.load(
                 FXMLSample.class.getResource("Test1.fxml"));
    	 
        BorderPane pane = FXMLLoader.load(
                FXMLSample.class.getResource("browser-view-control.fxml"));
        
        root.setCenter(pane);
        primaryStage.setTitle("JavaFx");
        primaryStage.setScene(new Scene(root, 1000, 600));
        primaryStage.show();
    }
}