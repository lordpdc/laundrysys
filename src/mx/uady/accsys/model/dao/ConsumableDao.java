package mx.uady.accsys.model.dao;

import mx.uady.accsys.model.bo.Consumable;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cesar on 03/09/16.
 */
public class ConsumableDao implements IConsumableDao {
    List<Consumable> consumables;
    Connector connector = new Connector();

    public ConsumableDao(){
        consumables = new ArrayList<Consumable>();
    }

    @Override
    public List<Consumable> getAllConsumables() {
        return consumables;
    }

    @Override
    public Consumable getConsumable(int id) {
        // TODO change for an actual search?
        return consumables.get(id);
    }

    @Override
    public void addConsumable(Consumable consumable) {
        Statement stmt = null;
        int rs;

        try {
            stmt = connector.getConnection().createStatement();
            rs = stmt.executeUpdate(
                    "INSERT INTO consumable (name, description)"+
                    "VALUES ('"+consumable.getName()+"','"+consumable.getDescription()+"');"
            );

            // or alternatively, if you don't know ahead of time that
            // the query will be a SELECT...
            /*
            if (stmt.execute("SELECT foo FROM bar")) {
                rs = stmt.getResultSet();
            }*/

            // Now do something with the ResultSet ....
        }
        catch (SQLException ex){
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

    @Override
    public void updateConsumable(Consumable consumable) {
        consumables.get(consumable.getId()).setName(consumable.getName());
    }

    @Override
    public void deleteConsumable(Consumable consumable) {
        consumables.remove(consumable.getId());
    }

}
