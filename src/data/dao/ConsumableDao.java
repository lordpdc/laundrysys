package data.dao;

import business.entities.Consumable;
import data.db.Row;
import data.db.Table;
import data.db.Tuple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cesar on 03/09/16.
 */
public class ConsumableDao extends GenericDao<Consumable> implements Dao<Consumable> {

    public ConsumableDao(){
        super("business.entities.Consumable","consumable");
    }

}
