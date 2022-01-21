package dad.verCalculadora;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class VerController implements Initializable {
	private Calculadora calc = new Calculadora();
	private VerModel model = new VerModel();
	
	@FXML
	private GridPane view;
	@FXML
	private TextField pantallaText;
	
	public VerController() throws IOException {//CARGAMOS EL VIEW.FXML DONDE ESTA LA VISTA
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	public GridPane getView() {//RETORNAMOS LA VISTA
		return view;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		model.pantallaTextProperty().bindBidirectional(pantallaText.textProperty());
		
		MenuItem clasicoItem = new MenuItem("Clásica");
        clasicoItem.setOnAction(e->{
        	view.getStylesheets().clear();
        	view.getStylesheets().add("/css/clasica.css");
            System.out.println("clasica");
        });

        MenuItem modernoItem = new MenuItem("Moderna");
        modernoItem.setOnAction(e->{
        	view.getStylesheets().clear();
        	view.getStylesheets().add("/css/moderna.css");
            System.out.println("moderna");
        });
        
        ContextMenu menu = new ContextMenu(clasicoItem, modernoItem);
        view.setOnContextMenuRequested(e->{
            menu.show(view, e.getScreenX(),e.getScreenY());
        });
	}
	//REALIZAMOS LOS ONBUTTON PARA QUE HAGAN LA ACCION , EN ESTE CASO DE TODOS LOS BOTONES
	@FXML
	public void onCButtonAction(ActionEvent event) {
		calc.borrar();
		model.setPantallaText(calc.getPantalla());
	}
	
	

	@FXML
	public void onIgualButtonAction(ActionEvent event) {
		calc.operar(Calculadora.IGUAL);
		model.setPantallaText(calc.getPantalla());
	}
	
	@FXML
	public void onDividirButtonAction(ActionEvent event) {
		calc.operar(Calculadora.DIVIDIR);
		model.setPantallaText(calc.getPantalla());
	}
	
	@FXML
	public void onSumarButtonAction(ActionEvent event) {
		calc.operar(Calculadora.SUMAR);
		model.setPantallaText(calc.getPantalla());
	}

	@FXML
	public void onMultiplicarButtonAction(ActionEvent event) {
		calc.operar(Calculadora.MULTIPLICAR);
		model.setPantallaText(calc.getPantalla());
	}
	
	@FXML
	public void onRestaButtonAction(ActionEvent event) {
		calc.operar(Calculadora.RESTAR);
		model.setPantallaText(calc.getPantalla());
	}
	
	@FXML
	public void onCEButtonAction(ActionEvent event) {
		calc.borrarTodo();
		model.setPantallaText(calc.getPantalla());
	}

	
	@FXML
	public void onComaButtonAction(ActionEvent event) {
		calc.insertarComa();
		model.setPantallaText(calc.getPantalla());
	}
	
	//EN CADA UNO DE ELLOS LLAMAMOS AL METODO INSERTAR DE CALCULADORA() Y INSERTAMOS EL NUMERO
	//DESPUES LLAMAMOS AL MODELO Y HACEMOS EL SET Y LE PASAMOS LO QUE HAY EN PANTALLA QUE SERIA EL NUMERO
	
	@FXML
	public void onCeroButtonAction(ActionEvent event) {
		calc.insertar('0');
		model.setPantallaText(calc.getPantalla());
	}

	@FXML
	public void onNueveButtonAction(ActionEvent event) {
		calc.insertar('9');
		model.setPantallaText(calc.getPantalla());
	}

	@FXML
	public void onOchoButtonAction(ActionEvent event) {
		calc.insertar('8');
		model.setPantallaText(calc.getPantalla());
	}

	@FXML
	public void onSieteButtonAction(ActionEvent event) {
		calc.insertar('7');
		model.setPantallaText(calc.getPantalla());
	}
	
	@FXML
	public void onSeisButtonAction(ActionEvent event) {
		calc.insertar('6');
		model.setPantallaText(calc.getPantalla());
	}
	
	@FXML
	public void onCincoButtonAction(ActionEvent event) {
		calc.insertar('5');
		model.setPantallaText(calc.getPantalla());
	}
	
	@FXML
	public void onCuatroButtonAction(ActionEvent event) {
		calc.insertar('4');
		model.setPantallaText(calc.getPantalla());
	}


	@FXML
	public void onTresButtonAction(ActionEvent event) {
		calc.insertar('3');
		model.setPantallaText(calc.getPantalla());
	}

	@FXML
	public void onDosButtonAction(ActionEvent event) {
		calc.insertar('2');
		model.setPantallaText(calc.getPantalla());
	}
	
	@FXML
	public void onUnoButtonAction(ActionEvent event) {
		calc.insertar('1');
		model.setPantallaText(calc.getPantalla());
	}
	


}
