module com.example.ungdungkh {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ungdungkh to javafx.fxml;
    exports com.example.ungdungkh;
}