package data.dao;

import business.entities.Provider;
import data.db.Table;

/**
 * Created by cesar on 02/10/16.
 */
public class ProviderDao extends GenericDao<Provider> implements Dao<Provider>{

    public ProviderDao(){
        super("business.entities.Provider","Provider");
        System.out.println(this.toString());
    }
}
