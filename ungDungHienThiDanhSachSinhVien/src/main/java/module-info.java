module com.example.ungdunghienthidanhsachsinhvien {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ungdunghienthidanhsachsinhvien to javafx.fxml;
    exports com.example.ungdunghienthidanhsachsinhvien;
}