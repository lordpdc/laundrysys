package mx.uady.accsys.model.dao;

import mx.uady.accsys.model.bo.Consumable;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cesar on 03/09/16.
 */
public class ConsumableDao implements IConsumableDao {
    Connector connector;

    public ConsumableDao(Connector connector){
        this.connector = connector;
    }

    @Override
    public List<Consumable> getAllConsumables() {
        List<Consumable> consumables = new ArrayList<Consumable>();
        ResultSet rs = connector.executeQuery("SELECT * FROM laundrysys.consumable");
        try {
            while (rs.next()) {
                int idConsumable = rs.getInt(1);
                String name = rs.getString(2);
                String description = rs.getString(3);
                consumables.add(new Consumable(idConsumable, name, description));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return consumables;
    }

    @Override
    public Consumable getConsumable(int id) {
        ResultSet rs = connector.executeQuery("SELECT * FROM laundrysys.consumable WHERE id="+id);
        try {
            if (rs.next()){
                int idConsumable = rs.getInt(1);
                String name = rs.getString(2);
                String description = rs.getString(3);
                return new Consumable(idConsumable,name,description);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    @Override
    public Consumable getConsumable(String name) {

        return null;
    }

    @Override
    public int addConsumable(Consumable consumable) {
        return connector.executeStatement("INSERT INTO consumable (name, description)"+
                "VALUES ('"+consumable.getName()+"','"+consumable.getDescription()+"');");
    }

    @Override
    public void updateConsumable(Consumable consumable) {
        return;
    }

    @Override
    public void deleteConsumable(Consumable consumable) {

        return;
    }

}
