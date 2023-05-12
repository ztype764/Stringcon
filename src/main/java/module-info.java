module com.stringcon.btoh.stringcon {
    requires javafx.controls;
    requires javafx.fxml;
    requires annotations;


    opens com.stringcon.btoh.stringcon to javafx.fxml;
    exports com.stringcon.btoh.stringcon;
}