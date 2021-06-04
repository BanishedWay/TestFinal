package fragment;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ResultController implements Initializable {
    @FXML
    private Button btn_save;
    @FXML
    private TableView<Result> table;
    String video="test1.mov";
    String result="fire";

    ObservableList<Result> list = FXCollections.observableArrayList();
    TableColumn<Result,String> videoColumn1=new TableColumn<>("测试视频");
    TableColumn<Result,String> videoColumn2=new TableColumn<>("测试结果");


    @FXML
    public void event_btn_save(ActionEvent event) throws IOException {
        FileChooser fileChooser=new FileChooser();
        fileChooser.setTitle("保存文件");
        File file=fileChooser.showSaveDialog(new Stage());
        BufferedWriter bw=new BufferedWriter(new FileWriter(String.valueOf(file)));
        bw.write(" \n");
        bw.newLine();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Result videoType1=new Result("test1.mp4","fire");
        list.add(videoType1);
        videoColumn1.setCellValueFactory(cellData->cellData.getValue().getVideoProperty());
        videoColumn2.setCellValueFactory(cellData->cellData.getValue().getResultProperty());
        table.setItems(list);
        table.getColumns().addAll(videoColumn1,videoColumn2);
    }
}
