module etm.fxapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens etm.fxapp to javafx.fxml;
    exports etm.fxapp;
}