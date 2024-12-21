package Controller;

import DBConnecion.DB_connection;
import Model.Items;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class view_items_form {
    public TableView Itemstable;
    public TableColumn colname;
    public TableColumn colqty;
    public TableColumn coltotal;
    public TableColumn coldis;
    public TableColumn itemcode;
    public TableColumn colcode;

    public void btnRelordOnAction(ActionEvent actionEvent)  {
        ObservableList<Items> observableItemsList = FXCollections.observableArrayList();
        colcode.setCellValueFactory(new PropertyValueFactory<>("id"));
        colname.setCellValueFactory(new PropertyValueFactory<>("name"));
        colqty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        coltotal.setCellValueFactory(new PropertyValueFactory<>("amount"));
        coldis.setCellValueFactory(new PropertyValueFactory<>("discrioption"));

        DB_connection.getInstance().getConnection().forEach(obj ->{
            observableItemsList.add(obj);
        });
        Itemstable.setItems(observableItemsList);
    }
}
