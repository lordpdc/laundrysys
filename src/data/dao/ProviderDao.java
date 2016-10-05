package data.dao;

import business.entities.Provider;

/**
 * Created by cesar on 02/10/16.
 */
public class ProviderDao extends GenericDao<Provider> implements Dao<Provider>{
    private static final String entityClassName = "business.entities.Provider";
    private static final String tableName = "Provider";

    public ProviderDao(){
        super(entityClassName,tableName);
        System.out.println(this.toString());
    }
}
