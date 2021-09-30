module myapp.loginfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.postgresql.jdbc;

    opens myapp.loginfx to javafx.fxml;
    exports myapp.loginfx;
}