package Controller;

import DBConnecion.DB_connection;
import Model.Items;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class add_items_form {

    public TextField Tcode;
    public TextField Tname;
    public TextField Tqty;
    public TextField Tprice;
    public TextArea Tdis;






    public void btnAddOnAction(ActionEvent actionEvent) {

        String id = Tcode.getText();
        String name = Tname.getText();
        int  qty = Integer.parseInt(Tqty.getText());
        double price = Double.parseDouble(Tprice.getText());
        String dis = Tdis.getText();

        System.out.println(id +" "+name+" "+qty +" "+price +" "+dis+"\n");

        DB_connection.getInstance().getConnection().add(new Items(id,name,qty,price,dis));


    }

    public void tbnViewOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/view_items_form.fxml"))));
        stage.show();
    }
}
