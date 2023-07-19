module com.example.ungdungthitracnhiem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ungdungthitracnhiem to javafx.fxml;
    exports com.example.ungdungthitracnhiem;
}