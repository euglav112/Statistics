package sample;

import dao.Dao;
import javafx.scene.control.ListView;
import plug.PlugDataSource;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;


public class Controller {
    Dao dao = new PlugDataSource(); // gkflnfkn

 //   ObservableList<Integer> items = dao.getListId();

//    @FXML
//    private ListView<Integer> ListId; // то, что должно выводиться в лист на экран




    @FXML
    private Button button;

    @FXML
    private Button button2;

    @FXML
    public void initialize(){
 //       ListId.setItems(dao.getListId());




        button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                button.setText("Thanks!");
            }
        });

        button2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                button2.setText("FUCK");
            }
        });
    }




}
