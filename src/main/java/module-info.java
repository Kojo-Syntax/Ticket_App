module com.example.ticket_app {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.ticket_app to javafx.fxml;
    exports com.example.ticket_app;
}