package demomavinfx;
import javafx.scene.image.Image;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.IOException;

public class PrimaryController {
    @FXML
    private Label NumberLabel;
    @FXML
    private ImageView Heisenberg;
    
    @FXML
    private void handleButtonClick(ActionEvent event)  {
        int number = (int)(Math.random() * 100);
        NumberLabel.setText(String.valueOf(number));

        if(number == 67){
            Image mynd = new Image(getClass().getResourceAsStream("/demomavinfx/images/Heisenberg.png"));
            Heisenberg.setImage(mynd);
          Heisenberg.setVisible(true);
       }
        else
        Heisenberg.setVisible(false);
    }
    @FXML
    private void onOpenNewWindow(ActionEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SecondWindow.fxml"));
        Parent root = fxmlLoader.load();

        Stage stage = new Stage();
        stage.setTitle("Second Window");
        stage.setScene(new Scene(root));
        stage.show();
    

    }

    
}
