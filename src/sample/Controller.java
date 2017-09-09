package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public TextField txtFieldOne;
    public TextField txtFieldTwo;
    @FXML
    private Label lbResult;


    public void getPlus(ActionEvent actionEvent) {
           int frstNum = Integer.parseInt(txtFieldOne.getText());
          int scndNum = Integer.parseInt(txtFieldTwo.getText());
        int res = frstNum + scndNum;
        lbResult.setText(frstNum + " + " + scndNum + " = " + res);
    }

    public void getMultiply(ActionEvent actionEvent) {
        int frstNum = Integer.parseInt(txtFieldOne.getText());
        int scndNum = Integer.parseInt(txtFieldTwo.getText());
        int res = frstNum * scndNum;
        lbResult.setText(frstNum + " * " + scndNum + " = " + res);
    }

    public void getDivide(ActionEvent actionEvent) {
        int frstNum = Integer.parseInt(txtFieldOne.getText());
        int scndNum = Integer.parseInt(txtFieldTwo.getText());
        double res = frstNum / scndNum;
        //int res = (int)Math.round(frstNum / scndNum);
        lbResult.setText(frstNum + " / " + scndNum + " = " + res);
    }

    public void getMinus(ActionEvent actionEvent) {
        int frstNum = Integer.parseInt(txtFieldOne.getText());
        int scndNum = Integer.parseInt(txtFieldTwo.getText());
        int res = frstNum - scndNum;
        lbResult.setText(frstNum + " - " + scndNum + " = " + res);
    }
}
