package fragment;

import javafx.beans.property.SimpleStringProperty;

public class ModelType {
	private SimpleStringProperty modelName = new SimpleStringProperty();

	public ModelType() {
		this.modelName = null;
	}

	public ModelType(String modelString) {
		this.modelName = new SimpleStringProperty(modelString);
	}

	public String getModelName() {
		return this.modelName.get();
	}

	public SimpleStringProperty getModelProperty() {
		return this.modelName;
	}

	public void setModelType(String modelName) {
		this.modelName.set(modelName);
	}

}
