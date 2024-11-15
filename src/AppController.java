import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppController {
    @FXML
    private TextField textField;
    @FXML
    private Label outputLabel;

    @FXML
    protected void handleMilesKmButtonAction(ActionEvent event) {
        try {
            outputLabel.setText(Double.parseDouble(textField.getText()) + " miles converts to " + (Double.parseDouble(textField.getText()) * 1.60934) + " kilometers");
        } catch (NumberFormatException e) {
            outputLabel.setText("Invalid input");
        }
    }

    @FXML
    protected void handleFahrenheitToCelsiusButtonAction(ActionEvent event) {
        try {
            outputLabel.setText(Double.parseDouble(textField.getText()) + " degrees farenheit converts to " + ((Double.parseDouble(textField.getText()) - 32) / (1.8)) + " celsius");
        } catch (NumberFormatException e) {
            outputLabel.setText("Invalid input");
        }
    }

    @FXML
    protected void handlePoundsToStoneButtonAction(ActionEvent event) {
        try {
            outputLabel.setText(Double.parseDouble(textField.getText()) + " pounds converts to " + (Double.parseDouble(textField.getText()) / 14) + " stone");
        } catch (NumberFormatException e) {
            outputLabel.setText("Invalid input");
        }
    }

    @FXML
    protected void handlePoundsToKgButtonAction(ActionEvent event) {
        try {
            outputLabel.setText((Double.parseDouble(textField.getText()) + " pounds converts to " + (Double.parseDouble(textField.getText()) / 2.20462) + " kilograms"));
        } catch (NumberFormatException e) {
            outputLabel.setText("Invalid input");
        }
    }

}