package data.dao;

import business.entities.Provider2;
import data.db.Row;
import data.db.Table;
import data.db.Tuple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cesar on 02/10/16.
 */
public class ProviderDao implements Dao<Provider2,Integer>{
    private Table table;

    public ProviderDao(){
        table = new Table("Provider2");
        System.out.println(this.toString());
    }

    @Override
    public int create(Provider2 provider) {
        List<Tuple> providers = new ArrayList<>();
        providers.add(new Tuple<String>("name",provider.getName()));
        providers.add(new Tuple<String>("address",provider.getAddress()));
        providers.add(new Tuple<String>("phone_number",provider.getPhoneNumber()));
        providers.add(new Tuple<String>("email",provider.getEmail()));

        return table.addRow(providers);
    }

    @Override
    public Provider2 read(Integer id) {
        return null;
    }

    @Override
    public List<Provider2> readAll() {
        List<Row> rows = table.getAllRows();
        List<Provider2> consumables = new ArrayList<>();

        for (Row row : rows) {
            Provider2 provider = new Provider2();
            for (Tuple tup : row.getTuples()) {
                switch (tup.getKey()) {
                    case "id":
                        provider.setId((Integer) tup.getValue());
                        break;
                    case "name":
                        provider.setName((String) tup.getValue());
                        break;
                    case "address":
                        provider.setAddress((String) tup.getValue());
                        break;
                    case "phone_number":
                        provider.setPhoneNumber((String) tup.getValue());
                        break;
                    case  "email":
                        provider.setEmail((String) tup.getValue());
                        break;
                    default:
                        break;
                }
            }
            consumables.add(provider);
        }
        return consumables;
    }

    @Override
    public int update(Provider2 provider) {
        return 0;
    }

    @Override
    public void delete(Provider2 provider) {

    }
}
