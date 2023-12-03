package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField operand1Field;

    @FXML
    private TextField operand2Field;

    @FXML
    private Label resultLabel;

    public void add(ActionEvent actionEvent) {
        int operand1 = Integer.parseInt(operand1Field.getText());
        int operand2 = Integer.parseInt(operand2Field.getText());
        int result = operand1 + operand2;
        resultLabel.setText(Integer.toString(result));
    }
}
