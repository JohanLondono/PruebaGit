module org.example.pruebagit {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.example.pruebagit to javafx.fxml;
    exports org.example.pruebagit;
}