module com.example.project {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.swing;
    requires javafx.graphics;
    requires java.sql;
    requires java.desktop;
    requires mysql.connector.j;
    requires AnimateFX;
    requires de.jensd.fx.glyphs.fontawesome;
    requires de.jensd.fx.glyphs.commons;

    opens com.example.project to javafx.fxml, javafx.graphics, javafx.base;
    exports com.example.project;
}
