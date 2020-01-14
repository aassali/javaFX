package sample.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import sample.Main;
import sample.model.Bar;

import javax.swing.*;
import java.io.*;
import java.net.*;
import java.util.Base64;

public class LoginController {
    private Bar bar;
    private String targetURL = "https://projet-annuel-node.herokuapp.com/api/auth/bars";
    @FXML
    private Button btn_login;
    @FXML
    private TextField log_mail;
    @FXML
    private TextField log_psw;

    // Reference to the main application.
    private Main mainApp;

    public boolean exist() throws IOException {
        boolean result = false;

        System.out.println(log_mail.getText());
        System.out.println(log_psw.getText());

        URL url = new URL(targetURL);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try {
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());


            } catch (IOException e) {
            e.printStackTrace();
        }finally {
            urlConnection.disconnect();
        }
        return result;
    }

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;

        // Add observable list data to the table
        //personTable.setItems(mainApp.getPersonData());
    }

}
