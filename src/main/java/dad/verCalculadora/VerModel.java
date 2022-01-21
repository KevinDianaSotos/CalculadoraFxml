package dad.verCalculadora;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class VerModel {
	
	private StringProperty pantallaText = new SimpleStringProperty();//CREAMOS LA STRINGPROPERTY DE LA PANTALLA DE RESULTADOS

	//CREAMOS LOS GET Y SET DEL STRING PROPERTY
	public StringProperty pantallaTextProperty() {
		return this.pantallaText;
	}
	

	public String getPantallaText() {
		return this.pantallaTextProperty().get();
	}
	

	public void setPantallaText(final String pantallaText) {
		this.pantallaTextProperty().set(pantallaText);
	}
	
	
}
