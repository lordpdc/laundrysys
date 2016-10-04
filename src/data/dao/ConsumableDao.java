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
public class ConsumableDao implements Dao<Consumable,Integer> {
    private Table consumableTable;

    public ConsumableDao(){
        consumableTable = new Table("consumable");
    }

    @Override
    public int create(Consumable consumable) {
        List<Tuple> consumableTuple = new ArrayList<>();
        consumableTuple.add(new Tuple<String>("name",consumable.getName()));
        consumableTuple.add(new Tuple<String>("description",consumable.getDescription()));

        return consumableTable.addRow(consumableTuple);
    }

    @Override
    public Consumable read(Integer id) {
        Row row = consumableTable.getRow(id);
        Consumable consumable = new Consumable();

        for (Tuple tup: row.getTuples()){
            switch (tup.getKey()){
                case "id":
                    consumable.setId((Integer) tup.getValue());
                    break;
                case "name":
                    consumable.setName((String) tup.getValue());
                    break;
                case "description":
                    consumable.setDescription((String) tup.getValue());
                    break;
                default:
                    break;
            }
        }
        return consumable;
    }

    @Override
    public List<Consumable> readAll() {
        List<Row> rows = consumableTable.getAllRows();
        List<Consumable> consumables = new ArrayList<>();

        for (Row row : rows) {
            Consumable consumable = new Consumable();
            for (Tuple tup : row.getTuples()) {
                switch (tup.getKey()) {
                    case "id":
                        consumable.setId((Integer) tup.getValue());
                        break;
                    case "name":
                        consumable.setName((String) tup.getValue());
                        break;
                    case "description":
                        consumable.setDescription((String) tup.getValue());
                        break;
                    default:
                        break;
                }
            }
            consumables.add(consumable);
        }
        return consumables;
    }

    @Override
    public int update(Consumable consumable) {
        return 0;
    }

    @Override
    public void delete(Consumable consumable) {

    }
}
