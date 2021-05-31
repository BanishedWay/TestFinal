package fragment;

import javafx.beans.property.SimpleStringProperty;

public class VideoType {
	private SimpleStringProperty videoProperty = new SimpleStringProperty();

	public VideoType() {
		this.videoProperty = null;
	}

	public VideoType(String videoType) {
		this.videoProperty = new SimpleStringProperty(videoType);
	}

	public String getVideoType() {
		return this.videoProperty.get();
	}

	public SimpleStringProperty getVideoProperty() {
		return this.videoProperty;
	}

	public void setVideoType(String videoType) {
		this.videoProperty.set(videoType);
	}
}
