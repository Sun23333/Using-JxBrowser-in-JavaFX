import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.javafx.BrowserView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JavaFXSample extends Application {
    @Override
    public void start(final Stage primaryStage) {
        Browser browser = new Browser();
        BrowserView view = new BrowserView(browser);

        Scene scene = new Scene(new BorderPane(view), 700, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        browser.loadURL("http://www.baidu.com");
    }

    public static void main(String[] args) {
        launch(args);
    }
}