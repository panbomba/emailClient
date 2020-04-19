module JavaFxEmailClientCourse {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires activation;
    requires java.mail;

    opens com.bombik;
    opens com.bombik.view;
    opens com.bombik.controller;
    opens com.bombik.model;
}