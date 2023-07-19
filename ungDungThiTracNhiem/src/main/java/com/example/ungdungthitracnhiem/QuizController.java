package com.example.ungdungthitracnhiem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Font;

public class QuizController {
    @FXML
    private Label content;

    @FXML
    private RadioButton answerA;

    @FXML
    private RadioButton answerB;

    @FXML
    private RadioButton answerC;

    @FXML
    private RadioButton answerA1;

    @FXML
    private RadioButton answerB1;

    @FXML
    private RadioButton answerC1;

    @FXML
    private ToggleGroup toggleGroup;
    @FXML
    private ToggleGroup toggleGroup1;

    @FXML
    private Label resultLabel;

    @FXML
    private void submitQuiz(ActionEvent event) {
        String result = "";

//        Cach1 set ket qua truc tiep
//        boolean isAnswerBCorrect = answerB.isSelected();

//        // Kiểm tra câu trả lời và hiển thị kết quả
//        if (isAnswerBCorrect) {
//            result += "Câu 1 trả lời đúng!";
//        } else {
//            result += "Câu 1 trả lời sai!";
//        }
//
//        boolean isAnswer2Correct = answerA1.isSelected();
//        if (isAnswer2Correct) {
//            result += "\nCâu 2 trả lời đúng!";
//        } else {
//            result += "\nCâu 2 trả lời sai!";
//        }
//
//        Cach 2 lay ket qua nguoi dung roi set ket qua vs ket qua dung
        RadioButton selected = (RadioButton) toggleGroup.getSelectedToggle();
        if (selected == answerB) {
            result += " Câu 1 trả lời đúng!";
        } else {
            result += " Câu 1 trả lời sai!";
        }

        RadioButton selected1 = (RadioButton) toggleGroup1.getSelectedToggle();
        if (selected1 == answerA1) {
            result += "\n Câu 2 trả lời đúng!";
        } else {
            result += "\n Câu 2 trả lời sai!";
        }
        resultLabel.setText(result);

    }

}