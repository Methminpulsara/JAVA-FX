package DBConnecion;

import Model.Items;
import java.util.ArrayList;
import java.util.List;

public class DB_connection {

    private static DB_connection db_connection;
    private List <Items>  itemsList ;


    //Singelten  wlt Cunstructer ek private krnnh oonee
    private DB_connection(){
        itemsList = new ArrayList<>();
    }
    public List<Items> getConnection(){
        return itemsList;
    }
    public static DB_connection getInstance(){
        return db_connection == null ? db_connection= new DB_connection() : db_connection;
    }


}
