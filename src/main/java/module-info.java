module demomavinfx {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens demomavinfx to javafx.fxml;
    exports demomavinfx;
}
