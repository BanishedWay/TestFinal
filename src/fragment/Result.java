package fragment;

import javafx.beans.property.SimpleStringProperty;

public class Result {
    private SimpleStringProperty videoProperty = new SimpleStringProperty();
    private SimpleStringProperty resultProperty = new SimpleStringProperty();

    public Result() {
        this.videoProperty = null;
        this.resultProperty = null;
    }

    public Result(String videoType, String result) {
        this.videoProperty = new SimpleStringProperty(videoType);
        this.resultProperty = new SimpleStringProperty(result);
    }

    public String getVideoType() {
        return this.videoProperty.get();
    }

    public String getResult() {
        return this.resultProperty.get();
    }

    public SimpleStringProperty getResultProperty() {
        return this.resultProperty;
    }
    public SimpleStringProperty getVideoProperty() {
        return this.videoProperty;
    }

    public void setVideoType(String videoType) {
        this.videoProperty.set(videoType);
    }

    public void setResultType(String resultType) {
        this.resultProperty.set(resultType);
    }

}
