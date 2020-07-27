import com.teamdev.jxbrowser.chromium.javafx.BrowserView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class BrowserViewControl implements Initializable {

    @FXML
    private BrowserView browserView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        browserView.getBrowser().loadURL("http://www.baidu.com");
    }
}