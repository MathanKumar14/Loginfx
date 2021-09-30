package myapp.loginfx;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;

import java.sql.SQLException;

public class Controller {
    @FXML
    private Button button;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    public void getdata(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        System.out.println(username.getText());
        System.out.println(password.getText());
        Javapsql.write(username.getText(),password.getText());
    }
}