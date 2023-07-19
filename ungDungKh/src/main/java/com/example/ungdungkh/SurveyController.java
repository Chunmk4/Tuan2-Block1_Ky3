package com.example.ungdungkh;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SurveyController {

    @FXML
    private RadioButton option1radioButton;

    @FXML
    private RadioButton option2radioButton;

    @FXML
    private RadioButton option3radioButton;

    @FXML
    private CheckBox option1checkBox;

    @FXML
    private CheckBox option2checkBox;

    @FXML
    private CheckBox option3checkBox;

    @FXML
    private Button submitButton;

    @FXML
    private void submitButtonClicked(ActionEvent event) {
        saveSurveyData();
        showAlert("Khảo sát đã được bạn nộp thành công!");
    }

    private void saveSurveyData() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("data.txt"))) {
            if (option1radioButton.isSelected()) {
                writer.println("Câu hỏi 1: Lựa chọn 1");
            } else if (option2radioButton.isSelected()) {
                writer.println("Câu hỏi 1: Lựa chọn 2");
            } else if (option3radioButton.isSelected()) {
                writer.println("Câu hỏi 1: Lựa chọn 3");
            }

            StringBuilder question2Answer = new StringBuilder();
            if (option1checkBox.isSelected()) {
                question2Answer.append("Lựa chọn 1 / ");
            }
            if (option2checkBox.isSelected()) {
                question2Answer.append("Lựa chọn 2 / ");
            }
            if (option3checkBox.isSelected()) {
                question2Answer.append("Lựa chọn 3 / ");
            }

            writer.println("Câu hỏi 2: " + question2Answer.toString());
        } catch (IOException e) {
            showAlert("Đã xảy ra lỗi. Vui lòng thử lại sau.");
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Thông báo");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

}
