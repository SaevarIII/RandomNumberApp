package demomavinfx;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {
    @FXML
    private Label NumberLabel;
    

    @FXML
    private void handleButtonClick(ActionEvent event)  {
        int number = (int)(Math.random() * 100);
        NumberLabel.setText(String.valueOf(number));
        if(number == 67){
            
        }
    }

    
}
