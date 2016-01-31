package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    public Button butButton1;
    public Label labLabel;

    public void handleButton1(ActionEvent actionEvent) {
        labLabel.setText("Button 1 pressed");
    }

    public void handleButton2(ActionEvent actionEvent) {
        labLabel.setText("Button 2 pressed");
    }

    public void handleQuit(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void handleButton3(ActionEvent actionEvent) {
    }
}
